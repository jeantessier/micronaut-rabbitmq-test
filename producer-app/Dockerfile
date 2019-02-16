FROM openjdk:8-jdk-alpine 
RUN apk --no-cache add curl
COPY build/libs/*.jar producer-app.jar
CMD java ${JAVA_OPTS} -jar producer-app.jar