FROM openjdk
FROM maven

COPY ./ /tests
WORKDIR /tests

RUN mvn install -DskipTests

CMD ["mvn", "test"]
