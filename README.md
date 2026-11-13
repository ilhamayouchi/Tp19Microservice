# TP19 : Orchestration de microservices avec Spring Cloud: Eureka, Gateway et OpenFeign

## Architecture

| Composant | Nom Eureka | Port |
|---|---|---|
| Eureka Server | - | 8761 |
| Microservice Client | SERVICE-CLIENT | 8088 |
| Microservice Voiture | SERVICE-VOITURE | 8089 |
| Gateway | GATEWAY | 8888 |

## Tests 

### 1. Eureka

- http://localhost:8761/ : `SERVICE-CLIENT`, `SERVICE-VOITURE` et `GATEWAY` doivent apparaître.

<img width="1894" height="832" alt="Dashboard Eureka" src="https://github.com/user-attachments/assets/979ca6ef-c26e-4093-bff1-94322f3401cf" />

### 2. Microservices 

- Client : http://localhost:8088/clients et http://localhost:8088/client/1
- Voiture : http://localhost:8089/voitures, http://localhost:8089/voitures/1 et http://localhost:8089/voitures/client/1

<img width="1119" height="120" alt="Test microservices 1" src="https://github.com/user-attachments/assets/e040242c-9333-4996-bdc6-a0a3fc8994a0" />

<img width="559" height="148" alt="Test microservices 2" src="https://github.com/user-attachments/assets/c5075267-3d83-4be1-bc03-a060cdc2f5ad" />

### 3. Gateway 

- http://localhost:8888/clients
- http://localhost:8888/client/1
- http://localhost:8888/voitures

<img width="571" height="195" alt="Test Gateway 1" src="https://github.com/user-attachments/assets/6ac554e0-9beb-491d-8aa9-1720eca10727" />

<img width="362" height="172" alt="Test Gateway 2" src="https://github.com/user-attachments/assets/bf34ac78-30b4-4522-9277-7fea68be1111" />

### 4. Gateway (dynamique)

- http://localhost:8888/SERVICE-CLIENT/clients
- http://localhost:8888/SERVICE-VOITURE/voitures

<img width="841" height="217" alt="Test Gateway dynamique 1" src="https://github.com/user-attachments/assets/59a62815-c203-49d1-9aa1-2b2b51dfc356" />

<img width="577" height="110" alt="Test Gateway dynamique 2" src="https://github.com/user-attachments/assets/13a9c7ac-42a1-41b1-be60-d76ab0a63d49" />

<img width="822" height="104" alt="Test Gateway dynamique 3" src="https://github.com/user-attachments/assets/3528b0f9-f3ee-4949-b6f4-4ae9c1b701a1" />
