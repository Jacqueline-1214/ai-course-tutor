package com.example.coursetutor.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCourseTutorServiceTest {

    @Resource
    private AiCourseTutorService aiCourseTutorService;

    /**
     * Test a single chat interaction.
     */
    @Test
    void chat() {
        String result = aiCourseTutorService.chat(1,"hi, I am taking Intro to statistic");
        System.out.println(result);
    }

    /**
     * Test conversation memory within a single session.
     */
    @Test
    void chatWithMemory() {
        String result = aiCourseTutorService.chat(2,"hi, I am taking Intro to statistic");
        System.out.println(result);
        result = aiCourseTutorService.chat(2,"what class I'm taking?");
        System.out.println(result);
    }

    /**
     * Test conversation memory isolation across sessions.
     */
    @Test
    void testMemoryIsolation() {
        // User 1
        aiCourseTutorService.chat(3, "My name is Alice.");
        // User 2
        aiCourseTutorService.chat(4, "My name is Bob.");
        // Check whether each conversation remembers its own user
        String response1 =
                aiCourseTutorService.chat(3, "What is my name?");
        String response2 =
                aiCourseTutorService.chat(4, "What is my name?");

        System.out.println("User 1: " + response1);
        System.out.println("User 2: " + response2);
    }

    @Test
    void testKnowledgeSummary() {
        String userMessage = "Random variables and distributions: 1-sentence summary, 3 brief concepts.";
        AiCourseTutorService.KnowledgeSummary result
                = aiCourseTutorService.chatForKnowledgeSummary(5, userMessage);
        System.out.println("Topic: " + result.topic());
        System.out.println("Summary: " + result.summary());
        System.out.println("Key Concepts: " + result.keyConcepts());
    }
}