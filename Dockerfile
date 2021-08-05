FROM openjdk:11-jre-slim-buster
VOLUME /tmp
ADD target/app.jar /home/app.jar
WORKDIR "/home"
EXPOSE 7777
CMD ["java", "-Dspring.application.name=spring-boot-splunk-integration", "-Xmx512m", "-jar", "./app.jar"]
