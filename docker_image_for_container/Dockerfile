FROM openjdk:17-jdk-alpine

RUN apk add --no-cache ffmpeg

VOLUME /tmp
VOLUME /downloads/transcoded
ARG JAR_FILE=target/docker_image_for_container-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
