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
3. kubectl get all - _gives info about all the deployments_ 
4. kubectl get pods - _gives info about all the running pods_ 
5. kubectl describe [pod_name] 
6. kubectl port-forward [pod] [external_port]:[port_on_pod]
7. kubectl create [resource] - _creates_
8. kubectl apply [resource] - _creates/ modify_ 
9. kubectl run [pod_name] --image=nginx:alpine - _extracts image and deploys on pod_
10. kubectl delete pod [deployment_name]
11. kubectl exec [pod_name] -it sh - _to get inside the pod_
12. kubectl scale deployment [deployment_name] --replicas=5
13. kubectl get deployments --show-labels - _this would show the deployments together with deployment labels_
14. kubectl scale -f [deployment_name] --replicas=[replica_count] - _scales the deployment to replica_count_
15. kubectl delete -f [deployment_name] - _deployment name is the name of the yml file_
16. kubectl get service - _gives the listing for all the services running on the cluster_

Install curl packages
1. apk add curl