FROM eclipse-temurin:21-jdk
WORKDIR /app

# Match the actual jar name produced by Maven
COPY target/bookStore-*.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]
