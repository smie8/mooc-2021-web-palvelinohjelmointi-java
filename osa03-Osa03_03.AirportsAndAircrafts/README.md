Jatkokehitetään tässä tehtävässä sovellusta lentokoneiden ja lentokenttien hallintaan. Projektissa on jo 
valmiina ohjelmisto, jossa voidaan lisätä ja poistaa lentokoneita. Tavoitteena on lisätä toiminnallisuus 
lentokoneiden kotikenttien asettamiseksi.

Huom! Älä muokkaa tehtävän mukana tulevia HTML-sivuja.

Tallennettavat: `Aircraft` ja `Airport`.
Lisää luokkaan Aircraft attribuutti airport, joka kuvaa lentokoneen kotikenttää ja on tyyppiä Airport. 
Määrittele yhteys siten, että jokaisella koneella on yksi kotikenttä, mutta usealla lentokoneella voi olla sama 
kotikenttä.

Lisää seuraavaksi Airport-luokkaan attribuutti aircrafts, joka kuvaa kaikkia koneita, joiden kotikenttä kyseinen 
kenttä on. Attribuutin tyyppi on List<Aircraft>. Lisää yhteyteen sopiva annotaatio ja määrittele yhteys siten, 
että yhteyden omistaja on luokassa Aircraft (tämä tehdään attribuutilla mappedBy.

Lentokentän asetus lentokoneelle
Lisää sovellukselle toiminnallisuus lentokentän lisäämiseen lentokoneelle. Käyttöliittymä sisältää jo 
tarvittavan toiminnallisuuden, joten tässä tulee toteuttaa kontrolleriluokalle AircraftController uusi metodi. 
Käytä metodin nimenä assignAirport ja paluutyyppinä String. Kun käyttäjä lisää lentokoneelle lentokenttää, 
käyttöliittymä lähettää POST-tyyppisen kyselyn osoitteeseen /aircrafts/{aircraftId}/airports, missä aircraftId 
on lentokoneen tietokantatunnus. Pyynnön mukana tulee pyyntöparametri airportId, joka sisältää lentokentän 
tietokantatunnuksen.

Toteuta metodi siten, että haet aluksi pyynnössä saatuja tunnuksia käyttäen lentokoneen ja lentokentän, tämän 
jälkeen asetat lentokoneelle lentokentän ja lentokentälle lentokoneen, ja lopuksi tallennat lentokoneen.

Ohjaa lopuksi pyyntö osoitteeseen /aircrafts
