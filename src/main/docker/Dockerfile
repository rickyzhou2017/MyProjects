FROM java
MAINTAINER Ricky_Zhou <107565445@qq.com>

ADD MyProjects-1.0-SNAPSHOT.jar app.jar

RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]

#CMD ["java -jar /usr/local/MyProjects-1.0-SNAPSHOT.jar"]
