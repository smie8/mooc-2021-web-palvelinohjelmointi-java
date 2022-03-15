Tehtäväpohjassa on sovellus elokuvien ja näyttelijöiden hallintaan. Tässä tehtävässä harjoitellaan hieman järjestelmätestausta FluentLeniumin avulla. Kuten edellisessä tehtävässä, tässäkään tehtävässä ei ole automaattisia testejä vaan tehtävänäsi on toteuttaa ne.

Joudut todennäköisesti turvautumaan internetiin tehtävää ratkaistessasi. Pidä kirjaa sivuista, joilta hait apua tehtävän ratkaisemiseen — tämän sivun lopussa kysytään testaustehtävien ratkaisemiseen käyttämiäsi lähteitä.

OSA 1: Näyttelijän lisääminen ja poistaminen
Luo testikansioon movies testiluokka ActorTest, johon asetat Fluentlenium-testaamiseen tarvittavat komponentit.

Toteuta luokkaan testi, jossa tehdään seuraavat askeleet:

Mennään näyttelijäsivulle
Tarkistetaan ettei sivulla ole tekstiä "Uuno Turhapuro"
Etsitään kenttä, jonka id on "name" ja asetetaan kenttään teksti "Uuno Turhapuro".
Lähetetään lomake.
Tarkistetaan että sivulla on teksti "Uuno Turhapuro"
Klikataan "Uuno Turhapuro"on liittyvää poista-nappia
Tarkistetaan ettei sivulla ole tekstiä "Uuno Turhapuro"


OSA 2: Elokuvan lisääminen ja näyttelijän lisääminen elokuvaan
Luo testikansioon movies testiluokka MovieTest, johon asetat Selenium-testaamiseen tarvittavat komponentit.

Toteuta luokkaan testi, jossa tehdään seuraavat askeleet:

Mennään elokuvasivulle
Tarkistetaan ettei sivulla ole tekstiä "Uuno Epsanjassa"
Tarkistetaan ettei sivulla ole tekstiä "Uuno Turhapuro"
Etsitään kenttä, jonka id on "name" ja lisätään siihen arvo "Uuno Epsanjassa"
Etsitään kenttä, jonka id on "lengthInMinutes" ja lisätään siihen arvo "92"
Lähetetään lomake
Tarkistetaan että sivulla on teksti "Uuno Epsanjassa"
Tarkistetaan ettei sivulla ole tekstiä "Uuno Turhapuro"
Mennään näyttelijäsivulle
Tarkistetaan ettei sivulla ole tekstiä "Uuno Turhapuro"
Etsitään kenttä, jonka id on "name" ja asetetaan kenttään teksti "Uuno Turhapuro"
Lähetetään lomake
Tarkistetaan että sivulla on teksti "Uuno Turhapuro"
Etsitään linkki, jossa on teksti "Uuno Turhapuro" ja klikataan sitä
Etsitään nappi, jonka id on "add-to-movie" ja klikataan sitä.
Mennään elokuvasivulle
Tarkistetaan että sivulla on teksti "Uuno Epsanjassa"
Tarkistetaan että sivulla on teksti "Uuno Turhapuro"
