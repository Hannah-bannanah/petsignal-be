# PetSignal Backend

A Spring Boot application for managing pet alerts and notifications.

## Technologies
- Java 21
- Spring Boot 3.2.3
- Spring Data JPA
- MySQL
- Maven
- Docker
- OpenAPI/Swagger

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher
- Docker 20.10 or higher

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/petsignal-be.git
   cd petsignal-be
   ```

2. Start the MySQL Docker container
   - Update `docker-compose.yml` with your credentials
   - First time only: build the docker container
   ```
   cd database;
   docker compose up --build -d;
   cd ..
   ```
   - Following times you can start the docker container normally
   ```
   cd database;
   docker compose up -d;
   cd ..
   ```
   - After shutting down the application, you can stop the container
   ```
   cd database;
   docker compose down;
   cd ..
   ```
3. Configure the application:
    - Update `application.yml` with your database credentials
    - Update `application.yml` with your AWS credentials and configuration

4. Build the application:
   ```
   mvn clean install
   ```

5. Run the application:
   ```
   mvn spring-boot:run
   ```

## API Documentation

Once the application is running, you can access the API documentation at:

- Swagger UI: http://localhost:8080/api/v1/swagger-ui.html

## Project Structure

```
src/main/java/com/petsignal/
├── alert/                 # Alert operations
├── config/                # Configuration classes
├── countries/             # Country operations
├── emailnotifications/    # Email operations
├── exception/             # Custom exception classes and handlers
├── notifications/         # Notification management
├── photos/                # Photo operations
├── postcodes/             # Postcode operations
├── posts/                 # Post operations
├── s3bucket/              # Interaction with AWS s3 bucket
├── scheduler/             # Scheduled jobs
├── subscriptions/         # Subscription operations
├── user/                  # User operations
└── PetSignalApplication.java
```

## Features
- CRUD operations for alerts, photos, users, and subscriptions
- Email notifications
- OpenAPI documentation


## License
This project is licensed under the MIT License - see the LICENSE file for details.
