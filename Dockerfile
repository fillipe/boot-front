FROM openjdk:8-jre
MAINTAINER Phill

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]