package com.example.coursetutor.ai;

import dev.langchain4j.model.chat.ChatModel;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AiCourseTutor {

    @Resource
    private ChatModel qwenchatModel;
}
