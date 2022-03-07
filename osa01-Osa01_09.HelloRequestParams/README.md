Toteuta pakkauksessa hellorequestparams olevaan luokkaan 
HelloRequestParamsController seuraava toiminnallisuus:

Pyyntö polkuun /hello palauttaa käyttäjälle merkkijonon "Hello ", johon on 
liitetty param-nimisen parametrin sisältämä arvo.
Pyyntö polkuun /params palauttaa käyttäjälle kaikkien pyynnön mukana tulevien 
parametrien nimet ja arvot.
Alla olevassa kuvassa on esimerkki tilanteesta, missä selaimella on tehty pyyntö 
polkuun /params?hello=world&it=works
