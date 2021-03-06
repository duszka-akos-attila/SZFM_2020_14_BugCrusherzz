# Funkcionális Specifikáció

## A rendszer céljai és nem céljai

* **Célok :**
	* Grafikus felület
	* Könnyen kezelhetőség
	* Kiadások táblázatbeli kimutatása
	* Bevételek táblában való kimutatása
	* Összesítés mutatása
	* .csv fájlba való exportálás

* **Nem Célok :**
	* Online adattárolás
	* Több felhasználó friendly
	* Több nyelvű támogatás
	* Online hitelesítés

## Jelenlegi helyzet
Cégünk egy papír alapú rendszert alkalmaz, ami semmi képpen sem a legeffektívebb és kezelése is nehéz amellett hogy sok munka is szükséges hozzá. Ineffektivitása abban jelenik meg, hogy mennyi papírt vesz igénybe, és ennek a sok dokumentunknak a tárolás / elérhetősége. Például, egy heti kiadás és bevétele sok papírra íródik, ezek módosítása elég nehéz, így hibák nincsenek jó szemmel látva. Majd ezek egy dossziéba kerülnek, amik hónapok és évek alapján vannak csoportosítva. Ha ezen belül keresni szeretnénk akkor, először is megkell keresnünk az évjáratot, azon belül a hónapot, és még azon belül is átkell néznünk tömérdeknyi dokumentumot, hogy megtaláljuk amit keresünk. Ráadásul ez mind nagyon sok helyet is vesz igénybe, mivel mindent elkell valahol tárolnunk, úgy hogy akármikor elérhetők is legyenek. 

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
|Modul|ID|Név|Verzió|Kifejtés|
|--|--|--|--|--|
|Lokális adat tárolási modul|F-DS-L-01|Mentés|0.2|Adatok mentése egy lokális adatbázisba|
|Lokális adat tárolási modul|F-DS-L-02|Megnyitás|0.2|Adatok lekérése egy lokális adatbázisból|
|Lokális adat tárolási modul|F-DS-L-03|Exportálás|1.1|Adatok mentése .csv fájlba|
|Lokális adat tárolási modul|F-DS-L-04|Importálás|1.1|Adatok beolvasása .csv fájlból.|
|Adat kezelői modul|DH-01|Új bevétel|0.1|Bevétel rögzítése az eszközre.|
|Adat kezelői modul|DH-02|Bevétel szerkesztése|0.3|A már rögzített bevétel módosítása.|
|Adat kezelői modul|DH-03|Bevétel törlése|0.1|A már rögzített bevétel törlése.|
|Adat kezelői modul|DH-04|Új kiadás|0.1|Kiadás rögzítése az eszközre.|
|Adat kezelői modul|DH-05|Kiadás szerkesztése|0.3|A már rögzített kiadás módosítása.|
|Adat kezelői modul|DH-06|Kiadás törlése|0.1|A már rögzített kiadás törlése.|
|Adat kezelői modul|DH-07|Új kiadás csoport|0.4|Kiadás csoport rögzítése az eszközre.|
|Adat kezelői modul|DH-08|Kiadás csoport szerkesztése|0.5|A már rögzített kiadás csoport módosítása.|
|Adat kezelői modul|DH-09|Kiadás csoport törlése|0.4|A már rögzített kiadás törlése.|
|Adat elemző modul|F-DA-01|Egyenleg|0.6|Egyenleg megtekintése.|
|Adat elemző modul|F-DA-02|Bevételek listázása|0.7|Bevételek listázása idő szerinti szűrésekkel.|
|Adat elemző modul|F-DA-03|Kiadások listázása|0.7|Kiadások listázása idő szerinti szűrésekkel.|
|Adat elemző modul|F-DA-04|Kiadások csoportosítása|0.8|Kiadások listázása csoportok szerinti szűrésekkel.|
|Adat elemző modul|F-DA-05|Összesítés|1.4|Kiadások és bevételek összesítése.|
|Sablon kezelő modul|F-TH-01|Kiadás sablon létrehozása|0.6|Egy sablon készítése a kiadásról.|
|Sablon kezelő modul|F-TH-02|Kiadás sablon módosítása|0.7|Egy létező kiadás sablon szerkesztése.|
|Sablon kezelő modul|F-TH-03|Kiadás sablon törlése|0.6|Egy létező kiadás sablon eltávolítása.|
|Sablon kezelő modul|F-TH-04|Bevétel sablon létrehozása|0.6|Egy sablon készítése a bevételről.|
|Sablon kezelő modul|F-TH-05|Bevétel sablon módosítása|0.7|Egy létező bevétel sablon szerkesztése.|
|Sablon kezelő modul|F-TH-06|Bevétel sablon törlése|0.6|Egy létező bevétel sablon eltávolítása.|
|Felhasználó kezelői modul|B-UH-01|Regisztráció|1.2|Egy felhasználói fiók regisztrálása egy távoli szerveren|
|Felhasználó kezelői modul|B-UH-02|Fiók törlése|1.2|Egy felhasználói fiók törlése egy távoli szerverről|
|Felhasználó kezelői modul|B-UH-03|Bejelentkezés|1.1|Bejelentekzés egy távoli szerverre|
|Felhasználó kezelői modul|B-UH-04|Kijelentkezés|1.1|Kijelentkezés egy távoli szerverről|
|Felhasználó kezelői modul|B-UH-05|Jelszó változtatása|1.3|Egy regisztrált felhasználói fiók jelszavának módosítása|
|Felhasználó kezelői modul|B-UH-06|Email cím változtatása|1.3|Egy regisztrált felhasználói fiók email címének módosítása|
|Távoli adat tárolási modul|B-DS-S-05|Mentés|1.4|Adatok mentése egy távoli szerver adatbázisába|
|Távoli adat tárolási modul|B-DS-S-06|Megnyitás|1.4|Adatok lekérése egy távoli szerver adatbázisából|

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
	a felhasználó elhúzza az ujját az egyik bevételen, akkor az a bevétel törlődik. Ezen felül,
	a képernyő jobb alsó részén lesz egy lebegőbomb, Amit ha a felhasználó megnyom, akkor meg fog
	jelenni egy másik képernyő, amelyen a felhasználónak lehetősége lesz bevételt hozzáadni.

