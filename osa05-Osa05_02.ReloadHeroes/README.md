Reload Heroes -sovellus pitää kirjaa käyttäjän tekemistä sivun uudelleenlatauksista. Kun käyttäjä saapuu sovellukseen ensimmäistä kertaa, hänelle luodaan satunnainen käyttäjätunnus ja hänen vierailujen määrä asetetaan yhteen. Jokaisen uudelleenvierailun yhteydessä käyttäjän vierailujen määrä kasvaa yhdellä.

Täydennä luokan ReloadController metodin reload toimintaa seuraavasti.

Metodin tulee palauttaa model-attribuuttina "scores" viisi eniten uudelleenlatauksia tehnyttä käyttäjää suuruusjärjestyksessä. Listan ensimmäisellä sijalla on eniten uudelleenlatauksia tehnyt henkilö, toisella sijalla toiseksi eniten jne.
Metodin tulee lisäksi palauttaa pyynnön tehneeseen henkilöön liittyvä ReloadStatus-olio modelin attribuuttina status. Jos käyttäjä ei ole tehnyt yhtäkään pyyntöä aiemmin, tulee käyttäjälle luoda uusi tunnus sekä alustaa uudelleenlatausten määrä yhteen. Jos taas käyttäjä on tehnyt pyyntöjä aiemmin, tulee käyttäjän tekemien pyyntöjen määrää kasvattaa yhdellä. Tieto pyyntöjen määrästä tulee myös tallentaa tietokantaan.
Voit testata sovelluksen toimintaa selaimen anonyymitilassa. Anonyymitilassa selain ei lähetä normaalitilassa kertyneitä evästeitä palvelimelle.
