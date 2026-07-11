# AI-Powered Help Desk Backend

A RESTful backend for an AI-powered Help Desk application built with **Spring Boot**, **Spring AI**, **Google Gemini**, and **PostgreSQL**. The application combines traditional ticket management with AI-assisted customer support by enabling intelligent conversations, chat memory, and AI tool calling.

---

## Features

* AI-powered customer support using Google Gemini
* Ticket creation and management
* Context-aware conversations with chat memory
* AI tool calling for database operations
* RESTful APIs for frontend integration
* PostgreSQL database integration
* Layered architecture following Spring Boot best practices

---

## Tech Stack

| Category   | Technologies               |
| ---------- | -------------------------- |
| Language   | Java 21                    |
| Framework  | Spring Boot                |
| AI         | Spring AI, Google Gemini   |
| Database   | PostgreSQL                 |
| ORM        | Spring Data JPA, Hibernate |
| Build Tool | Maven                      |
| Testing    | Postman                    |

---

## Project Structure

```
src
├── advisor
├── config
├── controller
├── dto
├── entity
├── repository
├── service
├── tools
└── resources
```

---

## Architecture

```
                React Frontend
                       │
                       ▼
             Spring Boot REST API
                       │
        ┌──────────────┴──────────────┐
        │                             │
        ▼                             ▼
 Business Services              Spring AI Client
        │                             │
        ▼                             ▼
 PostgreSQL Database         Google Gemini API
```

---

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Priyanshu1844/ai-powered-help-desk-backend.git

cd ai-powered-help-desk-backend
```

### 2. Configure PostgreSQL

Create a PostgreSQL database and update your configuration.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/helpdesk
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### 3. Configure Gemini API

Add your API key in `application.properties` or `application.yml`.

```properties
spring.ai.google.api-key=YOUR_GEMINI_API_KEY
```

### 4. Build the project

```bash
mvn clean install
```

### 5. Run the application

```bash
mvn spring-boot:run
```

The server starts at:

```
http://localhost:8080
```

---

## AI Capabilities

The backend integrates Spring AI with Google Gemini to provide:

* Natural language conversations
* Context-aware responses
* Chat memory
* AI tool calling
* Ticket-related assistance

---

## API Modules

### Ticket APIs

* Create Ticket
* Get Ticket
* Update Ticket
* Delete Ticket
* List All Tickets

### AI APIs

* Chat with AI Assistant
* Context-aware Conversations
* Tool Calling

---

## Frontend

The frontend for this project is available here:

**https://github.com/Priyanshu1844/ai-powered-help-desk-frontend**

---

## Future Improvements

* JWT Authentication
* Role-Based Access Control
* Email Notifications
* File Attachments
* Vector Database Integration
* Retrieval-Augmented Generation (RAG)
* Docker Support
* Kubernetes Deployment

---

## Author

**Priyanshu Mundotia**

B.Tech, Electronics & Communication Engineering
Malaviya National Institute of Technology (MNIT), Jaipur

GitHub: **https://github.com/Priyanshu1844**

---

## License

This project is licensed under the MIT License.
