package com.example.messagingpro.WebSocketController;

import com.example.messagingpro.DTO.MessageSDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSockTextMessageController {
    @Autowired
    SimpMessagingTemplate template;
    @PostMapping("/send")
    public ResponseEntity<Void> sendMessage(@RequestBody MessageSDto messageSDto) {
        template.convertAndSend("/topic/message", messageSDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @MessageMapping("/sendMessage")
    public void receiveMessage (@Payload MessageSDto messageSDto){
        // message reçu
    }

    @SendTo("/topic/message")
    public MessageSDto broadcastMessage(@Payload MessageSDto messageSDto){
        return messageSDto;
    }

}
