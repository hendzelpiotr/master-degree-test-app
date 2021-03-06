mvn clean package

docker build -t test-app-jdk8 -f Dockerfile.jdk8 --build-arg JAR_FILE=target/master-degree-test-app-0.0.1-SNAPSHOT.jar .
docker build -t test-app-jdk11 -f Dockerfile.jdk11 --build-arg JAR_FILE=target/master-degree-test-app-0.0.1-SNAPSHOT.jar .

docker-compose -f docker-compose-jdks.yml up
