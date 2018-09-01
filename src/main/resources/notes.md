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