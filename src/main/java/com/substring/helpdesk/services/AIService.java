package com.substring.helpdesk.services;

import com.substring.helpdesk.tools.EmailTool;
import com.substring.helpdesk.tools.TicketDatabaseTool;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@RequiredArgsConstructor

public class AIService {

    private final ChatClient chatClient;
    private final TicketDatabaseTool ticketDatabaseTool;
    private final EmailTool emailTool;
    @Value("classpath:/helpdesk-system.st")
    private Resource systemPromptResource;


    public String getResponseFromAssistant(String query,String conversationId){
        return this.chatClient
                .prompt()
                .tools(ticketDatabaseTool,emailTool)
                .system((org.springframework.core.io.Resource) systemPromptResource)
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))

                .user(query)
                .call()
                .content();
    }
}
