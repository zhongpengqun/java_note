package com.example.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.login.model.Word;
import com.example.login.model.User;
import com.example.login.mapper.WordMapper;
import com.example.login.mapper.UserMapper;

import javax.annotation.PostConstruct;
import cn.org.rapid_framework.freemarker.directive.BlockDirective;
import cn.org.rapid_framework.freemarker.directive.ExtendsDirective;
import cn.org.rapid_framework.freemarker.directive.OverrideDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Pengqun Zhong
 * Date: 2019-10-9
 * Description:
 */
@Controller
public class WordController {
/*
    @GetMapping("/words")
    public ModelAndView words(ModelAndView modelAndView){
        modelAndView.setViewName("words");
        
        List<String> wordList=new ArrayList<String>();
        wordList.add("admin");
        wordList.add("user1");
        wordList.add("user2");
        
        modelAndView.addObject("wordList", wordList);
        return modelAndView;
    }
*/

   @Autowired
   private WordMapper wordMapper;

   @Autowired
   freemarker.template.Configuration configuration;

    @PostConstruct
    public void setSharedVariable(){
        configuration.setSharedVariable("block", new BlockDirective());
        configuration.setSharedVariable("override", new OverrideDirective());
        configuration.setSharedVariable("extends", new ExtendsDirective());
    }

   @RequestMapping("/words")
   public String words(Model model){
        List<Word> wordList = wordMapper.words();
        model.addAttribute("wordList", wordList);
        return "words";
    }



    @RequestMapping("/test")
    public String index(Model model) {
        return "test";
    }
}

