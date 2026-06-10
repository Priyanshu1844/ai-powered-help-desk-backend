package com.substring.helpdesk.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@RequiredArgsConstructor

public class AIService {

    private final ChatClient chatClient;

    public String getResponseFromAssistant(String query){
        return this.chatClient
                .prompt()
                .user(query)
                .call()
                .content();
    }
}
