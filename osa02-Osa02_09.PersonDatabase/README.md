Luo sovellus henkilöiden tallentamiseen ja listaamiseen. Tehtäväpohjassa on valmiina mukana index.html-tiedosto, 
joka sisältää listaustoiminnallisuuden sekä lomakkeen uuden henkilön lisäämiseksi.

Tehtävässä sinun tulee:

Luoda luokka Person. Lisää luokalle merkkijonomuotoinen attribuutti name ja tee luokasta entiteetti.
Luoda henkilöiden tallentamiseen tarkoitettu rajapinta PersonRepository, joka perii rajapinnan JpaRepository. 
Käytä rajapinnan JpaRepository tyyppiparametreina luokkaa Person sekä luokan Person pääavaimen tyyppiä.
Muokata luokkaa PersonDatabaseController siten, että luokalla on kaksi metodia:

Sovelluksen juuripolkuun tulevan GET-pyynnön käsittelevä metodi hakee tietokannasta kaikki henkilöoliot, lisää 
ne modeliin (Model-tyyppinen olio) avaimella "persons", ja siirtää käsittelyvastuun Thymeleafille.
Sovelluksen juuripolkuun tulevan POST-pyynnön käsittelevä metodi luo uuden henkilöolion, tallentaa sen 
tietokantaan, ja uudelleenohjaa selaimen tekemään uuden GET-tyyppisen pyynnön sovelluksen juuripolkuun.
Sovellus luo oletuksena tehtäväpohjan juuripolkuun tietokantatiedostot database.mv.db ja database.trace.db. Jos 
haluat tyhjentää tietokannan, poista nämä tiedostot ja käynnistä sovellus uudestaan (tai, vaihtoehtoisesti, 
lisää ohjelmaan poistotoiminnallisuus..)


