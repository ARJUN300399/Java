
# Dependency Injection (DI)

## Definition
Dependency Injection is a design pattern used to implement Inversion of Control (IoC) in which a class receives its dependencies from an external source rather than creating them itself.

## Explanation
- **Purpose:** DI decouples the creation of a class's dependencies from the class itself, enhancing modularity and testability.
- **How it works:** Dependencies are passed to a class via constructors, setters, or interfaces. This allows the class to rely on abstractions rather than concrete implementations.

## Example in Java

```java
// Dependency: Service interface and its implementation
public interface Service {
    void perform();
}

public class ServiceImpl implements Service {
    public void perform() {
        System.out.println("Service is performing.");
    }
}

// Client class with a dependency on Service
public class Client {
    private Service service;

    // Constructor Injection
    public Client(Service service) {
        this.service = service;
    }

    public void execute() {
        service.perform();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Dependency injection through the constructor
        Service service = new ServiceImpl();
        Client client = new Client(service);
        client.execute(); // Output: Service is performing.
    }
}
```

## Example in C#

```csharp
// Dependency: IService interface and its implementation
public interface IService {
    void Perform();
}

public class ServiceImpl : IService {
    public void Perform() {
        Console.WriteLine("Service is performing.");
    }
}

// Client class with a dependency on IService
public class Client {
    private readonly IService _service;

    // Constructor Injection
    public Client(IService service) {
        _service = service;
    }

    public void Execute() {
        _service.Perform();
    }
}

// Main method
class Program {
    static void Main(string[] args) {
        // Dependency injection through the constructor
        IService service = new ServiceImpl();
        Client client = new Client(service);
        client.Execute(); // Output: Service is performing.
    }
}
```

In both examples, the `Client` class does not create an instance of `ServiceImpl` itself. Instead, it receives the `ServiceImpl` instance from an external source (in this case, the `Main` method), demonstrating Dependency Injection.
