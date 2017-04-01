FROM openjdk:8-alpine

RUN mkdir /myapp

WORKDIR /myapp

COPY target/docker-0.0.1-SNAPSHOT.jar /myapp

EXPOSE 8888

CMD java -jar docker-0.0.1-SNAPSHOT.jar
