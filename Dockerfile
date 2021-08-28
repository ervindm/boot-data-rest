FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=build/libs/boot-data-rest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar", "-web -webAllowOthers -tcp -tcpAllowOthers -browser"]
EXPOSE 8080