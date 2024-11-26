FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ./target/Praktika-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "/app.jar"]

