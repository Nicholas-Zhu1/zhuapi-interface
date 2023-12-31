package com.zhu.zhuapiinterface.controller;


import com.zhu.clientsdk.Model.User;
import org.springframework.web.bind.annotation.*;


/**
 * 名称 API
 *
 * @author ZHU
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user) {
        return "POST 用户名字是" + user.getName();
    }
}
