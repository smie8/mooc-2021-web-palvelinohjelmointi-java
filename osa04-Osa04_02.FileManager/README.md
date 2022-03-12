Tässä tehtävässä toteutetaan yleisempi tiedostojen varastointiin ja näyttämiseen käytettävä sovellus.

Kuten edellisessä tehtävässä, pääset toteuttamaan huomattavan osan sovelluksesta itse — tarkista että suunnittelemasi domain-oliot sopivat yhteen annetun 
näkymän kanssa.

Toteuta toiminnallisuus, jonka avulla seuraavat toiminnot ovat käytössä.

Kun käyttäjä tekee GET-tyyppisen pyynnön osoitteeseen /files, pyyntöön lisätään tietokannasta löytyvät tiedostot ja käyttäjä ohjataan sivulle files.html.
Kun käyttäjä lähettää lomakkeella tiedoston osoitteeseen /files, pyynnöstä otetaan talteen kaikki tiedot mitä näkymässä halutaan näyttää, ja tallennetaan 
ne tietokantaan. Pyyntö ohjataan lopuksi uudelleen osoitteeseen /files.
Kun käyttäjä klikkaa yksittäiseen tiedostoon liittyvää nimeä sen lataamista varten, tulee tiedosto lähettää käyttäjälle. Aseta pyyntöön datan lisäksi myös 
tiedoston mediatyyppi että ja ehdotus tiedoston tallennusnimestä.
