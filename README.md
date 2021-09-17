# Run
```
./mvnw spring-boot:run
```

## Test

Response 200:
```
 curl -ksv GET http://localhost:8080/users/007
 curl -ksv GET http://localhost:8080/users/42
```

Response 404:
```
 curl -ksv GET http://localhost:8080/users/666
```