package com.example.coursetutor;

import com.example.coursetutor.ai.AiCourseTutor;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCourseTutorApplicationTests {

    @Resource
    private AiCourseTutor aiCourseTutor;

    @Test
    void chat() {
        aiCourseTutor.chat("hi, I am taking Intro to statistic");
    }


    @Test
    void testChatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("describe graph"),
                ImageContent.from("https://www.mathmindsacademy.com/uploads/1/0/0/0/100057076/conditional-probability-formula_orig.png")
        );
        aiCourseTutor.chatWithMessage(userMessage);
    }
}
