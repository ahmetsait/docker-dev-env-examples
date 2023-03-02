# syntax=docker/dockerfile:1.4

FROM maven:3.9.0-eclipse-temurin-17

WORKDIR /code

COPY pom.xml pom.xml
RUN mvn dependency:go-offline

# RUN <<EOF
# apt-get update
# apt-get install --assume-yes --no-install-recommends git
# EOF

COPY . .

RUN mvn install

CMD ["mvn", "spring-boot:run"]
