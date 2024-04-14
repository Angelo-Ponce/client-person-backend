FROM eclipse-temurin:17-jdk

COPY build/libs/client-person-root-0.0.1-SNAPSHOT.jar neoris-client-ws-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","neoris-client-ws-0.0.1-SNAPSHOT.jar"]