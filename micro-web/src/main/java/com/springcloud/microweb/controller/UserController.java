package com.springcloud.microweb.controller;

import com.springcloud.microweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public String queryUser() {
        return userService.queryContents();
    }

    public static boolean canVisitDb = true;
    /*
    * 这个接口只为了检测db连接是否ok
    * */
    @RequestMapping("/db/{can}")
    public void setDb(@PathVariable boolean can) {
        canVisitDb = can;
    }
}
