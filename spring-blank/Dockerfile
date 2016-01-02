FROM java:openjdk-8-jdk

ADD target/spring-boot-docker-blank.jar /opt/spring-boot-docker-blank/
EXPOSE 8080
WORKDIR /opt/spring-boot-docker-blank/
CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "spring-boot-docker-blank.jar"]

#sudo docker run -p 8080:8080 -t spring-boot-docker-demo