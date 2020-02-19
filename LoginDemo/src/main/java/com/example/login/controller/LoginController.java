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
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/login")
    public String login(HttpServletRequest request){
        if (request.getSession().getAttribute("user") != null) {
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam(name = "username") String username,
                          @RequestParam(name = "password") String password,
                          Model model,
                          HttpServletRequest request){
        User dbUser = userMapper.selectByUsername(username);
        if (dbUser == null) {
            model.addAttribute("msg", "用户不存在");
            return "login";
        }
        if (!dbUser.getPassword().equals(password)) {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
        request.getSession().setAttribute("user", username);
        return "redirect:/";
    }
}
