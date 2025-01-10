FROM openjdk:21-jdk
WORKDIR /app
COPY ./target/caiana-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "caiana-0.0.1-SNAPSHOT.jar"]