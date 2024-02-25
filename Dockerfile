FROM openjdk:17-oracle

WORKDIR /app

COPY target/email-service-0.0.1-SNAPSHOT.jar /app/email-service.jar

EXPOSE 8081

CMD ["java", "-jar", "email-service.jar"]
