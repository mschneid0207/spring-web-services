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