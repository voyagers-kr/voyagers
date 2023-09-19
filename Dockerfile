FROM amazoncorretto:17.0.8

WORKDIR /app

COPY ./build/libs/voyagers-0.0.1-SNAPSHOT.jar /app/server.jar

ENTRYPOINT java -server ${JAVA_OPTIONS} ${JAVA_AGENT_OPTIONS} -jar server.jar
