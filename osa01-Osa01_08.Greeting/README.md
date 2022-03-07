Toteuta pakkauksessa greeting olevaan luokkaan GreetingController seuraava 
toiminnallisuus:

Pyyntö polkuun /greet saa parametrit name ja greeting. Pyynnön vastauksena 
palautetaan merkkijono, mikä sisältää ensin tervehdyksen (greeting) ja sitten 
nimen (name). Nämä ovat eroteltu toisistaan pilkulla.
Esimerkiksi pyyntö /greet?greeting=Greetings&name=Earthling palauttaa merkkijonon 
Greetings, Earthling. Vastaavasti pyyntö /greet?greeting=Oi&name=Mate palauttaa 
merkkijonon Oi, Mate. Parametrien järjestyksellä ei ole väliä.
