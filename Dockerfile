FROM openjdk:8-jre
MAINTAINER Fill

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/cateno/cateno-pier-client.jar

ADD ../config/cateno.properties /usr/share/cateno/config/cateno.properties

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/cateno/cateno-pier-client.jar", "--spring.config.location=/usr/share/cateno/config/cateno.properties"]