package binhtt.appchat.dev.controllers;

import binhtt.appchat.dev.bean.MessageBean;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/user_all")
    @SendTo("/topic/user")
    public MessageBean send(@Payload MessageBean messageBean){
        return messageBean;
    }
}
