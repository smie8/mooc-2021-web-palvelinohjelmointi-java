Tässä tehtävässä toteutetaan verkkokauppaan ostoskoritoiminnallisuus.

OSA 1: Ostoskori
Luo pakkaukseen euroshopper luokka ShoppingCart, joka tarjoaa seuraavat toiminnallisuudet.

Metodi getItems() palauttaa Map<Item, Long>-tyyppisen olion, joka sisältää ostoskorissa olevien tuotteiden tuotekohtaisen lukumäärän.
Metodi addToCart(Item item) lisää ostoskoriin yhden kappaleen Item-tyyppistä esinettä.

OSA 2: Kontrolleri ostoskorille
Tee ostoskorista sessiokohtainen, jolloin eri käyttäjien tulee saada eri ostoskori käyttöönsä. Annotaatiosta @Scope on tässä hyötyä.

Luo projektiin sopiva kontrolleri, joka tarjoaa seuraavat osoitteet ja toiminnallisuudet.

GET /cart asettaa model-olion "items"-nimiseen attribuuttiin ostoskorin sisällön (aiempi getItems()). Pyynnön vastauksena käyttäjälle näytetään sivu, joka luodaan polussa /src/main/resources/templates/cart.html olevasta näkymästä.
POST /cart/items/{id} lisää ostoskoriin yhden {id}-tunnuksella tietokannasta löytyvän Item-olion. Pyyntö ohjataan osoitteeseen /cart.

OSA 3: Tilauksen tekeminen
Muokkaa luokkaa euroshopper.OrderController siten, että kun käyttäjä tekee POST-tyyppisen pyynnön osoitteeseen /orders, tilaus tallennetaan tietokantaan. Tutustu luokkiin Order ja OrderItem ennen toteutusta. Varmista että esimerkiksi OrderItem viittaa oikeaan tietokantatauluun.

Kun tilaus on tehty, tyhjennä myös ostoskori.
