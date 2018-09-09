_`Statische Filterung`_
@JsonIgnore

`Dynamische Filterung`
Methoden filtern unterschiedliche Variablen aus dem Response
MappingJacksonValue ...

`Versionierung`
1. Möglichkeit: URI Versioning: v1/person v2/person in url 
2. Möglichkeit: Request Param Versioning: über params z.B. /person?version=1 oder person?version=2
3. Möglichkeit: Custom Header Versioning: über request header z.B. X-API-VERSION (key) und 2 (value)
4. Möglichkeit: Media Type Versioning: über produces accept header z.B. application/vnd.company.app-v2+json

Was muss man beachten!!!!
1. 3 und 4 keine Möglichkeit vom Caching
2. Dokumentation bei 3 und 4 nicht so einfach
3. 3 und 4 nicht einfach aufzurufen über Browser

`Spring Security - Basic Authentication`
nur in pom starter security mitaufnehmen und application.properties anpassen. Funktioniert aber leider nicht.

`Spring JPA`
@Entitiy
@Id
@GeneratedValue

spring.jpa.show-sql=true (zeigt SQLs im Log an)
spring.h2.console.enabled=true (ermöglicht das Zugreifen auf die h2 console über localhost:8080/h2-console)

`Wichtige Tipps beim Benutzen von Restful Services`
Benutze den richtigen Http Request GET, POST, PUT, DELETE
Gib die richtige Http Antwort:
1. 200
2. 201 Erfolgreich angelegt
3. 401 Unauthorized
4. 400 Bad Request Validerungsfehler
5. 404 Not found

Benutze Plurals in der Url


TODO:
nochmals Hateos anschauen


`Was charakterisiert einen Microservice?`
1. REST
2. klein und leicht deploybar
3. cloud fähig (leicht neue Instanzen hinzuzufügen oder zu reduzieren)

`Schwierigkeit Microservices`
1. Das richtige Schneiden. Zu Beginn sehr schwierig. Kommt oft mit der Zeit, indem man mehr fachliches Wissen sammelt.
2. Microservice Konfigurationen (Configuration Management)
3. Dynamische Skalierung (mehr Instanzen, weniger) + dynamisches load balancing
4. Sichtbarkeit was passiert bei Fehler mit einem Microservice
5. Tolerantes Fehlerhandling, dass nicht die ganze Applikation down geht

`Spring Cloud`
1. Eureka - Naming Server
2. Ribbon - Load balancing
3. Feign Easier Rest Client
4. Hystrix - Fault tolerance
5. Zuul - Api Gateway
6. Spring Cloud Config Server - Config Server

`Vorteile Microservices`
1. Verschiedene Technologien pro Microservices
2. Dynamisches Skalierung (siehe Allianz Abwerberunde oder Amazon Weihnachtsgeschäft)
3. schnellere Release-Zyklen Neue Features bringt man schneller live

`Spring Cloud Config Server`
Was ist das? 
Spring Cloud Config Server stellt jedem Service der an ihm angebunden ist, zentral Konfigurationen zur Verfügung
Diese Konfiguration ist z.B. ein GitRepository
1. @EnableConfigServer 
wichtig zu setzen, damit die Spring Boot Applikation als Config Server funktionieren kann.
2. in der application.properties spring.cloud.config.server.git.uri setzen
3. Services die mit dem Cloud Config Server sprechen wollen müssen ihre application.properties zu 
    bootstrap.properties abändern und dort spring.cloud.config.uri setzen.
    
`Wie können sich Services untereinander aufrufen`
1. Spring bietet als erste Alternative das RestTemplate an. RestService calls RestService
2. Spring Feign (Rest Client)

`Spring Feign`
Spring Feign ist ein Rest Client, der sehr einfach Zugriff auf einen anderen Restservice ermöglicht.
@FeignClient(name = "currency-exchange-service")

`Spring Ribbon`
Spring Ribbon ist ein Load Balancer.
@RibbonClient(name = "currency-exchange-service") + 
currency-exchange-service.ribbon.listOfServers=http://localhost:8000,http://localhost:8001 (application.properties)

`Spring Eureka`
Eureka ist ein Naming Service
Warum benötigt man einen Naming Service? Wenn man Instanzen eines Microservices
erhöhen oder reduzieren möchte, dann müsste man jedes Mal listOfServers anpassen.
Dies ist jedoch nicht nötig mit einem Naming Service. Hier frägt der Service erst an
bevor er seinen Call an einen anderen Service absetzt. D.h. so erfährt er automatisch von 
den aktiven Instanzen eines Services.
1. @EnableEurekaServer (wichtig zu setzen)
2. Port 8761
3. @EnableDiscoveryClient und eureka.client.service-url.default-zone=http://localhost:8761/eureka (application.properties)

`Zuul - API Gateway`
1. Authentication und Security
2. Limits pro Aufruf in der Stunde
3. Fehler Toleranz
4. Aufsetzen mit @EnableZuul und natürlich wieder @EnableDiscoveryClient + application.properties


`Spring Sleuth`
Tracing in verteilten Systemen. Spring Sleuth generiert eine Id für einen Request

`@ConfigurationProperties`
wenn die Variablennamen die Namen in der application.properties matchen, dann matcht spring boot 