package com.substring.helpdesk.controller;

import com.substring.helpdesk.services.AIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/helpdesk")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class AiController {

    private final AIService service;

    @PostMapping
    public ResponseEntity<String> getResponse(
            @RequestBody String query, @RequestHeader("ConversationId") String conversationId
    ){
        return ResponseEntity.ok(service.getResponseFromAssistant(query,conversationId));
    }
    @PostMapping(value = "/stream")
    public Flux<String> streamResponse(@RequestBody  String query, @RequestHeader("ConversationId") String conversationId){
        return this.service.streamResponseFromAssistant(query,conversationId) ;
    }

}
