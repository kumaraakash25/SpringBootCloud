Minikube commands 

minikube version 
minikube status 
minikube start 
minikube node list 
minikube kubectl -- get pods -A
minikube kubectl -- apply -f deployment.yaml
minikube kubectl get all 
kubectl describe po <POD_ID>
minikube kubectl -- delete pods -l app=spring-boot-k8
kubectl delete -n NAMESPACE deployment DEPLOYMENT_NAME
minikube kubectl -- expose deploy spring-boot-k8 --type=NodePort
minikube service --url spring-boot-k8 
