package com.hanamiCamera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/27  18:20
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/getUserList")
    String getAll() {

        return "123";
    }
}
