package com.sss.controller;

import com.sss.model.UserModel;
import com.sss.service.UserService;
import com.sss.tools.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author Lenovo
 * @Created 2018-08-09 14:19
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    public String getUserList(HttpServletRequest request, UserModel userModel, Integer pageSize, Integer currentPage) {
        PageInfo<UserModel> page = userService.findPage(userModel, pageSize, currentPage);
        request.setAttribute("page", page);
        return "list";
    }

    @RequestMapping("/home")
    public String index() {
        return "home";
    }

//    @RequestMapping("/list")
//    public String list() {
//        return "list";
//    }

    @RequestMapping("/insertOne")
    @ResponseBody
    public String insertOne(UserModel data) {

        data.setAddTime(new Date())
                .setPassWord("123456")
                .setPhone("12345678978946")
                .setStatus(1)
                .setUserName("tom");
        UserModel userModel = userService.insertUser(data);
        if (userModel == null) {
            return "0";
        }
        return "1";
    }
}
