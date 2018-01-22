FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER "Michal Cwiekala"
VOLUME /tmp
ADD greg-challenge-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
