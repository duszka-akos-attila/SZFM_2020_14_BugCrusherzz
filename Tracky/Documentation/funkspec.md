# Funkcionális Specifikáció

## A rendszer céljai és nem céljai

* **Célok :**
    *  Grafikus felület
    * Adatok exportálása .csv fájlba
    * Adatok rendezése többféle képpen
    * Statisztika létrehozása adatokból
    * Multiplatform

* **Nem célok :**
    * Online adattárolás
    * Online hitelesítés
    * Több felhasználó általi használat
    * Egyidejüleg több költségvetés kezelése
    * Akadálymentes mód 
    * Több nyelv támogatása

## Jelenlegi helyzet
Papír formában vezetett jelenleg a kiadásaink és bevételeink is. Ez a rendszer számunkra nem hatékony, mivel nagyon energiaigényes, mind a tárolása, mind a kezelése. Tárolása egyrészt nagyon sok helyet igényel, papírt és a dossziékat is ha, rendezni akarjuk. Majd a kezelése is ezen alapszik. Egyénileg nagyon időigényes, nehéz az átnézése, ellenőrzése. A felvitt adatok változtatása bonyolult, mivel új sorokat kell használni a hibák javítására. Ha esetlegesen régebbi dokumentumokhoz szeretnénk hozzáférni, mindegyiket felkell tüntetni év, hónap akár nap szerint is. Majd a sok sok lap/dosszié közül kikeresni azt amire éppen szükségünk van.

## Vágyálom rendszer
Az erőforrások optimalizálása érdekében szeretnénk egy modern, az adminisztrációs és költségkezelési
feladatokat segítő alkalmazást.
Szeretnénk, ha a cég mindennapos költségeinek vezetése könnyebben és gyorsabban történhetne.
Az időnkénti költségvetés elemzést egyszerűen el lehessen végezni, külső segítség
igénybevétele nélkül. Szeretnénk ha a nyilvántartást digitálisan lehetne kezelni,
annak érdekében, hogy minden olyan személy, akinek tisztában kell lennie az aktuális anyagi helyzettel,
mindig napra készek legyenek. Fontos lenne a cég számára, ha a kimutatásokat valamilyen
vizualis módon tekinthetnénk meg.

## A rendszerre vonatkozó külső megszorítások
A gyermekek védelméről szóló törvény alapján 13 évnél fiatalabb személyek az alkalmazást nem használhatják.
Az Európai parlament, személyes adatok védelméről szóló rendelete alapján,
minden felhasználónak bele kell egyeznie, hogy adatait a szolgáltatás javítása 
érdekében a fejlesztő csapat felhasználhatja, és továbbíthatja harmadik félnek.
A felhasználó minden adat továbbítás előtt értesítést kell, hogy kapjon.
A fejlesztői csapat - BugCrusherzz, tulajdonosai: Duszka Ákos Attila, Rácz András és Halász Ádám,
fenntartják a jogot, hogy ezen dokumentumok, valamint az applikáció forráskódja
az ő szellemi tulajdonukat illeti, ez alól kivételt képeznek a felhasználók személyes adatai,
amelyek közül az eszköz azonosító, a tartózkodási hely valamint az életkor adataik 
statisztikai felhasználás céljaiból a felhasználók engedélyével tárolnak és publikálnak.

## Jelenlegi üzleti folyamatok modellje
5.1.**Személyes költekezések vezetése: papír alapon kézzel vezetve**

5.1.1. Kiadás jegyzése: Minden új kiadást egy füzetbe jegyzik le a cég alkalmazottai.

5.1.2. Bevétel jegyzése: Minden új bevételt egy füzetbe jegyzik le a cég alkalmazottai.

5.2. **Összesítés: Kézzel történő összesítés papír füzetben, fejben vagy számológép általi számítás, tételek manuális szortírozása**

5.2.1. Tételcsoportok összegzése: Minden elszámolás alkalmával segédjegyzetbe gyűjteni az egyes csoportok tételeit, majd manuálisan szummázni

5.2.2. Tételek csoportosítása: Felvételkor idő alapú lineáris jegyzés, sor végi azonosító kulcsszó segítségével

## Igényelt üzleti folyamatok modellje
6.1 **Mobil alkalmazás**

6.1.1 Kiadás felvitele a lokális fájlba: új kiadás felvitele menüpont kiválasztása, majd a
megjelenő ablakban a kiadás típusának és mennyiségenek a megadása. Végül pedig a mentés gomb
megnyomásával rögzítődik a kiadás.

6.1.2 Bevétel felvitele a lokális fájlba: új bevétel felvitele menüpont kiválasztása, majd a
megjelenő ablakban a bevétel mennyiségének a megadása. Végül pedig a mentés gomb megnyomásával rögzítődik a bevétel.

6.2 **Összesítés: Az alkalmazás bármikor képes összesíteni a felvitt adatokat, az összegzés gomb megnyomásakor.**

