package com.example.coursetutor.ai;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.Result;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

import java.util.List;

public interface AiCourseTutorService {

    @SystemMessage(fromResource = "system-prompt.txt")
        // Isolate chat histories between users with MemoryId
    String chat(@MemoryId int memoryId, @UserMessage String userMessage);


    // Generate a structured knowledge summary
    @SystemMessage(fromResource = "system-prompt.txt")
    KnowledgeSummary chatForKnowledgeSummary
    (@MemoryId int memoryId, @UserMessage String userMessage);

    record KnowledgeSummary(String topic,
                            String summary,
                            List<String> keyConcepts){}


    // Generate an answer using RAG
    // Return the answer along with available metadata
    @SystemMessage(fromResource = "System-prompt.txt")
    Result<String> chatWithRag(@MemoryId int memoryId,
                               @UserMessage String userMessage);
}
