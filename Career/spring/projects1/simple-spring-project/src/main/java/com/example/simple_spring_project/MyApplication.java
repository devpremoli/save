package com.example.simple_spring_project;

public class MyApplication {
    private MessageService messageService;
    // Setter-based Dependency Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage() {
        System.out.println(messageService.getMessage());
    }
}
