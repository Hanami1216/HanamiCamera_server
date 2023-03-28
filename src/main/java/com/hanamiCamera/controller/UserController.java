package com.hanamiCamera.controller;

import com.hanamiCamera.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/27  18:20
 */

@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/getUserList")
    User getAll(){
        return new User();
    }
}
