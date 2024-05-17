#define base docker image
FROM openjdk:21
LABEL maintainer="springdocker.sample"
ADD spingboot-docker-demo/target/spingboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
