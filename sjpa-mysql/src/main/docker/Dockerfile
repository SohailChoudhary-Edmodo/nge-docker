FROM java:openjdk-8-jdk
VOLUME /tmp
ADD demo.jar demo.jar

RUN bash -c 'touch /demo.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]