# Funkcionális Specifikáció

## A rendszer céljai és nem céljai

## Jelenlegi helyzet

## Vágyálom rendszer
Ez a bekezdés a Követelmény specifikáció dokumentumból lett átmásolva.
> A teljes dokumentumot megtekintheti a következő hivatkozás segítségével: [https://github.com/duszka-akos-attila/SZFM_2020_14_BugCrusherzz/blob/Documentation/Tracky_V2/Documentation/kovetelmenyspecifikacio.md](https://github.com/duszka-akos-attila/SZFM_2020_14_BugCrusherzz/blob/Documentation/Tracky_V2/Documentation/kovetelmenyspecifikacio.md)

Szeretnénk egy modern és biztonságos rendszert a mindennapi kiadásaink valamint bevételeink vezetéséhez.
Fontos számunkra, hogy az elkészült rendszert mindenki tudja használni, amely megköveteli a gyors és hibamentes
működést. Amennyiben mégis hiba történne, az lenne a leghatékonyabb, ha a felhasználók maguk is képesek
lennének a problémát elhárítani interaktív segítő üzenetek segítségével. A rendszer kezelése során figyelemben
kell tartani, hogy a felhasználók ideje véges, így minden folyamat elvégzésére a lehető legminimálisabb időt
szeretnénk ráfordítani. A biztonságos kezelést lehetővé téve, fontos, hogy felhasználóink azonosítani tudják
magukat amelyhez lehetőség szerint email címeket szeretnénk használni, és csak a saját maguk által felvitt
adatokhoz férjenek hozzá, mind szerkesztés, mind megtekintés céljából. Egy szintén nem elhanyagolható funkció,
a csoportosítás. A felhasználóknak nélkülözhetetlen, hogy csoportosítani tudjanak bizonyos tranzakciókat, ezzel
lehetővé téve a komplex statisztikai kimutatásokat. A rendszer egy másik mérvadó feladata lenne az adatok
biztonságos tárolásán felül, az abból kinyerhető információk lehető legkönnyebb és leggyorsabb kielemzése.
Mindezt többféle szűrések segítségével, például dátum, idő-intervallum, pénz mozgás iránya, összeg mértéke
vagy akár a tétel csoportok használatának segítségével. Végezetül pedig ahhoz, hogy a felhasználóink a
feldolgozott információt a lehető legkönnyebben értelmezni tudják, a kimutatásokat valamilyen grafikus
megjelenítéssel is ábrázolja a program, a nyers információkon felül.

## A rendszerre vonatkozó külső megszorítások
A tizenharmadik életévüket be nem töltött személyek nem regisztrálhatnak az alkalmazás használatára,
a gyermekek védelméről szóló törvények miatt. Az Európai parlament, személyes adatok védelméről szóló
rendelete alapján (mostantól: adatvédelem) minden az alkalmazás használatára regisztráló felhasználónak
el kell fogadnia, hogy a *Tracky* alkalmazást működtető fejlesztői csapat a -
*BugCrusherzz* ( mostantól: fejlesztői csapat ), vezetői: *Duszka Ákos Attila*, *Rácz András* és *Halász Ádám*
tárolhatja a személyes adatait, mint:

email cím és jelszó - a felhasználó azonosításához, hogy az illetőnek lehetősége legyen az applikációban általa
mentett adatok megtekintéséhez, törléséhez és módosításához;

email cím - a felhasználó értesítése a szerződések módosulásáról, esetleges adatveszteség vagy adatlopás
sikertelen megakadályozásáról, a fejlesztői csapat korábbi alkalmazásainak megszüntetéséről vagy módosulásáról,
a fejlesztői csapat új alkalmazásainak elérhetőségéről valamint egyéb promócióiról;

Az adatvédelem értelmében a felhasználónak joga van döntenie a személyes adatainak tárolásáról,
felhasználásáról az alkalmazás javítása és a szolgáltatás fejlesztése érdekében, ezek: az eszköz típusa,
az eszköz által futtatott operációs rendszer adatai valamint a tartózkodási ország.

Az adatvédelem értelmében a felhasználónak joga van döntenie a személyes adatainak tárolásáról, publikálásáról
valamint felhasználásáról az alkalmazás használatával kapcsolatos statisztikák készítéséhez, ezek: 
az eszköz típusa, az eszköz által futtatott operációs rendszer adatai, a tartózkodási ország valamint életkor.

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
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

>*Aktor:* Az a felhasználó, aki a rendszert használja.

>*Funkció:* A rendszer egy szolgáltatása, viselkedési mintája.
