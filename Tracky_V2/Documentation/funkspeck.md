# Funkcionális Specifikáció

## A rendszer céljai és nem céljai

## Jelenlegi helyzet

## Vágyálom rendszer

## A rendszerre vonatkozó külső megszorítások

## Jelenlegi üzleti folyamatok modellje
5.1.**Személyes költekezések vezetése: papír alapon kézzel vezetve**

5.1.1. Kiadás jegyzése: Minden új kiadást egy füzetbe jegyzik le a cég alkalmazottai.

5.1.2. Kiadás törlése: A törölni kívánt kiadás áthúzása a füzetben, hamar bonyolulttá
váló művelet.

5.1.3. Kiadás szerkesztése: Alapvetően nem megvalósítható, csak úgy, ha a kiadást töröljük
majd pedig hozzáadunk egy újat.

5.1.4. Bevétel jegyzése: Minden új bevételt egy füzetbe jegyzik le a cég alkalmazottai.

5.1.5. Bevétel törlése: A törölni kívánt bevétel áthúzása a füzetben, hamar bonyolulttá
váló művelet.

5.1.6. Bevétel szerkesztése: Alapvetően nem megvalósítható, csak úgy, ha a bevételt töröljük
majd pedig hozzáadunk egy újat.

5.2. **Összesítés: Kézzel történő összesítés papír füzetben, fejben vagy számológép általi
számítás, tételek manuális szortírozása**

5.2.1. Tételcsoportok összegzése: Minden elszámolás alkalmával segédjegyzetbe gyűjteni az
egyes csoportok tételeit, majd manuálisan szummázni

5.2.2. Tételek csoportosítása: Felvételkor idő alapú lineáris jegyzés, sor végi azonosító
kulcsszó segítségével.


## Igényelt üzleti folyamatok modellje
6.1 **Bevételek Kezelése**

6.1.1 Bevétel felvitele az adatbázisba => Bal felső menü -> Bevétellista -> Jobb alsó
lebegő gomb -> Összeg és leírás megadása -> Hozzáad gomb megnyomása

6.1.2 Bevétel törlése az adatbázisból => Bal felső menü -> Bevétellista ->
A törölni kívánt tétel elhúzása ujjal

6.1.3 Minden Bevétel törlése az adatbázisból => Bal felső menü -> Bevétellista ->
Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

6.1.4 Bevétel szerkesztése => Bal felső menü -> Bevétellista -> Szerkeszteni kívánt
-> Bevétel kiválasztása -> Az új adatok megadása -> Mentés

6.2 **Kiadások Kezelése**

6.2.1 Kiadás felvitele az adatbázisba => Bal felső menü -> Kiadáslista -> Jobb alsó
lebegő gomb -> Összeg és leírás és csoport megadása -> Hozzáad gomb megnyomása

6.2.2 Kiadás törlése az adatbázisból => Bal felső menü -> Kiadáslista ->
A törölni kívánt tétel elhúzása ujjal

6.2.3 Minden Kiadás törlése az adatbázisból => Bal felső menü -> Kiadáslista ->
Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

6.2.4 Kiadás szerkesztése => Bal felső menü -> Kiadáslista -> Szerkeszteni kívánt
kiadás kiválasztása -> Új értékek megadása -> Mentés

6.3 **Csoportok Kezelése**

6.3.1. Csoport felvitele az adatbázisba => Bal felső menü -> Csoportlista -> Jobb alsó
lebegő gomb -> Csoport nevének a megadása -> Hozzáad gomb megnyomása

6.3.2. Csoport törlése => Bal felső menü -> Csoportlista -> A törölni kívánt csoport
elhúzása ujjal valamelyik irányba.

6.3.3. Minden csoport törlése => Bal felső menü -> Csoportlista -> Jobb alsó lebegőgomb ->
Minden csoport törlése gomb megnyomása

6.3.4 Csoport szerkesztése => Bal felső menü -> Csoportlista -> Szerkeszteni kívánt
csoport kiválasztása -> Új név megadása -> Mentés

6.4 **Összesítés**

6.4.1. Minden bevétel és kiadás listázása => Bal felső menü -> Összesítés

6.4.2. Bevételek szűrése => Bal felső menü -> Összesítés -> Megadni a dátumot
és/vagy összeget -> Kiválasztani a Bevételek rádiógombot -> Kilistáz gomb

6.4.3. Kiadások szűrése => Bal felső menü -> Összesítés -> Megadni a dátumot
és/vagy összeget -> Kiválasztani a Kiadások rádiógombot -> Kilistáz gomb

6.4.4 Kiadások és Bevételek szűrése => Bal felső menü -> Összesítés -> megadni
a dátumot és/vagy összeget -> Kiaválasztani a Mindkettő rádiógombot -> Kilistáz gomb

