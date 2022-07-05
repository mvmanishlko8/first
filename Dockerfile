# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=target/first.jar

COPY ${JAR_FILE} first.jar

EXPOSE 8080

# java -jar /Users/manishverma/Documents/workdir/app.jar
ENTRYPOINT ["java","-jar","/first.jar"]