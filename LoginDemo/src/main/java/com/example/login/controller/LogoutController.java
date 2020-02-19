package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: Davion
 * Date: 2019-10-9
 * Description:
 */
@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        if (request.getSession().getAttribute("user") != null) {
            request.getSession().removeAttribute("user");
        }
        return "redirect:/";
    }
}
