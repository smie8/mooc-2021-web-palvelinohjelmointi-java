Luo sovellukseen toiminnallisuus, jonka avulla sovelluksessa luodaan kaksi tietokantataulua sekä niiden välinen 
liitostaulu. Tietokantataulujen nimien tulee olla Student ja Course. Liitostaulun nimen tulee olla Enrollment.

Tietokantataulussa Student tulee olla sarakkeet id, first_name ja last_name. Tietokantataulussa Course tulee 
olla sarakkeet id ja name. Liitostaulussa Enrollment tulee olla sarakkeet course_id ja student_id, jotka ovat 
nimensä mukaisesti viiteavaimia taulujen Course ja Student pääavaimiin.

Hyödyt sarakkeiden nimeämisessä annotaatioista @Column, @JoinColumn ja @JoinTable. Kannattaa käyttää 
H2-tietokannanhallintajärjestelmän konsolia tietokannan tarkasteluun — tietokannan voi tyhjentää poistamalla 
tehtäväpohjassa olevat database-alkuiset tiedostot.
