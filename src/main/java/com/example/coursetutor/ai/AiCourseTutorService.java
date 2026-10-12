package com.example.coursetutor.ai;

import dev.langchain4j.service.SystemMessage;

public interface AiCourseTutorService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String userMessage);
}
