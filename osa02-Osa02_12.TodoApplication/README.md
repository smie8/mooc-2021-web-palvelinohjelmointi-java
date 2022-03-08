Tässä tehtävässä tulee rakentaa tietokantaa käyttävä tehtävien hallintaan tarkoitettu sovellus. Sovelluksen 
käyttämät html-sivut ovat valmiina, sovelluksen muut osat pääset toteuttamaan itse.

Sovellukseen tulee lisätä seuraavat toiminnallisuudet:

- Kaikkien tehtävien listaaminen. Kun käyttäjä tekee pyynnön sovelluksen juuripolkuun, tulee hänelle näyttää 
sivu, 
missä tehtävät on listattuna. Tehtäväpohjan mukana tuleva HTML-sivu sisältää tiedon Modeliin lisättävän listan 
nimestä sekä valmiin HTML-lomakkeen.
- Yksittäisen tehtävän lisääminen. Kun käyttäjä täyttää lomakkeen ja lähettää tiedot palvelimelle, tulee 
sovelluksen lisätä tehtävä näytettävään listaan.
- Yksittäisen tehtävän näyttäminen. Kun käyttäjä klikkaa tehtävään liittyvää linkkiä, tulee käyttäjälle näyttää 
yhden tehtävän tiedot näyttävä sivu. Tämän lisäksi, tehtävän näyttämisen yhteydessä, tehtävään liittyvien 
tarkastusten eli katselukertojen määrän tulee kasvaa yhdellä. Toteuta tämä niin, että haet tietokannasta olion 
(rajapinnan metodi getOne), päivität siihen liittyvää katselukertoja kuvaavan muuttujan arvoa, ja tallennat 
olion tietokantaan (rajapinnan metodi save).
