Tehtävässä on hahmoteltu viestien näyttämiseen tarkoitettua sovellusta.

Luo sovellukseen tietoturvakonfiguraatio, missä määritellään kaksi käyttäjää. Ensimmäisellä käyttäjällä "user", jonka salasana on "password" on "USER"-oikeus. Toisella käyttäjällä "postman", jonka salasana on "pat", on "POSTER"-oikeus. Toteuta tietoturvakonfiguraatio siten, että käyttäjiä ei lisätä tietokantaan.

Muokkaa näkymää messages.html siten, että vain käyttäjät, joilla on "POSTER"-oikeus näkee lomakkeen, jolla voi lisätä uusia viestejä.

Muokkaa lisäksi konfiguraatiota siten, että käyttäjä voi kirjautua ulos osoitteesta /logout. Voit käyttää seuraavaa koodia (joutunet lisäämään konfiguraatioon muutakin..).

http.formLogin()
    .permitAll()
    .and()
    .logout()
    .logoutUrl("/logout")
    .logoutSuccessUrl("/login");
Lisää tämän jälkeen sovellukseen metoditason suojaus millä rajoitat POST-pyyntöjen tekemisen osoitteeseen /message vain käyttäjille, joilla on "POSTER"-oikeus. Vaikka testit päästäisivät sinut läpi jo ennen tämän toteutusta, tee se silti.
