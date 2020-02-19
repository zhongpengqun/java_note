package com.example.login.controller;

import com.example.login.mapper.UserMapper;
import com.example.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: Davion
 * Date: 2019-10-9
 * Description:
 */
@Controller
public class RegisterController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/register")
    public String register(HttpServletRequest request) {
        if (request.getSession().getAttribute("user") != null) {
            return "redirect:/";
        }
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(@RequestParam(name = "username") String username,
                             @RequestParam(name = "password") String password,
                             @RequestParam(name = "repassword") String repassword,
                             Model model) {
        if (!password.equals(repassword)) {
            model.addAttribute("msg", "密码输入不一致");
            return "register";
        }
        User dbUser = userMapper.selectByUsername(username);
        if (dbUser != null) {
            model.addAttribute("msg", "用户已存在");
            return "register";
        }
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        userMapper.createNewUser(newUser);
        return "redirect:/";
    }
}
