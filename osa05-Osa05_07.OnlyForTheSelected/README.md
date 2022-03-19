Sovelluksessa on Account entiteetti, jolle on määritelty käyttäjätunnus, salasana ja lista oikeuksia. Sovelluksessa näitä oikeuksia ei kuitenkaan oteta huomioon.

Muokkaa ensin luokkaa CustomUserDetailsService siten, että sovellus ottaa käyttäjän oikeudet huomioon.

Kun luokka CustomUserDetailsService huomioi käyttäjän oikeudet, suojaa sovelluksen polut seuraavasti:

Kuka tahansa saa nähdä polusta /happypath palautetun tiedon
Vain USER tai ADMIN -käyttäjät saavat nähdä polusta /secretpath palautetun tiedon
Vain ADMIN-käyttäjät saavat nähdä polusta /adminpath palautetun tiedon
