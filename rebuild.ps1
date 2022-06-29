Copy-Item -Path ".\test-spring-web\target\test-spring-web-*.jar" -Destination ".\docker\test-spring-web"
Copy-Item -Path ".\test-spring-webflux\target\test-spring-webflux-*.jar" -Destination ".\docker\test-spring-webflux"

Set-Location -Path ".\docker"

docker-compose.exe down
docker-compose.exe build
docker-compose.exe up -d

Set-Location -Path "..\"