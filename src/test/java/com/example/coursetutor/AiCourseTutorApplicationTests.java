package com.example.coursetutor;

import com.example.coursetutor.ai.AiCourseTutor;
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
}
