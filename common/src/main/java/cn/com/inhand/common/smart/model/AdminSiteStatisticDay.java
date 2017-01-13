/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com.inhand.common.smart.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author liqiang
 */
public class AdminSiteStatisticDay {
    @Id
    @JsonProperty("_id")
    private ObjectId id;	              //唯一标识
    private ObjectId oid;	              //机构ID 
    
    private String orgName;                //机构简称
       
    private Long amountOnLine;            //线上金额
    private Long sumOnLine;               //线上笔数
    private Long amountOutLine;           //线下金额
    private Long sumOutLine;              //线下笔数
    private Long amount;                  //总金额
    private Long sum;                     //总笔数
    private Long wechatAmount;            //微信金额
    private Long alipayAmount;            //支付宝金额
    private Long baifubaoAmount;          //百付宝金额
    private Long alipaySoundWaveAmount;   //支付宝声波支付金额
    private Long otherAmount;             //现金支付金额
    private Long swingCardAmount;               //刷卡金额
    private Long oneCardsolutionAmount;   //一卡通金额
    private Long agriculturalBankAmount;  //农行掌银支付金额
    private Long posMachineAmount;        // POS机支付金额
    private Long gameAmount;              //游戏抽奖金额
    private Long otherPayStyleAmount;     //其他支付方式金额(6 扫胸牌,7 取货码,8 游戏...)
    private Long vipPayAmount;            //会员支付金额
    private Long bestPayAmount;            //翼支付金额
    private Long jdpayAmount;            //京东支付金额
    public Long wechatBarcodeAmount;    //微信反扫金额
    public Long alipayBarcodeAmount;   //支付宝反扫金额
    public Long unionpayAmount; //银联支付金额
    
    public Long unionpaySum; //银联支付笔数
    
    private Long wechatSum;               //微信笔数
    private Long alipaySum;               //支付宝笔数
    private Long baifubaoSum;             //百付宝笔数
    private Long alipaySoundWaveSum;      //支付宝声波支付笔数
    private Long otherSum;                //现金笔数
    private Long swingCardSum;               //刷卡笔数
    private Long oneCardsolutionSum;       //一卡通笔数
    private Long agriculturalBankSum;      //农行掌银支付笔数
    private Long posMachineSum;            // POS机支付笔数
    private Long gameSum;                 //游戏抽奖笔数
    private Long otherPayStyleSum;         //其他支付方式笔数
    private Long vipPaySum;              //会员支付笔数
    private Long bestPaySum;              //翼支付笔数
    private Long jdpaySum;              //京东支付笔数
    public Long wechatBarcodeSum;     //微信反扫笔数
    public Long alipayBarcodeSum;    //支付宝反扫笔数
    
    private Long statisticTime;
    private Long createTime;
    private Long updateTime;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Long getUnionpayAmount() {
        return unionpayAmount;
    }

    public void setUnionpayAmount(Long unionpayAmount) {
        this.unionpayAmount = unionpayAmount;
    }

    public Long getUnionpaySum() {
        return unionpaySum;
    }

    public void setUnionpaySum(Long unionpaySum) {
        this.unionpaySum = unionpaySum;
    }

    
    
    public Long getWechatBarcodeAmount() {
        return wechatBarcodeAmount;
    }

    public void setWechatBarcodeAmount(Long wechatBarcodeAmount) {
        this.wechatBarcodeAmount = wechatBarcodeAmount;
    }

    public Long getAlipayBarcodeAmount() {
        return alipayBarcodeAmount;
    }

    public void setAlipayBarcodeAmount(Long alipayBarcodeAmount) {
        this.alipayBarcodeAmount = alipayBarcodeAmount;
    }

    public Long getWechatBarcodeSum() {
        return wechatBarcodeSum;
    }

    public void setWechatBarcodeSum(Long wechatBarcodeSum) {
        this.wechatBarcodeSum = wechatBarcodeSum;
    }

    public Long getAlipayBarcodeSum() {
        return alipayBarcodeSum;
    }

    public void setAlipayBarcodeSum(Long alipayBarcodeSum) {
        this.alipayBarcodeSum = alipayBarcodeSum;
    }

    
    
    public Long getJdpayAmount() {
        return jdpayAmount;
    }

    public void setJdpayAmount(Long jdpayAmount) {
        this.jdpayAmount = jdpayAmount;
    }

    public Long getJdpaySum() {
        return jdpaySum;
    }

    public void setJdpaySum(Long jdpaySum) {
        this.jdpaySum = jdpaySum;
    }

    

    
    public Long getBestPayAmount() {
        return bestPayAmount;
    }

    public void setBestPayAmount(Long bestPayAmount) {
        this.bestPayAmount = bestPayAmount;
    }

    public Long getBestPaySum() {
        return bestPaySum;
    }

    public void setBestPaySum(Long bestPaySum) {
        this.bestPaySum = bestPaySum;
    }

    
    public Long getGameAmount() {
        return gameAmount;
    }

    public void setGameAmount(Long gameAmount) {
        this.gameAmount = gameAmount;
    }

    public Long getGameSum() {
        return gameSum;
    }

    public void setGameSum(Long gameSum) {
        this.gameSum = gameSum;
    }

    public Long getSwingCardAmount() {
        return swingCardAmount;
    }

