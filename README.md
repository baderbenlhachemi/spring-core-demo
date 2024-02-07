# Spring-core-demo

## Description

This project is a Java-based Spring Boot application built with Maven. It showcases the implementation of Spring's Dependency Injection (DI) and Java-based configuration. Here's a breakdown of the technical aspects of the project:

1. **Java**: The programming language used in this project, known for its "write once, run anywhere" capability.

2. **Spring Boot**: A framework for creating stand-alone, production-grade Spring-based applications, simplifying the setup of Spring applications.

3. **Maven**: A build automation tool primarily used for Java projects, handling build, reporting, and documentation centrally.

4. **Dependency Injection (DI)**: A design pattern where objects are passed as dependencies. Spring's DI is employed to inject `Coach` objects into the `DemoController`.

5. **Java-based Configuration**: Spring allows configuring applications using Java classes. The `SportConfig` class defines a bean named "aquatic," which is an instance of `SwimCoach`.

6. **REST Controller**: The `DemoController` class serves as a REST controller exposing two endpoints: `/dailyworkout` and `/check`. `/dailyworkout` returns the daily workout routine from `myCoach`, while `/check` compares if `myCoach` and `anotherCoach` are the same instance.

7. **Beans**: In Spring, objects managed by the Spring IoC container are called beans. In this project, `SwimCoach` is defined as a bean in the `SportConfig` class.

8. **Interfaces and Classes**: The project includes a `Coach` interface and a `SwimCoach` class that implements this interface. The `SwimCoach` class provides a daily workout routine.

9. **Autowired and Qualifier Annotations**: `@Autowired` automatically wires beans, and `@Qualifier` resolves autowiring conflicts for beans of the same type. In the `DemoController` class, these annotations are used to inject the "aquatic" bean into `myCoach`.

10. **Comparison of Bean Instances**: The code `return "Comparing beans: (myCoach == anotherCoach), " + (myCoach == anotherCoach);` in the `DemoController` class compares if `myCoach` and `anotherCoach` are the same instance.
