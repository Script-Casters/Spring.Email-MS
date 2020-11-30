FROM openjdk:11
EXPOSE 8081
VOLUME /tmp
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
COPY target/*.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
