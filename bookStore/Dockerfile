FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/bookStore-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 2008

ENTRYPOINT ["java", "-jar", "app.jar"]
