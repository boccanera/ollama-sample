package com.ollama.sample.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.stereotype.Service;

@Service
public class DeepSeekService {

    private final OllamaChatModel chatModel;

    public DeepSeekService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String generateResult(String prompt){
        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        OllamaOptions.builder()
                                .model("deepseek-r1:1.5b")
                                .temperature(0.6)
                                .build()
                ));
        return response.getResult().getOutput().getContent();
    }

}
