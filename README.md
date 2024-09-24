![work status](https://img.shields.io/badge/work-on%20progress-red.svg)
![Ngor Seck](https://img.shields.io/badge/Ngor%20Seck-Java-green)
![PHP](https://img.shields.io/badge/Ngor%20Seck-SpringBoot-yellowgreen)

### REQUIREMENTS
Prérequis pour démarrer le projet  :
```
    Java 17 
    Docker 
    maven
```
### Faites un clone
:rocket:

* Go

```bash 
git clone https://github.com/ngorseck/admin-app.git
# Executer la commande docker-compose 
docker compose up -d
# Démarrer le projet pour les tests 

```
#### Objectifs
--- 
```
Ce code va vous permettre de comprendre :
-Comment fonctionne une application spring boot ?
-Comment mettre en place une architecture Java spring boot ?
-Comment utiliser docker pour mettre en place un environnement de dev autonome ?
-Comment mettre en place un micro service ?
```

### K8S : Vous devez installer minikube et kubectl
--- 
```
minikube version
minikube start --driver=docker
minikube status
kubectl version
kubectl config view
kubectl get nodes
```

```
cd k8s/docs
kubectl apply -k ./
kubectl delete -k ./
```

```
kubectl apply -f mysql-configMap.yaml

kubectl get po
kubectl exec -it mysql-6f47fd4d95-r6wd4 /bin/bash
mysql -u root -p
CREATE USER 'user'@'localhost' IDENTIFIED BY 'user123';
CREATE DATABASE IF NOT EXISTS adminapp;
GRANT ALL PRIVILEGES ON adminapp.* TO 'user'@'localhost';
FLUSH PRIVILEGES;
mysql -u user -p
```

```
To check the events:
kubectl get events --sort-by=.metadata.creationTimestamp
```

### Tests ###
--- 
```
kubectl get deployment
```
![img.png](img.png)

```
minikube dashboard
```
![img_1.png](img_1.png)

Dashboard

![img_2.png](img_2.png)

![img_3.png](img_3.png)

```
kubectl get svc
```
![img_4.png](img_4.png)

```
minikube service admin-app-svc --url
```
![img_5.png](img_5.png)

L'URL d'accès à l'application est :
![img_6.png](img_6.png)

![img_7.png](img_7.png)

Postman
![img_8.png](img_8.png)

![img_9.png](img_9.png)

![img_10.png](img_10.png)



### Contact
--- 
```
Email
```
:email:  ngorsecka@gmail.com

