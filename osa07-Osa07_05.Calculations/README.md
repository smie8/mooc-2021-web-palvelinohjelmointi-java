Tehtäväpohjassa on sovellus, joka tekee "raskasta laskentaa". Tällä hetkellä käyttäjä joutuu odottamaan laskentapyynnön suoritusta pitkään, mutta olisi hienoa jos käyttäjälle kerrottaisiin laskennan tilasta jo laskentavaiheessa.

Muokkaa sovellusta siten, että laskentaolio tallennetaan kertaalleen jo ennen laskentaa — näin siihen saadaan viite; aseta oliolle myös status "PROCESSING". Muokkaa tämän jälkeen luokkaa CalculationService siten, että laskenta tapahtuu asynkronisesti.

Huom! Älä poista CalculationService-luokasta "raskasta laskentaa" kuvaavaa koodia:

try {
    Thread.sleep(2000);
} catch (InterruptedException ex) {
    Logger.getLogger(CalculationService.class.getName()).log(Level.SEVERE, null, ex);
}

Kun sovelluksesi toimii oikein, laskennan lisäyksen pitäisi olla nopeaa ja käyttäjä näkee lisäyksen jälkeen laskentakohtaisen sivun, missä on laskentaan liittyvää tietoa. Kun sivu ladataan uudestaan noin 2 sekunnin kuluttua, on laskenta valmistunut.
