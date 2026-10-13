package com.example.coursetutor.ai;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface AiCourseTutorService {

    @SystemMessage(fromResource = "system-prompt.txt")
        // Isolate chat histories between users with MemoryId
    String chat(@MemoryId int memoryId, @UserMessage String userMessage);
}
