package com.example.coursetutor.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AiCourseTutor {

    @Resource
    private ChatModel qwenChatModel;

    private static final String SYSTEM_MESSAGE = """
            You are an AI Course Tutor designed to help university students understand academic concepts,
            solve problems, and study effectively.
            Follow these guidelines:
            1. Explain concepts clearly and step by step and explain unfamiliar terminology, 
               using examples when helpful.
            2. When asked to summarize key concepts or generate practice questions or quizzes
               based on provided course materials or a specific unit or chapter, 
               ensure comprehensive coverage of all relevant topics, key concepts, and potential exam points. 
               If the available materials are incomplete, clearly state the limitations.
            3. When course materials are provided, prioritize them. 
               Never fabricate citations or claim information is in the materials when it is not.
            4. Respond in the same language the student uses, while preserving English terminology. 
            """;

    //Simple chat
    public String chat(String message) {
        SystemMessage systemMessage = SystemMessage.from(SYSTEM_MESSAGE);
        // first define the message send by user
        UserMessage userMessage = UserMessage.from(message);
        // call the model's chat method,passing UserMessage as argument
        ChatResponse chatResponse = qwenChatModel.chat(systemMessage,userMessage);
        // take out AI's response
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI output: " + aiMessage.toString());
        return aiMessage.text();

    }

    // Simple chat with a custom user message
    //The configured qwen-plus model did not accept image input during testing.
    public String chatWithMessage(UserMessage usermessage) {
        // call the model's chat method,passing UserMessage as argument
        ChatResponse chatResponse = qwenChatModel.chat(usermessage);
        // take out AI's response
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI output: " + aiMessage.toString());
        return aiMessage.text();

    }

}
