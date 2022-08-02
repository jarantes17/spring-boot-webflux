# spring-boot-webflux

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Simple application using spring boot with kotlin reactive module [Spring Boot](http://projects.spring.io/spring-boot/). This project is based on [this other project in java](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbHU3cjdUemNNTFNoaHlqQVA2RV91RUx1clBxUXxBQ3Jtc0tuMi00Q09VaFVCRVdVMklLV2RlLVdPR1JHdVVvS3JvQTVGbU9pcmRXU29UcVZqTTZXcDRIUE1sV19iay1PcU02MnZHd0xtcG1ibmFnZ1F4T2tmazk0V3l1ZEhvZnFRNVBoZGJrc2t5aEtUUjR3enJHdw&q=https%3A%2F%2Fgithub.com%2FMichelliBrito%2Fapirest-webflux&v=cWvwjCObkxQ).

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