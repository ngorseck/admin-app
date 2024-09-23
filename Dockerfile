FROM openjdk:17-jdk-slim

LABEL maintainer="Ngor SECK ngorsecka@gmail.com"

COPY target/admin-app.jar admin-app.jar

ENTRYPOINT ["java","-jar","admin-app.jar"]

EXPOSE 8080