6.2.1. Tételcsoportok összegzése: Kiértékelés menüpont kiválasztása után a megjelenő ablakban a tételcsoport listából kiválasztjuk a kívánt tételeket. Majd pedig megnyomjuk az összegzés gombot.

6.2.2. Tételek csoportosítása: Az összesítés gomb megnyomásakor az alkalmazás automatikusan csoportosítja a tételeket.

## Követelménylista
|Modul|ID|Név|Verzió|Kifejtés|
|--|--|--|--|--|
|Adat tárolási modul|DS-01|Mentés|1.0|Adatok mentése .json fájlba|
|Adat tárolási modul|DS-02|Megnyitás|1.0|Adatok beolvasása .json fájlból.|
|Adat tárolási modul|DS-03|Exportálás|1.0|Adatok mentése .csv fájlba|
|Adat tárolási modul|DS-04|Importálás|1.0|Adatok beolvasása .csv fájlból.|
|Adat kezelői modul|DH-01|Új bevétel|1.0|Bevétel rögzítése az eszközre.|
|Adat kezelői modul|DH-02|Bevétel szerkesztése|1.0|A már rögzített bevétel módosítása.|
|Adat kezelői modul|DH-03|Bevétel törlése|1.0|A már rögzített bevétel törlése.|
|Adat kezelői modul|DH-04|Új kiadás|1.0|Kiadás rögzítése az eszközre.|
|Adat kezelői modul|DH-05|Kiadás szerkesztése|1.0|A már rögzített kiadás módosítása.|
|Adat kezelői modul|DH-06|Kiadás törlése|1.0|A már rögzített kiadás törlése.|
|Adat kezelői modul|DH-07|Új kiadás csoport|1.0|Kiadás csoport rögzítése az eszközre.|
|Adat kezelői modul|DH-08|Kiadás csoport szerkesztése|1.0|A már rögzített kiadás csoport módosítása.|
|Adat kezelői modul|DH-09|Kiadás csoport törlése|1.0|A már rögzített kiadás törlése.|
|Adat elemző modul|DA-01|Egyenleg|1.0|Egyenleg megtekintése.|
|Adat elemző modul|DA-02|Bevételek listázása|1.0|Bevételek listázása idő szerinti szűrésekkel.|
|Adat elemző modul|DA-03|Kiadások listázása|1.0|Kiadások listázása idő szerinti szűrésekkel.|
|Adat elemző modul|DA-04|Kiadások csoportosítása|1.0|Kiadások listázása csoportok szerinti szűrésekkel.|
|Adat elemző modul|DA-05|Összesítés|1.0|Kiadások és bevételek összesítése.|
|Sablon kezelő modul|TH-01|Kiadás sablon létrehozása|1.0|Egy sablon készítése a kiadásról.|
|Sablon kezelő modul|TH-02|Kiadás sablon módosítása|1.0|Egy létező kiadás sablon szerkesztése.|
|Sablon kezelő modul|TH-03|Kiadás sablon törlése|1.0|Egy létező kiadás sablon eltávolítása.|
|Sablon kezelő modul|TH-04|Bevétel sablon létrehozása|1.0|Egy sablon készítése a bevételről.|
|Sablon kezelő modul|TH-05|Bevétel sablon módosítása|1.0|Egy létező bevétel sablon szerkesztése.|
|Sablon kezelő modul|TH-06|Bevétel sablon törlése|1.0|Egy létező bevétel sablon eltávolítása.|

## Használati esetek
 - **Aktorok:** A cég alkalmazottai
 - **Funkciók:**
	 - **Kiadások kezelése**, azon belül:

		- Kiadás rögzítése: Az aktoroknak lehetősége van kiadást rögzíteni.

		- Kiadás módosítása: Az aktoroknak lehetősége van kiadást módosítani.

		- Kiadás törlése: Az aktoroknak lehetősége van kiadást törölni.

		- Kiadás csoport rögzítése: Az aktoroknak lehetősége van kiadás csoportot rögzíteni.

		- Kiadás csoport módosítása: Az aktoroknak lehetősége van kiadás csoportot módosítani.

	 	- Kiadás csoport törlése: Az aktoroknak lehetősége van kiadás csoportot törölni.
		
	 - **Bevételek kezelése**, azon belül:

		- Bevétel rögzítése: Az aktoroknak lehetősége van bevételt rögzíteni.

		- Bevétel módosítása: Az aktoroknak lehetősége van bevételt módosítani.

		- Bevétel törlése: Az aktoroknak lehetősége van bevételt törölni.
		 
	 - **Összesítés**, azon belül:

		- Egyenleg megtekintése: Az aktorok meg tudják nézni az egyenlegüket.

		- Bevételek listázása idő szerinti szűrésekkel: Az aktoroknak lehetősége van idő alapján kilistázni a bevételeket.

		- Kiadások listázása idő szerinti szűrésekkel: Az aktoroknak lehetősége van idő alapján kilistázni a kiadásokat.

		- Kiadások listázása csoportok szerinti szűrésekkel: Az aktoroknak lehetősége van csoportok alapján kilistázni a kiadásokat.

		- Kiadások és bevételek összesítése: Az aktoroknak lehetősége van összesíteni a kiadásokat és a bevételeket.

	 - **Sablonok kezelése**, azon belül:

		- Sablon kiadások létrehozása: Az aktoroknak lehetősége van létrehozni sablon kiadásokat.

		- Sablon kiadások módosítása: : Az aktoroknak lehetősége van módosítani a sablon kiadásokat.

		- Sablon kiadások törlése: Az aktoroknak lehetősége van törölni a sablon kiadásokat.

		- Sablon bevételek létrehozása: Az aktoroknak lehetősége van sablon bevételek létrehozására.

		- Sablon bevételek módosítása: Az aktoroknak lehetősége van módosítani a sablon bevételeket.

		- Sablon bevételek törlése: Az aktoroknak lehetősége van törölni a sablon bevételeket.

	 - **Adatok tárolása**, azon belül:

		- Adatok megnyitása .json fájlból: Az aktoroknak lehetősége van tételeket tartalmazó .json fájlok importálására.

		- Adatok mentése .json fájlba: Az aktoroknak lehetősége van tételeket tartalmazó .json fájlok exportálására.

		- Adatok megnyitása .csv fájlból: Az aktoroknak lehetősége van tételeket tartalmazó .csv fájlok importálására.

		- Adatok mentése .csv fájlba: Az aktoroknak lehetősége van tételeket tartalmazó .csv fájlok exportálására.
		 

