## Micronaut 3.6.1 Documentation

```
./gradlew shadowJar
docker build -f Dockerfile -t testecargamicronaut .
docker run -i --rm -p 8080:8080  testecargamicronaut
siege  -b -c 1000 -t 60s   http://localhost:8080/
```
