package com.ollama.sample.controller;

import com.ollama.sample.service.DeepSeekService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("deepseek")
public class DeepSeekController {

    private final DeepSeekService deepSeekService;

    public DeepSeekController(DeepSeekService deepSeekService) {
        this.deepSeekService = deepSeekService;
    }

    @GetMapping("api/v1/generate")
    public String generateResult(@RequestParam("input") String input){
        return deepSeekService.generateResult(input);
    }


}
