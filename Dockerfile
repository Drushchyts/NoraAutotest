FROM maven:3.3.9-jdk-8-alpine
#FROM selenium/standalone-chrome:latest

COPY . /home/SeleniumTestFramework

#COPY pom.xml /home/SeleniumTestFramework
#COPY chromedriver /home/SeleniumTestFramework

COPY src/test/resources/TestNG.xml /home/SeleniumTestFramework

RUN mvn -f /home/SeleniumTestFramework/pom.xml clean test

EXPOSE 4444