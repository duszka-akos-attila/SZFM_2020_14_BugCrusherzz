# Rendszerterv

## A rendszer célja
- **A rendszer céljai:**

	- A rendszer célja, hogy a jelenleg papíron vezetett kiadás és bevétel kezelés
	lecserélése egy androidos alkalmazásra. Ennek az alkalmazásnak egy érthető,
	és egyszerűen navigálható grafikus felhasználói felülettel kell rendelkeznie
	a könnyű használhatóság érdekében.

	- Az alkalmazásnak a következő funkciókkal kell rendelkeznie.
	   - Bevétel felvitele az adatbázisba => Bal felső menü -> Bevétellista -> Jobb alsó
	   lebegő gomb -> Összeg és leírás megadása -> Hozzáad gomb megnyomása

	   - Bevétel törlése az adatbázisból => Bal felső menü -> Bevétellista ->
	   A törölni kívánt tétel elhúzása ujjal

	   - Minden Bevétel törlése az adatbázisból => Bal felső menü -> Bevétellista ->
	   Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

	   - Bevétel szerkesztése => Bal felső menü -> Bevétellista -> Szerkeszteni kívánt
	   Bevétel kiválasztása -> Az új adatok megadása -> Mentés

	   - Kiadás felvitele az adatbázisba => Bal felső menü -> Kiadáslista -> Jobb alsó
	   lebegő gomb -> Összeg és leírás és csoport megadása -> Hozzáad gomb megnyomása

	   - Kiadás törlése az adatbázisból => Bal felső menü -> Kiadáslista ->
	   A törölni kívánt tétel elhúzása ujjal

	   - Minden Kiadás törlése az adatbázisból => Bal felső menü -> Kiadáslista ->
	   Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

	   - Kiadás szerkesztése => Bal felső menü -> Kiadáslista -> Szerkeszteni kívánt
	   kiadás kiválasztása -> Új értékek megadása -> Mentés

	   - Csoport felvitele az adatbázisba => Bal felső menü -> Csoportlista -> Jobb alsó
	   lebegő gomb -> Csoport nevének a megadása -> Hozzáad gomb megnyomása

	   - Csoport törlése => Bal felső menü -> Csoportlista -> A törölni kívánt csoport
	   elhúzása ujjal valamelyik irányba.

	   - Minden csoport törlése => Bal felső menü -> Csoportlista -> Jobb alsó lebegőgomb ->
	   Minden csoport törlése gomb megnyomása

	   - Csoport szerkesztése => Bal felső menü -> Csoportlista -> Szerkeszteni kívánt
	   csoport kiválasztása -> Új név megadása -> Mentés

	   - Minden bevétel és kiadás listázása => Bal felső menü -> Összesítés

	   - Bevételek szűrése => Bal felső menü -> Összesítés -> Megadni a dátumot
	   és/vagy összeget -> Kiválasztani a Bevételek rádiógombot -> Kilistáz gomb

	   - Kiadások szűrése => Bal felső menü -> Összesítés -> Megadni a dátumot
	   és/vagy összeget -> Kiválasztani a Kiadások rádiógombot -> Kilistáz gomb

	   - Kiadások és Bevételek szűrése => Bal felső menü -> Összesítés -> megadni
	   a dátumot és/vagy összeget -> Kiaválasztani a Mindkettő rádiógombot -> Kilistáz gomb

- **A rendszernek nem céljai:**

	- Az alkalmazásnak nincs olyan része, ami online kapcsolatot igényelne, éppen ezért a rendszernek nem célja semmilyen online kapcsolatot kialakítani egy szerverrel se online adattárolás, sem pedig online hitelesítés miatt.

	- Az adatok tárolása csakis lokális formában valósuljon meg.

	- Egy eszközön a rendszernek csupán egy felhasználó egy adott költségvetési adatait kell nyílván tartania, azaz nem egy többfelhasználós rendszer a cél.

	- A rendszernek továbbá nem célja sem egy akadálymentes mód biztosítása, sem pedig különböző nyelvek támogatása.

## Projekt terv

## Üzleti folyamatok modellje

## Követelmények

## Funkcionális terv

## Fizikai környezet
- Az alkalmazás androidos mobiltelefonokra, java nyelven kell, hogy elkészüljön, mivel ez a nyelv a legkedveltebb a mobil alkalmazások készítéséhez.

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

- Az alkalmazás elkészítéséhez az Android studio nevű programot fogjuk használni, mert egyszerűen lehet androidos alkalmazásokat készíteni vele, különösen a programok frontend részét.

- A programnak a minimális erőforrásigénye miatt nincs semmilyen különleges hardverigénye.

- A programnak nincs semmilyen internetkapcsolatot igénylő eleme, éppen ezért nem támaszt semmilyen igényt sem az eszköz tűzfalával, sem a portokkal kapcsolatban.

- Minden esetleges függőség a program részét fogja képezni, és azzal eggyütt fog feltelepülni, éppen ezért nincs szükség semmilyen külső szoftverre az alkalmazás helyes működéséhez.

## Absztrakt domain modell

## Architekturális terv

## Adattárolási terv

## Implementációs terv

## Tesztterv

## Telepítési terv

## Karbantartási terv