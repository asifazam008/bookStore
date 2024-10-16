# Book Store Application

## Description

This is a simple Book Store Application built using Spring Boot and Thymeleaf. The application allows users to manage books, including viewing available books, adding them to a personal list, and editing book details.

## Features

- View a list of available books
- Add books to your personal list
- Edit existing book details
- Bootstrap CSS for responsive design
- Font Awesome icons for a better user experience

## Technologies Used

- **Java 21**: Programming language used for building the application.
- **Spring Boot**: Framework for building Java applications.
- **Thymeleaf**: Server-side template engine for rendering HTML.
- **Hibernate**: ORM framework for database operations.
- **MySQL**: Database for storing book information.
- **Bootstrap**: CSS framework for responsive design.
- **Font Awesome**: Icons library for improved UI.

## Getting Started

### Prerequisites

- Java 21 or later
- Maven
- MySQL (or any other compatible database)
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/book-store.git
   cd book-store

2. Setup MySQL Database:

  Create a Database:

  Open MySQL Workbench or your preferred MySQL client.
  Run the following SQL command to create a new database:
  CREATE DATABASE bookstore;

3. Configure Database Connection:

Update the src/main/resources/application.properties file with your database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Build the Application:
   mvn clean install

5. Run the Application:
   mvn spring-boot:run

6. Access the Application: Open your browser and go to http://localhost:2002
