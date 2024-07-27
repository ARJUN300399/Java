
# Dependency Injection in Spring Boot

## Quick Revision:
- **Dependency Injection (DI):** Design pattern where a class's dependencies are provided by an external source.
- **Spring Boot:** Uses DI extensively to manage the lifecycle and dependencies of beans.

## Detailed Explanation:
In Spring Boot, Dependency Injection (DI) is a fundamental design principle that helps manage the dependencies of various components in an application. The Spring Framework’s Inversion of Control (IoC) container is responsible for creating, configuring, and managing the lifecycle of beans.

**Key Concepts:**
1. **Inversion of Control (IoC):** The control of object creation and dependency management is transferred from the application code to the Spring container.
2. **Beans:** Objects that are managed by the Spring IoC container.
3. **Annotations:** Common annotations used for DI in Spring Boot include:
    - `@Autowired`: Used for automatic dependency injection.
    - `@Component`: Marks a Java class as a Spring component.
    - `@Service`: Indicates a service layer class.
    - `@Repository`: Indicates a data repository class.
    - `@Controller`: Marks a class as a Spring MVC controller.

## Types of Dependency Injection:
1. **Constructor Injection:** Dependencies are provided through a class constructor.
2. **Setter Injection:** Dependencies are provided through setter methods.
3. **Field Injection:** Dependencies are injected directly into the fields.

## Example in Spring Boot:

```java
// Main application class
package com.java.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
        Dev obj = context.getBean(Dev.class);
        obj.build();
    }
}
```

```java
// Component class
package com.java.myApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build() {
        System.out.println("Learning Spring Boot");
    }
}
```

## Explanation of the Example:
1. **MyAppApplication:** The main class annotated with `@SpringBootApplication`, which bootstraps the application. It uses the Spring ApplicationContext to get the `Dev` bean and call its `build` method.
2. **Dev:** A class annotated with `@Component`, indicating that it is a Spring-managed component. The `build` method prints a message to the console.

## Key Annotations:
- `@SpringBootApplication`: A convenience annotation that combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan` with their default attributes.
- `@Component`: Indicates that a class is a Spring-managed component, allowing it to be autodetected through classpath scanning and registered as a bean.

In Spring Boot, the IoC container automatically wires the dependencies, making the development process simpler and more manageable.
