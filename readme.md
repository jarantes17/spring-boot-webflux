# spring-boot-webflux

Simple application using spring boot with kotlin reactive module [Spring Boot](http://projects.spring.io/spring-boot/). This project is based on [this other project in java](https://github.com/MichelliBrito/apirest-webflux).

## Requirements

For building and running the application you need:

- [JDK 11](http://www.oracle.com/technetwork/java/javase/downloads/#java11)
- [Gradle](https://gradle.org/)
- [Kotlin Plugin](https://kotlinlang.org/)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.restapi.webflux.WebfluxApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
gradlew spring-boot:bootRun
```
