
# Creating a Simple Project in Spring Boot

## Step-by-Step Guide

### 1. Go to start.spring.io
Open your web browser and navigate to [start.spring.io](https://start.spring.io/).

### 2. Configure the Project
- **Project:** Maven
- **Language:** Java
- **Packaging:** Jar

### 3. Choose Dependencies
Select the dependencies you need for your project. For a basic web application, you might choose:
- Spring Web
- Spring Boot DevTools
- Lombok (optional)

### 4. Generate the Project
Click on the "Generate" button to download the project as a zip file.

### 5. Open the Project in IntelliJ IDEA
- **Open IntelliJ IDEA.**
- **Import the Project:**
  - Click on "File" -> "Open" and navigate to the location where you downloaded the zip file.
  - Extract the zip file and select the folder containing the `pom.xml` file.
  - Click "OK" to open the project.
- **Wait for IntelliJ to load and index the project.**

### Example of a Simple Controller

Create a new Java class in the `src/main/java/com/example/demo` directory:

```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
```

### Running the Application

- **Run the Application:**
  - Click on the `DemoApplication` class which contains the `main` method.
  - Click the run button or right-click and select "Run 'DemoApplication'".
- **Access the Application:**
  - Open your web browser and go to `http://localhost:8080/hello`.
  - You should see the message "Hello, World!".

Congratulations! You've created and run a simple Spring Boot application.
