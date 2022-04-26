FROM maven:3.8.5-openjdk-11

WORKDIR home/isa

COPY pom.xml .
COPY src src/

