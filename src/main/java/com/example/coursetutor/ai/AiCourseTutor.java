package com.example.coursetutor.ai;

import dev.langchain4j.data.message.AiMessage;
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

    public String chat(String message) {
        // first define the message send by user
        UserMessage userMessage = UserMessage.from(message);
        // call the model's chat method,passing UserMessage as argument
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        // take out AI's response
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI output: " + aiMessage.toString());
        return aiMessage.text();

    }

}
