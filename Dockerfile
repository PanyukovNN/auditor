FROM openjdk:21-slim

COPY ./build/libs/auditor.jar /auditor.jar

EXPOSE 8008
ENV TZ=Europe/Moscow

ENTRYPOINT ["java", "-jar", "/auditor.jar"]