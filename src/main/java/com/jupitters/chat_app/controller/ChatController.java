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

    @MessageMapping("/confete")
    @SendTo("/topic/confete")
    public Map<String, String> enviarConfete(Map<String, String> mensagem) {
        return mensagem;
    }
}
