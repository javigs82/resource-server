#MY IMAGE: Example of nginx dockerfile
FROM ubuntu:14.04
MAINTAINER Javier Garcia "javigs82@gmail.com"
#RUN IS EXECUTED ON THE MACHINE
RUN apt-get update
RUN apt-get install -y nginx
RUN echo "<marquee>To the coffe</marquee>" > /usr/share/nginx/html/index.html
CMD ["nginx","-g", "daemon off;"]
EXPOSE 80
