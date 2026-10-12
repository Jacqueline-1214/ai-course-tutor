package com.example.coursetutor.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCourseTutorServiceTest {

    @Resource
    private AiCourseTutorService aiCourseTutorService;
    
    @Test
    void chat() {
        String result = aiCourseTutorService.chat("hi, I am taking Intro to statistic");
        System.out.println(result);
    }
}