# TP19 :  Microservices Spring Cloud (Eureka, Gateway, OpenFeign)

Les tests (Étape 10)
- Eureka : http://localhost:8761/  -> SERVICE-CLIENT, SERVICE-VOITURE, GATEWAY
- Microservices : :8088/clients, :8088/client/1, :8089/voitures, :8089/voitures/1, :8089/voitures/client/1
- Gateway (statique/Eureka) : :8888/clients, :8888/client/1, :8888/voitures
- Gateway (dynamique) : :8888/SERVICE-CLIENT/clients, :8888/SERVICE-VOITURE/voitures
- Console H2 : http://localhost:8088/h2-console et :8089/h2-console
