FROM openjdk:17-jdk-slim
COPY target/myapp-1.0-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
