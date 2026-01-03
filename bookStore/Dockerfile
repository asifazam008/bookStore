FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy the exact jar name that your build produces
COPY target/bookStore-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]
