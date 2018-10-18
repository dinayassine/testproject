FROM openjdk:8
VOLUME /tmp
ADD target/employe-micro-service-24-0.0.2-SNAPSHOT.jar app.jar
EXPOSE 8886
ENTRYPOINT ["java","-jar","app.jar"]