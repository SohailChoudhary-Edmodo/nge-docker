nge-docker
=====

This is my work related to docker and java.

sblank
#### Build the application

```
$ mvn clean package
$ cd target
$ sudo docker build -t spring-boot-docker-demo .
```




sjpa-single

```
mvn clean package docker:build
```

sjpa-duo

```
mvn clean package -Pdocker
```


#### Deploy to Docker container

```
$ sudo docker run -p 8080:8080 -t spring-boot-docker-demo
```

#### Access

[http://localhost:8080](http://localhost:8080)
