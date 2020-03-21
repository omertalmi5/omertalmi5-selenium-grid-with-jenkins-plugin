FROM openjdk
FROM maven

COPY ./ /tests
WORKDIR /tests

CMD ["mvn", "test"]
