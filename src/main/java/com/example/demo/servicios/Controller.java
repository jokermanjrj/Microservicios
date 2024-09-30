package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetingController {
    String prueba = "prueba";
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", defaultValue = "Guest") String name, Locale locale) {
        String greetingMessage = messageSource.getMessage("greeting.message", new Object[]{name}, locale);
        return greetingMessage;
    }
}