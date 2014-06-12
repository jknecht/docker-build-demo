FROM ubuntu
RUN apt-get update
RUN apt-get -y install mysql-server
EXPOSE 3306
