# Spring boot MicroService
## Student MicroService
This a demo project for implement spring boot microservice

- docker commands
```cmd
   - docker run --name postgresql-sql -p 5432:5432 -d -e POSTGRES_PASSWORD=password postgres
   - docker exec -it postgresql-sql psql -U postgres
   - CREATE DATABASE student;
   - CREATE DATABASE school;
```




### gateway
* dependencies:
    - gateway
    - eureka discovery server
    - config client
    - spring boot actuator
### discovery
### config-server
### student
* dependencies:
    - postgresql driver
    - lombok
    - jpa
    - spring web
    - config client
    - eureka discovery client
    - spring boot actuator
### school
* dependencies:
    - postgresql driver
    - lombok
    - jpa
    - spring web
    - config client
    - eureka discovery client
    - spring boot actuator
    - open feign 

## config-server configuration
Inside configuration folder file name should be same as application name
<br>
for e.g,:- "students"
<br>
- student/application.yml
```yml
spring:
  application:
    name: students
  config:
    import: optional:configserver:http://localhost:8888
```