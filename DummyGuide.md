Steps to run the app

1. Created a sample spring boot app with a rest endpoint
2. Validated that the endpoint is accessible by curling the endpoint `http://localhost:8080/v1/getMessage`
3. run maven package to generate the executable JAR. You need to add a maven plugin that builds the code as JAR and gives an entry point to the main class 
4. try running the JAR by executing `java -jar <spring-boot-app>.jar` to test if the JAR works well 
5. After the JAR is created in the target folder, dockerise the app which involves writing a Dockerfile 
6. The docker file contains the java version, JAR to be copied the port to be exposed and the entry point to the app 
7. Run `docker build -t <DOCKER-IMAGE> .`  Replace <DOCKER-IMAGE> with the desired image name which creates the docker image
8. If we try to deploy the Docker container without putting the image to docker hub we get ErrImagePull status
9. To  push the image to docker hub `docker login --username kumaraakash25` it will prompt for the password
10. Create a repo from the docker hub UI `springboot-k8`
11. Directly pushing is not possible so tag the image on local against the repo `docker tag springboot-k8:latest kumaraakash25/springboot-k8:latest`
12. Now push the tag to remote `docker push kumaraakash25/springboot-k8:latest`
13. Create a deployment file which defines what we are to do, number of replicas image, exposed port and some other metadata
14. To run the deployment `minikube kbectl -- apply -f deployment.yaml`
15. to check the status of deployment `minikube kubectl get all` which gives the info of all the pods running 
16. Go to the ssh inside the pods to check if the endpoint is accessible
17. To make the service to be accessed from outside the pod run the NodePost service that load balances `minikube kubectl -- expose deploy spring-boot-k8 --type=NodePort`
18. The command gives an IP and port which could be used to access the endpoint `http://127.0.0.1:63088/v1/getMessage` 