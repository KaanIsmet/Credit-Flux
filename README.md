# Credit Flux: Credit Card Reward Optimization App

## App Description
**Credit Flux** is a sophisticated yet user-friendly application designed to help users maximize their credit card rewards and optimize spending. By analyzing spending patterns and leveraging a comprehensive database of credit cards, Credit Flux provides personalized recommendations to ensure users earn the maximum rewards possible while minimizing fees and optimizing benefits. This application empowers users to make informed financial decisions with ease and confidence.

Key features include expense tracking, card management, reward optimization, and detailed analytics. With secure user management and intuitive reporting tools, Credit Flux is the ultimate tool for savvy credit card users looking to unlock the full potential of their spending.
## Tech Stack

### Backend
- **Core Framework**
  - **Spring Boot**: Rapid development of production-ready backend services with embedded servers and auto-configuration.
  - **Spring Web**: RESTful web services and MVC architecture.
  - **Spring Data JPA**: Simplifies database interactions using Java Persistence API (JPA) with Hibernate as the ORM provider.
  - **Spring Security**: Robust authentication and authorization mechanisms, including JWT and OAuth2 support.
  - **Spring Validation**: Data validation for incoming requests.
  - **Spring Actuator**: Monitoring and management of the application in production.

- **Database**
  - **MySQL**: Relational database for structured data storage.
  - **Hibernate**: Object-relational mapping (ORM) for seamless database interactions.

- **API Development**
  - **RESTful APIs**: Stateless, resource-based APIs for client-server communication.
  - **Postman**: API testing and development.

- **Messaging & Asynchronous Processing**
  - **RabbitMQ**: Message broker for asynchronous communication and task queues.
  - **Kafka**: Distributed event streaming platform for real-time data processing.
  - **Spring Batch**: Batch processing for large datasets.

### DevOps & Infrastructure
- **Containerization**
  - **Docker**: Containerization for consistent deployment across environments.
  - **Docker Compose**: Multi-container Docker application management.

### Testing
- **Unit Testing**
  - **JUnit**: Framework for unit testing Java applications.
  - **Mockito**: Mocking framework for testing interactions between components.
- **Integration Testing**
  - **Testcontainers**: Library for integration testing with real dependencies (e.g., databases).
  - **Spring Boot Test**: Utilities for testing Spring Boot applications.
- **API Testing**
  - **Postman**: Tool for testing RESTful APIs.

### Monitoring & Logging
- **Application Monitoring**
  - **Prometheus**: Metrics collection and monitoring.
  - **Grafana**: Visualization of metrics and performance data.
  - **Spring Boot Actuator**: Production-ready features for monitoring and managing the application.
- **Logging**
  - **Logback**: Logging framework integrated with Spring Boot.
  - **ELK Stack (Elasticsearch, Logstash, Kibana)**: Centralized logging and log analysis.
  - **Sentry**: Error tracking and performance monitoring.
### Security
- **Authentication & Authorization**
  - **OAuth2**: Authorization framework for secure access delegation.
  - **JWT (JSON Web Tokens)**: Token-based authentication for stateless sessions.
  - **Spring Security**: Comprehensive security features for authentication and authorization.
  - **Authentication Manager**: Custom implementation for user authentication, integrating with Spring Security for credential validation.
  - **Password Encoding**: Secure password storage using **bcrypt** hashing algorithm.
  - **Role-Based Access Control (RBAC)**: Fine-grained access control based on user roles (e.g., USER, ADMIN).

- **Data Protection**
  - **HTTPS**: Secure communication over TLS/SSL to encrypt data in transit.
  - **bcrypt**: Password hashing for secure storage of user credentials.
  - **Vault**: Secrets management for securely storing sensitive data like API keys and credentials.
  - **CSRF Protection**: Built-in Cross-Site Request Forgery protection in Spring Security.
  - **CORS Configuration**: Secure Cross-Origin Resource Sharing policies to prevent unauthorized access.
  - **Input Validation**: Robust validation of user inputs to prevent SQL injection, XSS, and other attacks.
  - **Rate Limiting**: Protection against brute-force attacks by limiting login attempts.

