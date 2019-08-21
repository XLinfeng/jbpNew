package org.feng.jbp.authority.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统登录相关Controller
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String sysLogin(){
        return "auth/login";
    }
}
