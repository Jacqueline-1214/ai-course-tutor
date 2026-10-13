package com.example.coursetutor.ai;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
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
        //ChatMemory: Limit each user's chat history to 10 messages
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        //Create AI service
        AiCourseTutorService aiCourseTutorService = AiServices.builder(AiCourseTutorService.class)
                .chatModel(qwenChatModel)
                .chatMemory(chatMemory) // add chatMemory
                // Isolate chat histories between users
                .chatMemoryProvider(memoryId -> MessageWindowChatMemory.withMaxMessages(10))
                .build();
        return aiCourseTutorService;
    }
}
