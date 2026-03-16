package com.jupitters.chat_app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }
}
