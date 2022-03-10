Tehtäväpohja sisältää sovelluksen, joka sisältää henkilöitä ja osoitteita. Jokainen henkilö asuu tietyssä 
osoitteessa ja osoitteessa voi asua useita henkilöitä. Sovelluksessa tulostetaan kaikki tietokannassa olevat 
henkilöt sekä heidän osoitteensa.

Tämän hetkinen ratkaisu ei ole kovin optimaalinen, sillä sovelluksen toteutuksessa on N+1 -kyselyn ongelma.

Korjaa ongelma. Muokkaa sovellusta siten, että henkilöiden ja heidän osoitteidensa tulostaminen tapahtuu 
sovelluksessa yhdellä SQL-kyselyllä.

Tehtävässä ei ole testejä. Mielenkiintoisesti omalla koneella testattaessa voi käydä niin, ettei hitautta huomaa 
— huomaat ongelman vähintäänkin sovelluksen lokeista.
