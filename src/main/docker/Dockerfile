FROM openjdk:8
MAINTAINER edison
COPY ./src/main/docker/entrypoint.sh /entrypoint.sh
COPY ./target/spring-example-0.0.1-SNAPSHOT.jar /app/spring-example-0.0.1-SNAPSHOT.jar
ADD CommitMessage.txt /app/
ENV   TZ=Asia/Shanghai \
      LANG=en_US.UTF-8 \
      LANGUAGE=en_US:en \
      LC_ALL=en_US.UTF-8
RUN chmod +x /entrypoint.sh
VOLUME /data
EXPOSE 80
ENTRYPOINT ["/entrypoint.sh"]