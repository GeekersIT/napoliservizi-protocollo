FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/*.jar
COPY lib /protocollo/lib
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]