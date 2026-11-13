package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    // Étape 6 + Étape 9 : routage par nom de service via Eureka
    @Bean
    RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(r -> r.path("/clients/**").uri("lb://SERVICE-CLIENT"))
            .route(r -> r.path("/client/**").uri("lb://SERVICE-CLIENT"))
            .route(r -> r.path("/voitures/**").uri("lb://SERVICE-VOITURE"))
            .build();
    }

    /* Alternative — configuration dynamique : remplacer le bean ci-dessus par :
     *
     * @Bean
     * DiscoveryClientRouteDefinitionLocator routesDynamique(
     *         ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {
     *     return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
     * }
     * Accès : http://localhost:8888/SERVICE-CLIENT/clients
     *         http://localhost:8888/SERVICE-VOITURE/voitures
     * (imports : org.springframework.cloud.client.discovery.ReactiveDiscoveryClient,
     *  org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator,
     *  org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties)
     */
}
