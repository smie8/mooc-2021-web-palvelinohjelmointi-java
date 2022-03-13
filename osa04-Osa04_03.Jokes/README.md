Tehtäväpohjassa on vitsejä kolmannen osapuolen verkkopalvelusta hakeva ja niitä käyttäjälle näyttävä sovellus. Sovellus tarjoaa vitsien tarkastelun 
lisäksi mahdollisuuden vitsien hyvyyden äänestämiseen. Tällä hetkellä sovelluksen luokka JokeController sisältää vitsien äänestämiseen liittyvää 
toiminnallisuutta.

Muokkaa sovelusta siten, että luot erillisen VoteService-luokan, joka kapseloi äänestystoiminnallisuuden. Uudessa versiossa luokan JokeController ei tule 
käyttää rajapintaa VoteRepository muuten kuin välillisesti VoteService-luokan kautta.
