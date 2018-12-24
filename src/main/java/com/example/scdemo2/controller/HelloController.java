package com.example.scdemo2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/role")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN') or hasAnyAuthority('ROLE_HOME')")
    public String role() {
        return "role";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin/admin";
    }
}
