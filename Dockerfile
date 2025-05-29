# Stage 1: Build the application
FROM maven:3.9.9-amazoncorretto-21-debian AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -e clean install 

# Stage 2: Create the final image
FROM openjdk:21-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

