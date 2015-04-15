package com.angeliquehenry.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
//@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/api")
    @ResponseBody
    String home() {
        return "\nHello World!";
    }

    //public static void main(String[] args) throws Exception {
    //    SpringApplication.run(HelloController.class, args);
    //}
}