## Követelménylista

## Használati esetek
- **Aktorok:** A cég alkalmazottai
 - **Funkciók:**
	 - **Kiadások kezelése**, azon belül:

		- Kiadás rögzítése: Az aktoroknak lehetősége van kiadást rögzíteni.

		- Kiadás módosítása: Az aktoroknak lehetősége van kiadást módosítani.

		- Kiadás törlése: Az aktoroknak lehetősége van kiadást törölni.

		- Kiadás csoport rögzítése: Az aktoroknak lehetősége van kiadás csoportot
		rögzíteni.

		- Kiadás csoport módosítása: Az aktoroknak lehetősége van kiadás csoportot
		módosítani.

	 	- Kiadás csoport törlése: Az aktoroknak lehetősége van kiadás csoportot
	 	törölni.
		
	 - **Bevételek kezelése**, azon belül:

		- Bevétel rögzítése: Az aktoroknak lehetősége van bevételt rögzíteni.

		- Bevétel módosítása: Az aktoroknak lehetősége van bevételt módosítani.

		- Bevétel törlése: Az aktoroknak lehetősége van bevételt törölni.
		 
	 - **Összesítés**, azon belül:

		- Egyenleg megtekintése: Az aktorok meg tudják nézni az egyenlegüket.

		- Bevételek listázása idő szerinti szűrésekkel: Az aktoroknak lehetősége
		van idő alapján kilistázni a bevételeket.

		- Kiadások listázása idő szerinti szűrésekkel: Az aktoroknak lehetősége
		van idő alapján kilistázni a kiadásokat.

		- Kiadások listázása csoportok szerinti szűrésekkel: Az aktoroknak lehetősége
		van csoportok alapján kilistázni a kiadásokat.

		- Kiadások és bevételek összesítése: Az aktoroknak lehetősége van összesíteni
		a kiadásokat és a bevételeket.

	 - **Adatok tárolása**
	 	- Minden adat a Room adatbáziskezelő segítségével lesz eltárolva, de az
	 	aktoroknak lehetőségük van a következőkre:

	 	- Minden Kiadás törlése: Az aktoroknak lehetősége van törölni minden kiadást.

	 	- Minden bevétel törlése: Az aktoroknak lehetősége van törölni minden bevételt.

	 	- Minden csoport törlése: Az aktoroknak lehetősége van törölni minden csoportot.

## Képernyő tervek
Az alkalmazás elindítása után a felhasználó a kezdőképernyőn az aktuális egyenlegét fogja látni.
Az egyenleg alatt látható néhány egyenleg módosítás a közelmúltból. A bal felül lévő menü gomb
megnyomására megjelenik egy oldalsó menü, amelyben a következő opciók jelennek meg:

* **Bevétellista**
	* A bevétellista menüpont kiválasztása után kilistázódnak a már meglévő bevételek, amennyiben
	a felhasználó elhúzza az ujját, a bevétel törlődik. Ezen felül a képernyő jobb alsó részén
	lesz egy lebegőbomb, Amit ha a felhasználó megnyom, akkor lehetősége lesz Bevételt hozzáadni,
	Bevételt törölni, és Bevételt módosítani.
	
* **Kiadáslista**
	* A kiadáslista menüpont kiválasztása után kilistázódnak a már meglévő kiadások, amennyiben
	a felhasználó elhúzza az ujját, a kiadás törlődik. Ezen felül a képernyő jobb alsó részén
	lesz egy lebegőbomb, Amit ha a felhasználó megnyom, akkor lehetősége lesz Kiadást hozzáadni,
	Kiadást törölni, és Kiadást módosítani.
	
* **Csoportlista**
	* A csoportista menüpont kiválasztása után kilistázódnak a már meglévő csoportok, amennyiben
	a felhasználó elhúzza az ujját, a csoport törlődik. Ezen felül a képernyő jobb alsó részén
	lesz egy lebegőbomb, Amit ha a felhasználó megnyom, akkor lehetősége lesz csoportot hozzáadni,
	csoportot törölni, és csoportot módosítani.
	
* **Összesítés**
	* Az összesítés menüpont kiválasztása után a felhasználó választhat a bevételek listázása idő szerinti szűrésekkel,
	kiadások listázása idő szerinti szűrésekkel, kiadások listázása csoportok szerinti szűrésekkel, a kiadások és bevételek
	időszerinti listázása valamit a kiadások és bevételek összesítése közül.
	
* **Előzmények törlése**
	* Az előzmények törlése menüpont kiválasztása után a felhasználó választhat az alábbi műveletek közül:
		* Összes kiadás előzmény törlése
		* Összes bevétel előzmény törlése
		* Összes sablon törlése
		* Összes kiadás csoport törlése


## Funkció - követelmény megfeleltetés

## Fogalomszótár