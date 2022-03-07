Toteuta web-palvelin, joka kuuntelee pyyntöjä porttiin 8080.

Jos pyydetty polku on /quit, tulee palvelin sammuttaa.

Muulloin, minkä tahansa pyynnön vastaukseen kirjoitetaan resurssin siirtymisestä 
kertova (302-alkuinen) HTTP-statuskoodi sekä palvelimen osoite, eli 
http://localhost:8080 — tämä tulee tehdä HTTP-protokollan odottamassa muodossa 
eli:

HTTP/1.1 302 Found
Location: http://localhost:8080

Ota samalla selvää kuinka monta pyyntöä selaimesi tekee palvelimelle, ennen kuin 
se ymmärtää että jotain on vialla.
