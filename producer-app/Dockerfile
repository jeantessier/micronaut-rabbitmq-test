FROM openjdk:14-alpine
COPY build/libs/producer-app-*-all.jar producer-app.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "producer-app.jar"]
