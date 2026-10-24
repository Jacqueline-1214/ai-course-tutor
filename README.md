# AI Course Tutor

AI Course Tutor is a Java-based AI study assistant built with Spring Boot and LangChain4j.

The goal of this project is to provide personalized tutoring based on each student's learning needs. 
By using students' own course notes through RAG (Retrieval-Augmented Generation), the AI can better 
understand what they are studying and provide explanations that match their level of understanding.

The project also aims to track students' weak areas over time and generate targeted practice quizzes 
to help them improve.

## Tech Stack

- **Java**
- **Spring Boot**
- **LangChain4j**
- **Qwen-Plus** — AI chat model
- **Qwen text-embedding-v4** — Embedding model
- **Maven**

## Current Features

### 1. AI Chat
- Answer students' questions using Qwen-Plus.
- Support conversation memory for multi-turn chats.
- Use a custom system prompt to guide AI responses.

### 2. RAG (Retrieval-Augmented Generation)
- Load course notes from Markdown files.
- Split documents into smaller text segments.
- Generate embeddings using Qwen text-embedding-v4.
- Store embeddings in an in-memory vector store.
- Find relevant course content to help the AI answer questions.

### 3. Source Information
- Return AI responses with source information using LangChain4j's `Result<String>`.
- View the course document segments found during RAG.
- Include source file names to identify where the information comes from.

### 4. Testing
- Use JUnit tests to check AI chat and RAG functionality.
- Verify document loading, embedding storage, and RAG responses through debugging.

## How It Works

1. Load course notes from `src/main/resources/docs`.
2. Split the notes into smaller text segments.
3. Generate embeddings and store them in memory.
4. When a student asks a question, find relevant segments from the stored notes.
5. Send the question and relevant course content to Qwen-Plus.
6. Return the AI-generated answer and available source information.

## Project Status

**In Development**

The basic AI chat and RAG pipeline are working. More features and improvements will be added as development continues.