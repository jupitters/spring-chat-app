package com.jupitters.chat_app.controller;

import com.jupitters.chat_app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ChatController {
    @MessageMapping("/send-message")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }

    @MessageMapping("/confetti")
    @SendTo("/topic/confetti")
    public Map<String, String> sendConfetti(Map<String, String> message) {
        return message;
    }

    @MessageMapping("/audio")
    @SendTo("/topic/audio")
    public Map<String, String> sendAudio(Map<String, String> message) {
        return message;
    }
}
