FROM openjdk:8
FROM maven:alpine

WORKDIR /app

COPY . /app

RUN mvn -v
RUN mvn clean install -DskipTests
EXPOSE 7500
LABEL maintainer="technohunk100@gmail.com"
#ADD ./target/spring-boot-data-jpa-example-0.0.1-SNAPSHOT.jar spring-boot-data-jpa-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app/target/vspring-boot-0.0.1-SNAPSHOT.jar"]
