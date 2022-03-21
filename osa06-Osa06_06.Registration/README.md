Tehtävän mukana tulee sovellus, jota käytetään ilmoittatumiseen. Tällä hetkellä käyttäjä voi ilmoittautua juhliin oikeastaan minkälaisilla tiedoilla tahansa. Tehtävänäsi on toteuttaa parametreille seuraavanlainen validointi:

Nimen (name) tulee olla vähintään 4 merkkiä pitkä ja enintään 50 merkkiä pitkä.
Osoitteen (address) tulee olla vähintään 4 merkkiä pitkä ja enintään 50 merkkiä pitkä.
Sähköpostiosoitteen (email) tulee olla validi sähköpostiosoite.
Tehtäväpohjan mukana tuleviin sivuihin on toteutettu valmiiksi lomake. Tehtävänäsi on toteuttaa validointitoiminnallisuus pakkauksessa registration olevaan luokkaan Registration.

Jos yksikin tarkastuksista epäonnistuu, tulee käyttäjälle näyttää rekisteröitymislomake uudelleen. Muista lisätä kontrolleriin validoitavalle parametrille annotaatio @Valid. Virheviestien ei tule näkyä vastauksessa jos lomakkeessa ei ole virhettä. Käyttöliittymä on tehtävässä valmiina.
