FROM openjdk:8-jre
COPY target/demo-*jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]