* **Kiadáslista**
	* A kiadáslista menüpont kiválasztása után kilistázódnak a már meglévő kiadások, amennyiben
	a felhasználó elhúzza az ujját az egyik kiadáson, akkor az a kiadás törlődik. Ezen felül,
	a képernyő jobb alsó részén lesz egy lebegőbomb, Amit ha a felhasználó megnyom, akkor meg fog
	jelenni egy másik képernyő, amelyen a felhasználónak lehetősége lesz kiadást hozzáadni.
	
* **Csoportlista**
	* A csoportista menüpont kiválasztása után kilistázódnak a már meglévő csoportok, amennyiben
	a felhasználó elhúzza az ujját az egyik csoporton, akkor az a csoport törlődik. Ezen felül,
	a képernyő jobb alsó részén lesz egy lebegőbomb, Amit ha a felhasználó megnyom, akkor meg fog
	jelenni egy másik képernyő, amelyen a felhasználónak lehetősége lesz csoportot hozzáadni.
	
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

* Adatok helyi tárolása védelmet nyújt majd nekünk a kéretlen személyektől / feltöréstől. Külső adatbázisra sem lesz így szükség.
* Könnyű adatmozgathatóság, mivel minden data, egy helyileg tárolt és kezelt fájlba lesz, amit könnyű lesz importálni és exportálni esetleges eszközváltás esetében.
* Eszköztől függetlenül alkalmazkodik majd a képernyőhöz a program, a reszponzív design által.
* A programunk könnyű kezelhetőségét és akadálymentességét a grafikus felület fogja biztosítani. A programon belül egy pár kattintással elérünk majd mindent, és nem lesz lehetőség az elveszésre.
* Könnyű üzemeltethetőség az átlal, hogy helyileg tároljuk majd az adatainkat, ezzel erőfforrást is nyerünk majd.

## Fogalomszótár
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

>*Aktor:* Az a felhasználó, aki a rendszert használja.

>*Funkció:* A rendszer egy szolgáltatása, viselkedési mintája.
