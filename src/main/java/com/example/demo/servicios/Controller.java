package com.example.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Autowired

    private final SaveService SaveService;
    private final LoadService LoadService;
    
    public Controller(SaveService saveService, LoadService loadService) {
        this.SaveService = saveService;
        this.LoadService = loadService;
    } 
    
    @GetMapping("/SaveService/greeting")
    public String SaveService() {
        
        return SaveService.greeting();
    }
    
    @GetMapping("/LoadService/servicioCarga")
    public String LoadService() {
        
        return LoadService.servicioCarga();
    }
   
}