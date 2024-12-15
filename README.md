# LTWWW-DHKTPM17ATT-Week5

This project is designed to demonstrate the integration of various web technologies including Java, HTML, CSS, and JavaScript. The primary objective is to create a web application with essential functionalities.

## Project Structure

The project is organized as follows:
LTWWW-DHKTPM17ATT-Week5
├── src
│ ├── main
│ │ ├── java
│ │ ├── resources
│ │ │ ├── static
│ │ │ │ ├── styles
│ │ │ │ ├── scripts
│ │ │ ├── templates
│ │ └── test
├── .gitignore
├── build.gradle
└── README.md

## Technologies Used

- **Java**: Backend logic and RESTful services.
- **HTML**: Structure of the web pages.
- **CSS**: Styling of the web pages.
- **JavaScript**: Client-side scripting.

## Features

- **User Authentication**: Allows users to log in using their credentials.
- **Responsive Design**: Ensures the application is user-friendly on various devices.
- **Role-Based Access Control**: Different roles determine access to various parts of the application.

## Setup Instructions

1. **Clone the Repository**:
2. git clone `https://github.com/pham-manh/LTWWW-DHKTPM17ATT-Week5.git
cd LTWWW-DHKTPM17ATT-Week5`

2. **Configure Database**: Update the `application.properties` file with your database connection settings.

3. **Build the Project**: Use Gradle to build the project.
4. **Run the Application**:  Start the Spring Boot application.
`./gradlew bootRun`
5. **Access the Application**: Open your browser and go to `http://localhost:8080`.

## Usage

- Enter your username and password to log in.
- Upon successful login, you will be redirected based on your role.
- If login fails, an error message will be displayed.

## Testing

Run the test cases to ensure that the application context loads correctly and that the login functionality works as expected.

## License

This project is licensed under the MIT License.
