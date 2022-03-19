Tehtävänäsi on täydentää kesken jäänyttä varaussovellusta siten, että kaikki käyttäjät näkevät varaukset, mutta vain kirjautuneet käyttäjät pääsevät lisäämään varauksia.

Kun käyttäjä tekee pyynnön sovelluksen juuripolkuun /reservations, tulee hänen nähdä varaussivu. Alla olevassa esimerkissä tietokannassa ei ole varauksia, mutta jos niitä on, tulee ne listata kohdan Current reservations alla.

reservations emptylist
Jos kirjautumaton käyttäjä yrittää tehdä varauksen, hänet ohjataan kirjautumissivulle. Kirjautumissivun ulkoasu on todennäköisesti erilainen kuin alla kuvattu kirjautumissivu.

reservations login
Kun kirjautuminen onnistuu, voi käyttäjä tehdä varauksia.

reservations reservations
Sovelluksen tulee kirjautumis- ja varaustoiminnallisuuden lisäksi myös varmistaa, että varaukset eivät mene päällekkäin.

Tarvitset ainakin:

Palvelun käyttäjän tunnistautumiseen, jolla täydennät luokkaa SecurityConfiguration.
Tavan aikaleimojen käsittelyyn.
Kontrollerin varausten käsittelyyn ja tekemiseen.
