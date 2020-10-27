# Követelmény specifikáció

## Jelenlegi helyzet

## Vágyálom rendszer

## Jelenlegi üzleti folyamatok

## Igényelt üzleti folyamatok
4.1 **Bevételek Kezelése**

4.1.1 Kiadás felvitele az adatbázisba => Bal felső menü -> Bevétellista -> Jobb alsó
lebegő gomb -> Összeg és leírás megadása -> Hozzáad gomb megnyomása

4.1.2 Kiadás törlése az adatbázisból => Bal felső menü -> Bevétellista ->
A törölni kívánt tétel elhúzása ujjal

4.1.3 Minden Kiadás törlése az adatbázisból => Bal felső menü -> Bevétellista ->
Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

4.1.4 Kiadás szerkesztése => Bal felső menü -> Bevétellista -> Szerkeszteni kívánt
-> Kiadás kiválasztása -> Az új adatok megadása -> Mentés

4.2 **Kiadások Kezelése**

4.2.1 Kiadás felvitele az adatbázisba => Bal felső menü -> Kiadáslista -> Jobb alsó
lebegő gomb -> Összeg és leírás és csoport megadása -> Hozzáad gomb megnyomása

4.2.2 Kiadás törlése az adatbázisból => Bal felső menü -> Kiadáslista ->
A törölni kívánt tétel elhúzása ujjal

4.2.3 Minden Kiadás törlése az adatbázisból => Bal felső menü -> Kiadáslista ->
Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

4.2.4 Kiadás szerkesztése => Bal felső menü -> Kiadáslista -> Szerkeszteni kívánt
kiadás kiválasztása -> Új értékek megadása -> Mentés

4.3 **Csoportok Kezelése**

4.3.1. Csoport felvitele az adatbázisba => Bal felső menü -> Csoportlista -> Jobb alsó
lebegő gomb -> Csoport nevének a megadása -> Hozzáad gomb megnyomása

4.3.2. Csoport törlése => Bal felső menü -> Csoportlista -> A törölni kívánt csoport
elhúzása ujjal valamelyik irányba.

4.3.3. Minden csoport törlése => Bal felső menü -> Csoportlista -> Jobb alsó lebegőgomb ->
Minden csoport törlése gomb megnyomása

4.3.4 Csoport szerkesztése => Bal felső menü -> Csoportlista -> Szerkeszteni kívánt
csoport kiválasztása -> Új név megadása -> Mentés

4.4 **Összesítés**

4.4.1. Minden bevétel és kiadás listázása => Bal felső menü -> Összesítés

4.4.2. Bevételek szűrése => Bal felső menü -> Összesítés -> Megadni a dátumot
és/vagy összeget -> Kiválasztani a Bevételek rádiógombot -> Kilistáz gomb

4.4.3. Kiadások szűrése => Bal felső menü -> Összesítés -> Megadni a dátumot
és/vagy összeget -> Kiválasztani a Kiadások rádiógombot -> Kilistáz gomb

4.4.4 Kiadások és Bevételek szűrése => Bal felső menü -> Összesítés -> megadni
a dátumot és/vagy összeget -> Kiaválasztani a Mindkettő rádiógombot -> Kilistáz gomb

## A rendszerre vonatkozó szabályok
* Az alkalmazás java nyelven készüljön.

* Minimum Android API verzió: 21. Ez az Android 5.0 verziót jelöli.

* A fordítási API verzió: 29. Ez az Android 10.0 verziót jelöli

* A Grafikus felhasználói felület szabványos android grafikai csomaggal készüljön.

* A képek jpeg és png formátumúak lehetnek.

* Az alkalmazás támogassa az európai és amerikai kontinensek karakterkészleteit.

* Az adatok lokálisan a készüléken legyenek eltárolva.

* Az adattároláshoz a Room adatbáziskezelőt kell használni

* A dátumoknál az "éééé:hh:nn óó:pp:mm" szabványt kell használni.

* Ehhez a java beépített TypeConverter annotációjának a használata erősen ajánlott.

* Az alkalmazásnak meg kell felelnie az MVC azaz a Model-View-Controller szabványnak.

* A megadott adatokat bármikor lehessen törölni az adatbázisból, amennyiben a
felhasználó azt kéri.

* A különböző oldalak ConstraintLayout típusúak legyenek az egyszerűbb használat
érdekében.

* A különböző drawable fájlokat a res mappán belüli drawable mappában kell tárolni.

* A layout xml fájlokat a res mappán belüli layout mappában kell tárolni.

* A különböző menüket a res csomagon belül a menu csomagban kell létrehozni és tárolni.

* A mipmap fájlok tárolása a res mappán belüli mipmap csomagban kell hogy történjen.

* A navigációs lépések eltárolása a res csomagom belüli navigation csomagban kell,
hogy történjen.

* A használni kívánt értékeket, - ilyenek például a színek - a res mappán belüli values
mappában kell eltárolni.

* Törekedni kell arra, hogy az alkalmazás minél kevesebb erőforrást igényeljen.

* Amennyiben az alkalmazás értesítéseket küld a felhasználónak, akkor a felhasználó
ezeket kapcsolhassa ki.

## Követelménylista

## Fogalomszótár