# MediCare - Medicine Delivery Backend System
## Overview
MediCare is a medicine delivery backend application built using Java and Spring Boot. It aims to provide REST APIs for medicine management, user authentication, shopping cart operations, and order processing.
The project focuses on applying backend development concepts such as layered architecture, database management, security, validation, and exception handling.

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Spring Security
- JWT Authentication
- Maven
- Git and GitHub
- Swagger/OpenAPI

## Features
- [ ] User registration and login
- [ ] JWT-based authentication
- [ ] Role-based authorization
- [ ] Medicine management (CRUD operations)
- [ ] Medicine search and pagination
- [ ] Shopping cart management
- [ ] Order placement and order history
- [ ] Input validation and global exception handling
- [ ] API documentation using Swagger/OpenAPI
- [ ] Payment gateway integration
- [ ] Email notifications
- [ ] Docker and deployment

## Project Structure
src/main/java/com/medicare/
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
├── config/
├── security/
├── exception/
└── MedicareApplication.java

## Getting Started
### Prerequisites
- Java JDK
- Maven
- PostgreSQL
- Git

### Clone the Repository
git clone https://github.com/YOUR_USERNAME/medicare-backend-system.git
cd medicare-backend-system

### Configure the Database
Create a PostgreSQL database named `medicare_db`.

Configure the database connection using environment variables in `application.properties`.

spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

Set the `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` environment variables before running the application.

### Run the Application
mvn spring-boot:run

The application runs on port `8080` by default, unless configured otherwise.

## API Endpoints

The following endpoints are planned for implementation.

| Method | Endpoint | Description |
| POST | `/api/auth/register` | Register a user |
| POST | `/api/auth/login` | Authenticate a user |
| GET | `/api/medicines` | Retrieve all medicines |
| GET | `/api/medicines/{id}` | Retrieve a medicine by ID |
| POST | `/api/medicines` | Add a new medicine |
| PUT | `/api/medicines/{id}` | Update medicine details |
| DELETE | `/api/medicines/{id}` | Delete a medicine |
| POST | `/api/cart/items` | Add an item to the cart |
| POST | `/api/orders` | Place an order |
| GET | `/api/orders/my-orders` | Retrieve order history |

## Security
- Password hashing and secure authentication.
- Role-based access control.
- Request validation.
- Secure management of database credentials and API keys.
- Centralized exception handling.

## Testing
The application will use JUnit, Mockito, and Spring Boot testing tools for automated testing. Postman can be used to test REST API endpoints.

## Development Roadmap
- [ ] Project setup and configuration
- [ ] Medicine CRUD APIs
- [ ] Database integration using PostgreSQL and JPA
- [ ] DTOs and validation
- [ ] Global exception handling
- [ ] Spring Security and JWT authentication
- [ ] Shopping cart and order management
- [ ] Automated testing
- [ ] API documentation
- [ ] Payment integration
- [ ] Docker and deployment

## Author

**SAKSHI SUMAN**

- GitHub: https://github.com/coderrsuman
- LinkedIn: www.linkedin.com/in/sakshi-suman-020135243

## License

This project is developed for learning and portfolio purposes. A license can be added if the project is distributed publicly.

