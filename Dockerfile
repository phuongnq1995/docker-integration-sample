FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","${JAVA_OPTS}","-jar","/app.jar"]