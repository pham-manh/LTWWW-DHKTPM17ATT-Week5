# Spring Boot Login Application

This project is a Spring Boot application that implements a login functionality using user data from a database with Spring Security. It provides a secure way for users to log in and access different parts of the application based on their roles.

## Project Structure

The project is organized as follows:

```
spring-boot-login-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── java
│   │   │           └── findworks
│   │   │               ├── backend
│   │   │               │   ├── configs
│   │   │               │   │   └── SecurityConfig.java
│   │   │               │   ├── models
│   │   │               │   │   └── User.java
│   │   │               │   ├── repositories
│   │   │               │   │   └── UserRepository.java
│   │   │               │   └── services
│   │   │               │       └── CustomUserDetailsService.java
│   │   │               └── frontend
│   │   │                   └── controllers
│   │   │                       └── LoginController.java
│   │   ├── resources
│   │   │   ├── static
│   │   │   │   ├── styles
│   │   │   │   │   ├── common.css
│   │   │   │   │   ├── header.css
│   │   │   │   │   └── login.css
│   │   │   │   └── scripts
│   │   │   │       └── login.js
│   │   │   ├── templates
│   │   │   │   ├── fragments
│   │   │   │   │   └── header.html
│   │   │   │   └── login.html
│   │   │   └── application.properties
│   └── test
│       └── java
│           └── com
│               └── java
│                   └── findworks
│                       └── SpringBootLoginAppApplicationTests.java
├── .gitignore
├── build.gradle
└── README.md
```

## Features

- **User Authentication**: Users can log in using their credentials.
- **Role-Based Access Control**: Different roles (USER, ADMIN, COMPANY) determine access to various parts of the application.
- **Custom User Details Service**: Loads user-specific data from the database for authentication.
- **Responsive Design**: The login page is styled for a better user experience.

## Setup Instructions

1. **Clone the Repository**: 
   ```
   git clone <repository-url>
   cd spring-boot-login-app
   ```

2. **Configure Database**: Update the `application.properties` file with your database connection settings.

3. **Build the Project**: Use Gradle to build the project.
   ```
   ./gradlew build
   ```

4. **Run the Application**: Start the Spring Boot application.
   ```
   ./gradlew bootRun
   ```

5. **Access the Login Page**: Open your browser and go to `http://localhost:8080/login`.

## Usage

- Enter your username and password to log in.
- Upon successful login, you will be redirected based on your role.
- If login fails, an error dialog will be displayed.

## Testing

Run the test cases to ensure that the application context loads correctly and that the login functionality works as expected.

## License

This project is licensed under the MIT License.