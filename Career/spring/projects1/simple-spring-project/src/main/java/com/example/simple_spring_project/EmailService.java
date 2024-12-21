package com.example.simple_spring_project;

public class EmailService implements MessageService{
    @Override
    public String getMessage() {
        return "Hello from Email Service";
    }

}
