FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/student-management.jar
ADD ${JAR_FILE} student-management.jar
ENTRYPOINT ["java", "-jar","student-management.jar"]
