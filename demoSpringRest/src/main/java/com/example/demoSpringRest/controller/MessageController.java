package com.example.demoSpringRest.controller;

import com.example.demoSpringRest.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    @ResponseBody
    @GetMapping("/message")
    Message send(){
        return new Message("first message");
    }
}
