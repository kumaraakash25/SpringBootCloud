To access the rest endpoint
http://localhost:8085/v1/getMessage

Create Docker image by this command 
docker build -f Dockerfile -t spring-boot-K8 .
Run the docker image 
docker run -p 8085:8085 spring-boot-K8
