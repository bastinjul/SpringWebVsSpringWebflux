FROM eclipse-temurin:17-alpine

EXPOSE 8080

COPY test-spring-web-*.jar /test-spring-web.jar

ENTRYPOINT [ "java", "-jar", "/test-spring-web.jar" ]