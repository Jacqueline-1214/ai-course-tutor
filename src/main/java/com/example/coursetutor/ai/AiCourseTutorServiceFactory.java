package com.example.coursetutor.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiCourseTutorServiceFactory {

    @Resource
    private ChatModel qwenChatModel;

    @Bean
    // Register the AI Service as a Spring-managed bean
    // create an Ai Service
    public AiCourseTutorService aiCourseTutorService(){
        // Create an implementation class for the interface
        return AiServices.create(AiCourseTutorService.class,qwenChatModel);
    }
}
