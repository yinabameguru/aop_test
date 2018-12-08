package com.jza.aop_test.websocket;

import java.security.Principal;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSocketController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public SocketResponse say(SocketMessage message) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(3);
        return new SocketResponse("welcome " + message.getName());
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("jza")) {
            simpMessagingTemplate.convertAndSendToUser("zjq", "/queue/notifications", msg);
        } else {
            simpMessagingTemplate.convertAndSendToUser("jza", "/queue/notifications", msg);
        }
    }
}
