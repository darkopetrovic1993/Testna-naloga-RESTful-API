Namig: Spring Boot implementacija je izjemno preprosta (https://start.spring.io/). 
Za vzpostavitev projekta (build tool, dependency manager...) bi pripročal maven ali gradle.

Bazo se lahko namesti:

direktno na OS: https://www.postgresql.org/download/ ALI

uporaba docker container: https://hub.docker.com/_/postgres/

Testna-naloga-Result

Naloga RESTful API implementacija:

Implementiraj endpoint, ki vrača odgovor z besedilom "Hello world!"

Implementiraj endpoint, ki sprejme zahtevek, ki vsebuje datum, nato pa ta datum shrani v PostgreSQL podatkovno bazo. V kolikor Vam razvojno okolje ne omogoča shranjevanje v PostgreSQL bazo, lahko izberete poljubno bazo.

(Opcijsko) Namesti Swagger vmesnik, ki razvijalcem omogoča: a. Prebiranje dokumentacije za endpointe, ki si jih implementiral. b. Interakcijo z endpointi.

(Opcijsko) Pripravi avtomatske teste, ki zagotavljajo skladnost delovanja APIja s specifikacijo.

(Opcijsko) Pripravi delujočo verzijo z uporabo Docker Hub. Dodaj kratka navodila za uporabo.
