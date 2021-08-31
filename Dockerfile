FROM openjdk
ADD targer/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
CMD java -jar backend-0.0.1-SNAPSHOT.jar