# Funkcionális Specifikáció

## A rendszer céljai és nem céljai

## Jelenlegi helyzet

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

	 - **Adatok mozgatása**, azon belül:

		- Adatok importálása .json fájlból: Az aktoroknak lehetősége van tételeket tartalmazó .json fájlok importálására.

		- Adatok exportálása .json fájlba: Az aktoroknak lehetősége van tételeket tartalmazó .json fájlok exportálására.

		- Adatok importálása .csv fájlból: Az aktoroknak lehetősége van tételeket tartalmazó .csv fájlok importálására.

		- Adatok exportálása .csv fájlba: Az aktoroknak lehetősége van tételeket tartalmazó .csv fájlok exportálására.
		 

## Képernyő tervek
Az alkalmazás elindítása után a felhasználó a kezdőképernyőn az aktuális egyenlegét fogja látni. Az egyenleg alatt lesz látható a néhány legutolsó tranzakció. A bal felül lévő gombot lenyomására megjelenik egy oldalsó menü, ahol a felhasználó választhat a kiadások kezelése, bevételek kezelése, összesítés, sablonok kezelése, és adatok mozgatása menüpontok közül. A kiadások kezelése menüpont kiválasztása után a felhasználó választhat a kiadás rögzítése, kiadás módosítása, kiadás törlése, kiadás csoport rögzítése, kiadás csoport módosítása, és Kiadás csoport törlése menüpontok közül. A bevételek kezelése menüpont kiválasztása után a felhasználó választhat a bevétel rögzítése, bevétel módosítása, és bevétel törlése menüpontok közül. Az összesítés menüpont kiválasztása után a felhasználó választhat az egyenleg megtekintése, bevételek listázása idő szerinti szűrésekkel, kiadások listázása idő szerinti szűrésekkel, kiadások listázása csoportok szerinti szűrésekkel, valamit a kiadások és bevételek összesítése menüpontok közül. A sablonok kezelése menüpont kiválasztása után a felhasználónak lehetősége van választani a sablon kiadások létrehozása, sablon kiadások módosítása, sablon kiadások törlése, sablon bevételek létrehozása, sablon bevételek módosítása, valamint sablon bevételek törlése menüpontok közül. Az adatok mozgatása menüpont kiválasztása után a felhasználón választhat az adatok importálása .json fájlból, adatok exportálása .json fájlba, adatok importálása .csv fájlból, valamint adatok exportálása .csv fájlba.

## Funkció - követelmény megfeleltetés

## Fogalomszótár
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

>*Aktor:* Az a felhasználó, aki a rendszert használja.

>*Funkció:* A rendszer egy szolgáltatása, viselkedési mintája.
