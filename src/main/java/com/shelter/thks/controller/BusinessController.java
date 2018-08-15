package com.shelter.thks.controller;

import com.shelter.thks.service.UserService;
import com.shelter.thks.vo.Result;
import com.shelter.thks.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by calling on 2018/8/15.
 */
@RestController
@RequestMapping("/business/")
public class BusinessController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getInfo")
    public Result<UserInfo> getUserInfo() {
        return new Result<>(userService.getUserInfo());
    }
}
