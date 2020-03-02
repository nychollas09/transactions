FROM openjdk:jre-alpine
WORKDIR /opt/transaction/
ADD target/transaction.jar /opt/transaction/
CMD ["java","-jar","/opt/transaction/transaction.jar"]
EXPOSE 8080/tcp
