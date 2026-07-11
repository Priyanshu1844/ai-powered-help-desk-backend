# 🤖 AI-Powered Help Desk Backend

A RESTful backend for an AI-powered Help Desk application built with **Spring Boot**, **Spring AI**, **Google Gemini 2.5 Flash**, and **MySQL**. The application combines AI-assisted customer support with ticket management by enabling intelligent conversations, persistent chat memory, and AI tool calling.

---

# ✨ Features

- 🤖 AI-powered customer support using Google Gemini 2.5 Flash
- 💬 Context-aware conversations with persistent chat memory
- 🛠 AI Tool Calling using Spring AI
- 🎫 Ticket creation through AI
- 🔍 Ticket retrieval from MySQL database
- 💾 Persistent chat memory using JDBC Repository
- 🌐 REST APIs for frontend integration
- 🏗 Clean layered architecture following Spring Boot best practices

---

# 🛠 Tech Stack

| Category | Technologies |
|----------|--------------|
| Language | Java 25 |
| Framework | Spring Boot 3 |
| AI | Spring AI, Google Gemini 2.5 Flash |
| Database | MySQL |
| ORM | Spring Data JPA, Hibernate |
| Build Tool | Maven |
| Utilities | Lombok |

---

# 📂 Project Structure

```text
src
├── configuration
├── controller
├── entity
├── exception
├── repositories
├── services
├── tools
└── resources
```

---

# 🏗 Architecture

```text
                 React Frontend
                        │
                        ▼
              Spring Boot REST API
                        │
          ┌─────────────┴─────────────┐
          │                           │
          ▼                           ▼
    Business Services          Spring AI Client
          │                           │
          ▼                           ▼
      MySQL Database         Google Gemini API
```

---

# 🚀 Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/Priyanshu1844/ai-powered-help-desk-backend.git

cd ai-powered-help-desk-backend
```

---

## 2. Configure MySQL

Create a MySQL database.

```sql
CREATE DATABASE spring-ai-project;
```

Update your `application.yml`.

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/spring-ai-project
    username: root
    password: YOUR_PASSWORD

  jpa:
    hibernate:
      ddl-auto: update

  ai:
    google:
      genai:
        api-key: ${GENAI_API_KEY}
```

---

## 3. Configure Gemini API Key

Create an environment variable.

```text
GENAI_API_KEY=YOUR_GEMINI_API_KEY
```

---

## 4. Build the Project

```bash
mvn clean install
```

---

## 5. Run the Application

```bash
mvn spring-boot:run
```

The application will start at:

```text
http://localhost:8080
```

---

# 🤖 AI Capabilities

The backend leverages Spring AI with Google Gemini to provide:

- Natural language conversations
- Context-aware chat memory
- AI Tool Calling
- Ticket creation
- Ticket lookup from the database

---

# 📌 Core Modules

- AI Chat Controller
- Ticket Service
- Ticket Repository
- Ticket Database Tool
- Email Tool
- Spring AI Configuration
- Chat Memory Repository

---

# 🌱 Future Improvements

- JWT Authentication
- Role-Based Access Control (RBAC)
- Email Notifications
- File Attachments
- Vector Database Integration
- Retrieval-Augmented Generation (RAG)
- Docker Support
- Kubernetes Deployment

---

# 👨‍💻 Author

**Priyanshu Mundotia**

B.Tech, Electronics & Communication Engineering

Malaviya National Institute of Technology (MNIT), Jaipur

GitHub: https://github.com/Priyanshu1844

LinkedIn: https://www.linkedin.com/in/priyanshu-mundotia/

---

# 📄 License

This project is licensed under the MIT License.
