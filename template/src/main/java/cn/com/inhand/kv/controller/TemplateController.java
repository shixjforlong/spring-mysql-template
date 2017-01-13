package cn.com.inhand.kv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.inhand.common.dto.OnlyResultDTO;
import cn.com.inhand.kv.dao.UserDAO;
import cn.com.inhand.kv.dto.UserBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import shixj.test.model.User;

@Controller
@RequestMapping("sapi/user")
public class TemplateController {
	 private final static Logger logger = LoggerFactory.getLogger(TemplateController.class);
	 @Autowired
         private UserDAO userService;
         @Autowired
         ObjectMapper mapper;
         
         /**
          * 查询所有
          * @return 
          */
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
         public
         @ResponseBody
         Object template() {
             List<User> user = userService.getAllUser();
	     OnlyResultDTO result = new OnlyResultDTO();
	     result.setResult(user);
	     return result;
         }
         /**
          * 添加
          * @param bean
          * @return 
          */
         @RequestMapping(value = "/add", method = RequestMethod.POST)
         public @ResponseBody
         Object createUser(
           @Valid @RequestBody UserBean bean) {
            User user = mapper.convertValue(bean, User.class);
            userService.addUser(user);
            OnlyResultDTO result = new OnlyResultDTO();
            result.setResult("success");
            return result;
         }
         /**
          * 根据用户id查询用户信息
          * @param id
          * @return 
          */
         @RequestMapping(value = "/{id}", method = RequestMethod.GET)
         public @ResponseBody
         Object getUserById(@PathVariable int id) {
            User user = userService.getUserById(id);
            OnlyResultDTO result = new OnlyResultDTO();
            result.setResult(user);
            return result;
         }
}