    public void setSwingCardAmount(Long swingCardAmount) {
        this.swingCardAmount = swingCardAmount;
    }

    public Long getOneCardsolutionAmount() {
        return oneCardsolutionAmount;
    }

    public void setOneCardsolutionAmount(Long oneCardsolutionAmount) {
        this.oneCardsolutionAmount = oneCardsolutionAmount;
    }

    public Long getAgriculturalBankAmount() {
        return agriculturalBankAmount;
    }

    public void setAgriculturalBankAmount(Long agriculturalBankAmount) {
        this.agriculturalBankAmount = agriculturalBankAmount;
    }

    public Long getPosMachineAmount() {
        return posMachineAmount;
    }

    public void setPosMachineAmount(Long posMachineAmount) {
        this.posMachineAmount = posMachineAmount;
    }

    public Long getOtherPayStyleAmount() {
        return otherPayStyleAmount;
    }

    public void setOtherPayStyleAmount(Long otherPayStyleAmount) {
        this.otherPayStyleAmount = otherPayStyleAmount;
    }

    public Long getSwingCardSum() {
        return swingCardSum;
    }

    public void setSwingCardSum(Long swingCardSum) {
        this.swingCardSum = swingCardSum;
    }

    public Long getOneCardsolutionSum() {
        return oneCardsolutionSum;
    }

    public void setOneCardsolutionSum(Long oneCardsolutionSum) {
        this.oneCardsolutionSum = oneCardsolutionSum;
    }

    public Long getAgriculturalBankSum() {
        return agriculturalBankSum;
    }

    public void setAgriculturalBankSum(Long agriculturalBankSum) {
        this.agriculturalBankSum = agriculturalBankSum;
    }

    public Long getPosMachineSum() {
        return posMachineSum;
    }

    public void setPosMachineSum(Long posMachineSum) {
        this.posMachineSum = posMachineSum;
    }

    public Long getOtherPayStyleSum() {
        return otherPayStyleSum;
    }

    public void setOtherPayStyleSum(Long otherPayStyleSum) {
        this.otherPayStyleSum = otherPayStyleSum;
    }

    public ObjectId getId() {
        return id;
    }


    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getOid() {
        return oid;
    }

    public void setOid(ObjectId oid) {
        this.oid = oid;
    }


    public Long getAmountOnLine() {
        return amountOnLine;
    }

    public void setAmountOnLine(Long amountOnLine) {
        this.amountOnLine = amountOnLine;
    }

    public Long getSumOnLine() {
        return sumOnLine;
    }

    public void setSumOnLine(Long sumOnLine) {
        this.sumOnLine = sumOnLine;
    }

    public Long getAmountOutLine() {
        return amountOutLine;
    }

    public void setAmountOutLine(Long amountOutLine) {
        this.amountOutLine = amountOutLine;
    }

    public Long getSumOutLine() {
        return sumOutLine;
    }

    public void setSumOutLine(Long sumOutLine) {
        this.sumOutLine = sumOutLine;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Long getWechatAmount() {
        return wechatAmount;
    }

    public void setWechatAmount(Long wechatAmount) {
        this.wechatAmount = wechatAmount;
    }

    public Long getAlipayAmount() {
        return alipayAmount;
    }

    public void setAlipayAmount(Long alipayAmount) {
        this.alipayAmount = alipayAmount;
    }

    public Long getBaifubaoAmount() {
        return baifubaoAmount;
    }

    public void setBaifubaoAmount(Long baifubaoAmount) {
        this.baifubaoAmount = baifubaoAmount;
    }

    public Long getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(Long otherAmount) {
        this.otherAmount = otherAmount;
    }

    public Long getWechatSum() {
        return wechatSum;
    }

    public void setWechatSum(Long wechatSum) {
        this.wechatSum = wechatSum;
    }

    public Long getAlipaySum() {
        return alipaySum;
    }

    public void setAlipaySum(Long alipaySum) {
        this.alipaySum = alipaySum;
    }

    public Long getBaifubaoSum() {
        return baifubaoSum;
    }

    public void setBaifubaoSum(Long baifubaoSum) {
        this.baifubaoSum = baifubaoSum;
    }

    public Long getOtherSum() {
        return otherSum;
    }

    public void setOtherSum(Long otherSum) {
        this.otherSum = otherSum;
    }

    public Long getStatisticTime() {
        return statisticTime;
    }

    public void setStatisticTime(Long statisticTime) {
        this.statisticTime = statisticTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getAlipaySoundWaveAmount() {
        return alipaySoundWaveAmount;
    }

    public void setAlipaySoundWaveAmount(Long alipaySoundWaveAmount) {
        this.alipaySoundWaveAmount = alipaySoundWaveAmount;
    }

    public Long getAlipaySoundWaveSum() {
        return alipaySoundWaveSum;
    }

    public void setAlipaySoundWaveSum(Long alipaySoundWaveSum) {
        this.alipaySoundWaveSum = alipaySoundWaveSum;
    }

    public Long getVipPayAmount() {
        return vipPayAmount;
    }

    public void setVipPayAmount(Long vipPayAmount) {
        this.vipPayAmount = vipPayAmount;
    }

    public Long getVipPaySum() {
        return vipPaySum;
    }

    public void setVipPaySum(Long vipPaySum) {
        this.vipPaySum = vipPaySum;
    }
}
