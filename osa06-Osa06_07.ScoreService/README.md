Tässä tehtävässä toteutetaan pelitulospalvelu, joka tarjoaa REST-rajapinnan pelien ja tuloksien käsittelyyn. Huom! Kaikki syötteet ja vasteet ovat JSON-muotoisia olioita.

Tehtäväpohjassa on toteutettu valmiiksi luokat Game ja Score sekä niihin liittyvät Repository-rajapinnat.

OSA 1: GameController
Pelejä käsitellään luokan Game avulla.

Toteuta pakkaukseen scoreservice luokka GameController, joka tarjoaa REST-rajapinnan pelien käsittelyyn:

- POST /games luo uuden pelin sille annetun pelin tiedoilla ja palauttaa luodun pelin tiedot. (Huom. vieläkin! Pyynnön rungossa oleva data on aina JSON-muotoista. Vastaukset tulee myös palauttaa JSON-muotoisina.)
- GET /games listaa kaikki talletetut pelit.
- GET /games/{name} palauttaa yksittäisen pelin tiedot pelin nimen perusteella.
- DELETE /games/{name} poistaa nimen mukaisen pelin ja palauttaa poistetun pelin tiedot.

OSA 2: ScoreController
Jokaiselle pelille voidaan tallettaa pelikohtaisia tuloksia (luokka Score). Jokainen pistetulos kuuluu tietylle pelille, ja tulokseen liittyy aina pistetulos points numerona sekä pelaajan nimimerkki nickname.

Toteuta pakkaukseen scoreservice luokka ScoreController, joka tarjoaa seuraavan REST-rajapinnan tuloksien käsittelyyn:

- POST /games/{name}/scores luo uuden tuloksen pelille name ja asettaa tulokseen pelin tiedot. Tuloksen tiedot lähetetään kyselyn rungossa.
- GET /games/{name}/scores listaa pelin name tulokset.
- GET /games/{name}/scores/{id} palauttaa tunnuksella id löytyvän tuloksen name-nimiselle pelille.
- DELETE /games/{name}/scores/{id} poistaa avaimen id mukaisen tuloksen peliltä name (pelin tietoja ei tule pyynnön rungossa). Palauttaa poistetun tuloksen tiedot.
