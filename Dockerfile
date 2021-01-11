FROM maven:3.3.9-jdk-8-alpine

COPY src /home/SeleniumTestFramework/src
COPY pom.xml /home/SeleniumTestFramework
COPY src/test/resources/TestNG.xml /home/SeleniumTestFramework

COPY src/test/resources/TestNG.xml /home/SeleniumTestFramework

RUN mvn -f /home/SeleniumTestFramework/pom.xml clean test -DskipTests=true
