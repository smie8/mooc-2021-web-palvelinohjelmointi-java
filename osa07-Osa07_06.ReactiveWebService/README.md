Osoitteessa https://spring.io/guides/gs/reactive-rest-service/ on opas reaktiivisen web-sovelluksen kehittämisen aloittamiseen.

Käy opas läpi ja toteuta se tehtäväpohjaan. Kun olet valmis, palauta tehtävä TMC:lle. Riippuvuudet ovat tehtäväpohjassa valmiina.

Huom! Oppaassa pakkauksena käytetään pakkausta hello. Käytä tehtävässä pakkausta reactiveweb.

Tehtävään ei ole automaattisia testejä, mutta toteutat tehtävässä testejä.

Päivitys: Linkin takana olevan materiaalin päivityksen myötä osa tehtävästä saattaa olla toimimatta. Mikäli testi ei toimi niin voit vaihtaa importit seuraavasti:

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
sekä vaihtaa ExtendWith rivi seuraavaksi @RunWith(SpringRunner.class). Syynä päivittynyt JUnit-versio.
