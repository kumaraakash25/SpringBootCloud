FROM openjdk:11
ADD target/SpringBootCloud-0.0.1-SNAPSHOT.jar spring-boot-k8.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-k8.jar"]