package cn.com.inhand.dn4.oauth2.common;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Deprecated
public class SendClientAuthz {
    public String getToken(String localUrl, String remoteUrl, String clientID, String clientSecret) throws OAuthSystemException, OAuthProblemException, JSONException {
        OAuthClientRequest request = OAuthClientRequest.tokenLocation(remoteUrl)
                .setGrantType(GrantType.CLIENT_CREDENTIALS).setClientId(clientID).setClientSecret(clientSecret).setRedirectURI(localUrl).buildBodyMessage();
        // 得到访问令牌,刷新令牌,有效期等信息
        OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
        Class<? extends OAuthAccessTokenResponse> cl = OAuthJSONAccessTokenResponse.class;
        OAuthAccessTokenResponse oauthResponse = null;
        try {
            oauthResponse = oAuthClient.accessToken(request, cl);
        } catch (OAuthProblemException e) {
            JSONObject json = new JSONObject();
            json.put("error", "INVALID_CLIENT");
            json.put("error_code", "21324");
            json.put("error_description", "client_id or client_secret is invalid");
            String errorJSON = json.toString();
            return errorJSON;
        }

        JSONObject json = new JSONObject();
        json.put("accessToken", oauthResponse.getAccessToken());
        json.put("expiresIn", oauthResponse.getExpiresIn());
        json.put("refreshToken", oauthResponse.getRefreshToken());
        json.put("scope", oauthResponse.getScope());
        return json.toString();
    }

}
