Tässä tehtävässä toteutetaan sovellus gif-kuvien varastointiin ja selaamiseen.

Pääset toteuttamaan huomattavan osan sovelluksesta itse — tarkista että suunnittelemasi domain-oliot sopivat yhteen annetun näkymän kanssa.

Tehtäväpohjassa olevassa gifs.html-sivussa on toiminnallisuus, minkä avulla kuvia näytetään käyttäjälle.

Toteuta toiminnallisuus, jonka avulla seuraavat toiminnot ovat käytössä.

Kun käyttäjä tekee GET-tyyppisen pyynnön osoitteeseen /gifs, hänet ohjataan osoitteeseen /gifs/1.
Kun käyttäjä tekee GET-tyyppisen pyynnön osoitteeseen /gifs/{id}, hänelle näytetään sivu gifs. Pyynnön modeliin tulee lisätä attribuutti count, joka 
sisältää tietokannassa olevien kuvien määrän. Tämän lisäksi, pyyntöön tulee lisätä attribuutti next, joka sisältää seuraavan kuvan tunnuksen — jos 
sellainen on olemassa, attribuutti previous, joka sisältää edeltävän kuvan tunnuksen — jos sellainen on olemassa, ja current, joka sisältää nykyisen kuvan 
tunnuksen — jos sellainen on olemassa.
Kun käyttäjä tekee GET-tyyppisen pyynnön osoitteeseen /gifs/{id}/content, tulee hänelle palauttaa tunnukslla {id} tietokannassa oleva kuva — vastauksen 
mediatyypiksi tulee asettaa myös image/gif.
HTML-sivulla on myös lomake, jonka avulla palvelimelle voi lähettää uusia kuvia. Toteuta palvelimelle toiminnallisuus, jonka avulla osoitteeseen /gifs 
tehdystä POST-pyynnöstä otetaan sisältö talteen ja tallennetaan se tietokantaan. Huom! Tallenna sisältö vain jos sen mediatyyppi on image/gif. Pyyntö 
uudelleenohjataan aina lopuksi osoitteeseen /gifs.
