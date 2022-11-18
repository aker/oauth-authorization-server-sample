## Spring Security OAuth Authorization Server

### Relevant information:

This module demonstrates OAuth authorization flow using Spring Authorization Server, Spring OAuth Resource Server and
Spring OAuth Client.

- Run the Authorization Server from the `spring-authorization-server` module
    - IMPORTANT: Modify the `/etc/hosts` file and add the entry `127.0.0.1 auth-server`
- Run the Resource Server from `resource-server` module
- Run the client from `client-server` module
- Go to `http://127.0.0.1:8080/articles`
    - Enter the credentials `admin/password`
- The module uses the new OAuth stack with Java 11

### Relevant Articles:

- [Spring Security OAuth Authorization Server](https://www.baeldung.com/spring-security-oauth-auth-server)


### Run Apps
terminal1:
```
cd spring-authorization-server
mvn spring-boot:run
```

terminal2:
```
cd resource-service
mvn spring-boot:run
```

terminal3:
```
cd client-service
mvn spring-boot:run
```

### test
browser:
```
http://127.0.0.1:8080/articles

http://127.0.0.1:8080/books
```