FROM tomcat:8-jre8

ADD target/pblog-1.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/

CMD ["java", "-jar","webapps/pblog-1.0.1-SNAPSHOT.jar"]