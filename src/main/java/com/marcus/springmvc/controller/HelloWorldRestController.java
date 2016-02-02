package com.marcus.springmvc.controller;

/**
 * @author marcus
 */

import com.marcus.springmvc.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldRestController {

    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {

        Message msg = new Message(player, "Hello " + player);
        return msg;
    }

}