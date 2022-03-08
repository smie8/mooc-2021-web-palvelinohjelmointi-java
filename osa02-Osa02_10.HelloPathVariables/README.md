Tehtäväpohjassa on sovellus, jossa käsitellään Item-tyyppisiä olioita. Kun sovelluksen juureen tehdään pyyntö, 
käyttäjälle näytetään oletushattu ("default"). Tehtäväpohjaan on määritelty hajautustaulu, joka sisältää 
erilaisia hattuja.

Lisää sovellukseen toiminnallisuus, jonka avulla käyttäjä voi hakea hajautustaulusta hattuja. Esimerkiksi, 
mikäli käyttäjä tekee pyynnön polkuun /ascot, tulee hänelle näyttää hatun Ascot cap tiedot. Vastaavasti, jos 
käyttäjä tekee pyynnön polkuun /bicorne, tulee käyttäjälle näyttää hatun Bicorne tiedot.

Luo siis uusi pyyntöjä käsittelevä metodi, joka käsittelee ennalta määräämättömän muotoisiin polkuihin tehtyjä 
pyyntöjä, ja palauttaa pyynnön polun perusteella käyttäjälle hatun tiedot. Käytä tässä polkumuuttujan tyyppinä 
merkkijonoa.
