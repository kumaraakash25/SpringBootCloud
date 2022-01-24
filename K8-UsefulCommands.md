Minikube commands 

1. minikube version 
2. minikube status 
3. minikube start : to start the cluster
4. minikube node list : gives a list of all the nodes  
5. minikube kubectl -- get pods -A
6. minikube kubectl -- apply -f deployment.yaml : to deploy an image to cluster
7. minikube kubectl get all 
8. kubectl describe po <POD_ID> : to check the status of the pod
9. minikube kubectl -- delete pods -l app=spring-boot-k8 : not very useful as pods keeps retrying to deploy with same config
10. kubectl delete -n NAMESPACE deployment DEPLOYMENT_NAME : deletes the pod permanently
11. minikube kubectl -- expose deploy spring-boot-k8 --type=NodePort : creates a service that allows pod to be connected from outside world
12. minikube service --url spring-boot-k8 : gives the URL which would be used for connecting to the Pod
