# spring-boot-docker-mysql
Demo Spring Boot application running inside docker container linked with MySQL container

## How to run it with Docker
Assume you already have Docker installed. See https://docs.docker.com/installation/.

First, clone the project and build locally:

~~~
git clone https://github.com/jiwhiz/spring-boot-docker-mysql.git
cd spring-boot-docker-mysql
mvn clean package docker:build
~~~

Run MySQL 5.6 in Docker container:

~~~


docker run -i -p 127.0.0.1:3306:3306 --name demo-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=demo -e MYSQL_USER=demo_user -e MYSQL_PASSWORD=demo_pass -d mysql:latest


~~~

Check the log to make sure the server is running OK:
~~~
docker logs demo-mysql


docker exec -it demo-mysql mysql -u root -p demo

~~~

Run demo application in Docker container and link to demo-mysql:

~~~
docker run -p 8080:8080 --name demo-app --link demo-mysql:mysql -d jiwhiz/spring-boot-docker-mysql
~~~

You can check the log by
~~~
docker logs demo-app
~~~

Open http://localhost:8080 in browser and you should see the message. If you are using Boot2Docker in Mac OSX, 
find ip by *boot2docker ip* and replace _localhost_ to _boot2docker ip_.

 docker stop $(docker ps -a -q)
 docker rm $(docker ps -a -q)
  docker rmi $(docker images -q)

docker run -it --link demo-mysql:mysql --rm mysql sh -c 'exec mysql -h"$MYSQLPORT3306TCPADDR" -P"$MYSQLPORT3306TCPPORT" -uroot -p"$MYSQLENVMYSQLROOTPASSWORD"'	

docker run -it --link springdocker_database_1:mysql  -e MYSQL_PWD=password -e MYSQL_HOST=mysql --rm mysql sh -c 'exec mysql -h"localhost" -P"3306" -uroot -p"password"'	

docker run --rm -it --link springdocker_database_1:mysql-server -e MYSQL_PWD=password -e MYSQL_HOST=mysql-server -c 'exec mysql -h"localhost" -P"3306" -uroot -p"password"'	


docker run -it --link springdocker_database_1:mysql  -e MYSQL_PWD=password -e MYSQL_HOST=mysql --rm mysql sh -c 'exec mysql -h"localhost" -P"3306" -uroot -p"password"'	

docker exec -it springdocker_database_1 mysql -u root -p 
