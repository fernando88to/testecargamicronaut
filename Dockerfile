FROM eclipse-temurin:17.0.4_8-jdk-alpine
COPY build/libs/testecargamicronaut-0.1-all.jar helloworld.jar
EXPOSE 8080
CMD ["java", "-jar", "helloworld.jar"]