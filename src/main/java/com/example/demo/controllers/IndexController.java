package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @RequestMapping(value="/savedata",method= RequestMethod.POST)
    @ResponseBody
    public User save(@RequestParam("email") String email, @RequestParam("password") String password)
    {
        System.out.println(email);
        System.out.println(password);
        return userService.createUSer(email,password);

    }

}
