package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author zxc
 * @date 2020/12/16 - 16:22
 */
@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {
        if(username != null && username != "" && "123".equals(password)){
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名密码错误");
            return "login";
        }
    }
}
