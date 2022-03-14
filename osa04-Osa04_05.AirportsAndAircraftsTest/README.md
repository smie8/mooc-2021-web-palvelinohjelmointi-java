
Osa 1: AirportServiceTest
Sovelluksessa on luokka AirportService, mikä sijaitsee pakkauksessa airports. Sille ei kuitenkaan ole yhtäkään testiä :(

Testaustehtävät saattavat vaatia toiminnallisuuksia aiemmin toteuttamistasi tehtävistä. Voit käyttää apuna toteutuksessa joko omaa vastaustasi tai mallivastausta.

Lisää testikansion (Test Packages) pakkaukseen airports luokka AirportServiceTest.

Lisää luokalle AirportServiceTest tarvittavat annotaatiot ja injektoi sinne oliomuuttujiksi AirportService ja AirportRepository -oliot. Toteuta luokkaan AirportServiceTest testimetodit, joiden avulla testataan, että luokan AirportService metodit toimivat oikein. Haluat varmistaa että:

Kun uusi lentokenttä luodaan AirportService-luokan metodilla create, lentokenttä tallentuu tietokantaan ja tietokannasta löytyy annetuilla lentokenttä annetuilla parametreilla. Tee tälle tarkastukselle oma testimetodi.
Kun lentokentät haetaan luokan AirportService metodilla list, metodi palauttaa kaikki tietokannassa olevat lentokentät. Tee tälle tarkastukselle oma testimetodi. Testimetodin alussa kannattaa lisätä tietokantaan muutamia lentokenttiä, jolloin tietokanta ei ole varmasti tyhjä.
Kun luokan AirportService metodilla create luodaan jo tietokannassa oleva lentokenttä, ei tietokantaan tule uutta samannimistä lentokenttää. Tee tälle tarkastukselle oma testimetodi. Kun ajat testit, huomaat, että tätä tarkastusta ei ole toteutettu luokan AirportService metodiin create. Lisää tarkastus myös create-metodiin.

Osa 2: AircraftControllerTest
Lisää testikansion (Test Packages) pakkaukseen airports luokka AircraftControllerTest. Lisää luokkaan tarvittavat määrittelyt, jotta voit käyttää MockMvc-komponenttia testeissä.

Tee seuraavat testit:

Kun osoitteeseen /aircrafts tehdään GET-pyyntö, vastauksen status on 200 (ok) ja vastauksen model-oliossa on parametrit aircrafts ja airports.
Kun osoitteeseen /aircrafts tehdään POST-pyyntö, jonka parametriksi annetaan name-kenttä, jonka arvona on "HA-LOL", pyynnön vastaukseksi tulee uudelleenohjaus. Tee tämän jälkeen erillinen kysely tietokantaan esim. AircraftRepository:n avulla, ja varmista, että tietokannasta löytyy lentokone, jonka nimi on HA-LOL.
Kun osoitteeseen /aircrafts tehdään POST-pyyntö, jonka parametriksi annetaan name-kenttä, jonka arvona on "XP-55", pyynnön vastaukseksi tulee uudelleenohjaus. Tee tämän jälkeen GET-pyyntö osoitteeseen /aircrafts, ja tarkista että pyynnön vastauksena saatavan model-olion sisältämässä "aircrafts"-listassa on juuri luotu lentokone.
