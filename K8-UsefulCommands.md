**Minikube commands**
1. minikube version 
2. minikube status 
3. minikube start : _to start the cluster_
4. minikube node list : _gives a list of all the nodes_  
5. minikube kubectl -- get pods -A
6. minikube kubectl -- apply -f deployment.yaml : _to deploy an image to cluster_
7. minikube kubectl get all 
8. kubectl describe po [pod_id] : _to check the status of the pod_
9. minikube kubectl -- delete pods -l app=spring-boot-k8 : _not very useful as pods keeps retrying to deploy with same config_
10. kubectl delete -n [namespace] deployment [deployment_name] : _deletes the pod permanently_
11. minikube kubectl -- expose deploy spring-boot-k8 --type=NodePort : _creates a service that allows pod to be connected from outside world_
12. minikube service --url spring-boot-k8 : _gives the URL which would be used for connecting to the Pod_

**Kubectl commands** 
1. kubectl version 
2. kubectl cluster-info 
3. kubectl get all
4. kubectl port-forward [pod] [ports]
5. kubectl create [resource] - _creates_
6. kubectl apply [resource] - _creates/ modify_ 
