FROM openjdk:17-jdk-slim as build

COPY target/rooms-0.0.1-SNAPSHOT.jar rooms-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/rooms-0.0.1-SNAPSHOT.jar"]