## Képernyő tervek
Az alkalmazás elindítása után a felhasználó a kezdőképernyőn az aktuális egyenlegét fogja látni. Az egyenleg alatt látható
néhány egyenleg módosítás a közelmúltból. A bal felül lévő menü gomb megnyomására megjelenik egy oldalsó menü, amelyben a következő opciók jelennek meg:

* **Bevételek kezelése**
	* A bevételek kezelése menüpont kiválasztása után kilistázódnak a már meglévő bevételek, amely listához a felhasználónak lehetősége van 
	új elemet hozzáadni, elemeket módosítani, vagy törölni egyes elemeket.
	
* **Kiadások kezelése**
	* A kiadások kezelése menüpont kiválasztása után kilistázódnak a már meglévő kiadások, amely listához a felhasználónak lehetősége van 
	új elemet hozzáadni, elemeket módosítani, vagy törölni egyes elemeket.
	
* **Kiadás csoportok kezelése**
	* A kiadás csoportok kezelése menüpont kiválasztása után kilistázódnak a már meglévő kiadás csoportok, amely listához a felhasználónak lehetősége van 
	új elemet hozzáadni, elemeket módosítani, vagy törölni egyes elemeket.
	
* **Sablonok kezelése**
	* A sablonok kezelése menüpont kiválasztása után kilistázódnak a már meglévő sablonok, amely listához a felhasználónak lehetősége van 
	új elemet hozzáadni, elemeket módosítani, vagy törölni egyes elemeket.
	
* **Adatok mozgatása**
	* Az adatok mozgatása menüpont kiválasztása után a felhasználónak lehetősége van importálni vagy exportálni .csv kiterjesztésű fájlokat.
	
* **Összesítés**
	* Az összesítés menüpont kiválasztása után a felhasználó választhat a bevételek listázása idő szerinti szűrésekkel, kiadások listázása idő szerinti szűrésekkel, kiadások listázása csoportok szerinti szűrésekkel, a kiadások és bevételek időszerinti listázása valamit a kiadások és bevételek összesítése közül.
	
* **Előzmények törlése**
	* Az előzmények törlése menüpont kiválasztása után a felhasználó választhat az alábbi műveletek közül:
		* Összes kiadás előzmény törlése
		* Összes bevétel előzmény törlése
		* Összes sablon törlése
		* Összes kiadás csoport törlése
	
## Funkció - követelmény megfeleltetés

* Könnyen üzelmetethető lesz mivel nem fog sok helyet / erőforrást felhasználni a programunk futáskor. Külső adatbázisra sincs szükség mivel helyben fog futni az egész.
* Könnyen és akadálymentesen lehet majd használni az appot a grafikus felület álltal, egyértelmű és gördülékeny. 
* A dizájn reszponzív lesz mivel, alkalmazkodik majd a kijelző méretéhez. 
* A program adattárolása helyileg az eszközön fog történni, és nem a felhőbe. Ezzel biztonságosabbá téve a lopástól, és a nemkívánt személyek beletekitésétől. 
* Az alkalmazás tartalmazzon egy grafikus költségkimutatást is például egy kiadás diagrammot, hogy az elmúlt hónapban milyen kategóriára mennyit költöttünk. 
* Az data könnyen mozgatható lesz, mivel helyileg tárolt fájl lesz amit könnyü, exportálni és importálni más eszközökre is akár ha úgyszeretnénk.

## Fogalomszótár
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

>*Aktor:* Az a felhasználó, aki a rendszert használja.

>*Funkció:* A rendszer egy szolgáltatása, viselkedési mintája.
