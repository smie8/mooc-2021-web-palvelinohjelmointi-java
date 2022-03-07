Tehtäväpohjan mukana tulevaan HTML-tiedostoon on toteutettu tarina, joka tarvitsee otsikon ja päähenkilön. 
Toteuta pakkauksessa hellomodel sijaitsevaan HelloModelController-luokkaan toiminnallisuus, joka käsittelee 
juuripolkuun tulevia pyyntöjä ja käyttää pyynnössä tulevia parametreja index.html-tiedostossa olevan tarinan 
täydentämiseen.

Pyynnön mukana tulevat parametrit ovat nimeltään title ja person. Molemmat ovat merkkijonomuotoisia.

Lisää pyynnön mukana tulevien parametrien arvot Thymeleafille annettavaan Model-olioon. Otsikon avaimen tulee 
olla "title" ja henkilön avaimen tulee olla "person". Palautettava sivu on kansiossa 
src/main/resources/templates/ oleva index.html.
