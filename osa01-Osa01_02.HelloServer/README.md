Toteuta web-palvelin, joka kuuntelee pyyntöjä porttiin 8080.

Jos pyydetty polku on /quit, tulee palvelin sammuttaa.

Muulloin, minkä tahansa pyynnön vastaukseen tulee palauttaa HTTP-statuskoodi 200 
sekä tehtäväpohjassa olevan index.html-sivun sisältö.

Huom! Älä missään nimessä käytä kutsua System.exit palvelimen sammuttamiseen nyt 
tai myöhemmissä tehtävissä.

Huom2! Kun kirjoitat vastauksen PrintWriter-olion avulla, kutsu olion 
flush-metodia ennen yhteyden sulkemista. Tällöin vältät tilanteen, missä yhteys 
suljetaan ennen kuin kaikki tieto on todellisuudessa kirjoitettu vastaukseen 
asti.
