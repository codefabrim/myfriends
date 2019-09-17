package com.example.demoSpringRest.controller;

import com.example.demoSpringRest.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @ResponseBody
    @GetMapping("/message")
    Message send(){
        return new Message("first message");
    }


    @PostMapping("/message")
    Message echo(@RequestBody Message message){
        return message;
    }
}
