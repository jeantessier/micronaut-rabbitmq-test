FROM openjdk:14-alpine
COPY build/libs/consumer-app-*-all.jar consumer-app.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "consumer-app.jar"]
