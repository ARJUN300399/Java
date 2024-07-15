
# Dependency Injection in Spring Boot

## Definition
In Spring Boot, Dependency Injection (DI) is a core concept where the Spring framework manages the dependencies of the beans (objects). This is primarily achieved through the use of annotations and configurations, allowing the framework to inject the required dependencies at runtime.

## Explanation
- **Inversion of Control (IoC):** Spring's IoC container manages the life cycle and configuration of application objects.
- **Types of DI:** Spring supports Constructor Injection, Setter Injection, and Field Injection.
- **Annotations:** Common annotations used for DI in Spring Boot include `@Autowired`, `@Component`, `@Service`, `@Repository`, and `@Controller`.

## Example

```java
// Service interface
public interface GreetingService {
    String greet(String name);
}

// Service implementation
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name;
    }
}

// Controller using the service
@RestController
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "World") String name) {
        return greetingService.greet(name);
    }
}

// Spring Boot Application class
@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionDemoApplication.class, args);
    }
}
```

## Explanation of the Example
- **GreetingService:** An interface defining the contract for the service.
- **GreetingServiceImpl:** A class that implements the `GreetingService` interface, annotated with `@Service` to indicate that it's a service component.
- **GreetingController:** A controller class that uses `GreetingService`. The service is injected via the constructor, which is annotated with `@Autowired` to enable DI.
- **DependencyInjectionDemoApplication:** The main class annotated with `@SpringBootApplication`, which bootstraps the application.

## Key Annotations
- `@Autowired`: Marks a constructor, field, or setter method to be autowired by Spring's dependency injection facilities.
- `@Component`: Generic stereotype annotation for any Spring-managed component.
- `@Service`: Indicates that a class is a service component.
- `@Repository`: Indicates that a class is a data repository.
- `@Controller`: Indicates that a class serves the role of a web controller.

In Spring Boot, the IoC container automatically wires the dependencies, making the development process simpler and more manageable.
