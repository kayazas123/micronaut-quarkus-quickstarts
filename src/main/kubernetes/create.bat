kubectl create deployment micronaut-quickstart --image=elvaliev/micronaut-quickstart
kubectl create -f kubernetes.yml --record --save-config
kubectl expose deployment micronaut-quickstart --type=LoadBalancer --port=8090