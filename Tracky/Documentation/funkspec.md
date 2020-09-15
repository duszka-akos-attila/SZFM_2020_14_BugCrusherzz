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

## Jelenlegi üzleti folyamatok modellje
5.1.**Személyes költekezések vezetése: papír alapon kézzel vezetve**

5.1.1. Kiadás jegyzése: Minden új kiadást egy füzetbe jegyzik le a cég alkalmazottai.

5.1.2. Bevétel jegyzése: Minden új bevételt egy füzetbe jegyzik le a cég alkalmazottai.

5.2. **Összesítés: Kézzel történő összesítés papír füzetben, fejben vagy számológép általi számítás, tételek manuális szortírozása**

5.2.1. Tételcsoportok összegzése: Minden elszámolás alkalmával segédjegyzetbe gyűjteni az egyes csoportok  tételeit, majd manuálisan szummázni

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
|Adat tárolási modul|DS-03|Exportálás|2.0|Adatok mentése .csv fájlba|
|Adat tárolási modul|DS-04|Importálás|2.0|Adatok beolvasása .csv fájlból.|
|Adat kezelői modul|DH-01|Új bevétel|1.0|Bevétel rögzítése az eszközre.|
|Adat kezelői modul|DH-02|Bevétel szerkesztése|1.0|A már rögzített bevétel módosítása.|
|Adat kezelői modul|DH-03|Bevétel törlése|1.0|A már rögzített bevétel törlése.|

## Használati esetek
 - **Aktorok:** A cég alkalmazottai
 - **Funkciók:**
	 - Kiadások kezelése, azon belül:

		--Kiadás rögzítése

		--Kiadás módosítása

		--Kiadás törlése

		--Kiadás csoport rögzítése

	 	--Kiadás csoport módosítása

	 	--Kiadás csoport törlése
		
	 - Bevételek kezelése, azon belül:

		 --Bevétel rögzítése 

		 --Bevétel módosítása

		 --Bevétel törlése
		 
	 - Összesítés, azon belül:

		 --Tételcsoportok összegzése

		 --Tételek csoportosítása

		 --Egyenleg megtekintése.

		 --Bevételek listázása idő szerinti szűrésekkel.

		 --Kiadások listázása idő szerinti szűrésekkel.

		 --Kiadások listázása csoportok szerinti szűrésekkel.

		 --Kiadások és bevételek összesítése

	 - Sablonok kezelése, azon belül:

		 --Sablon kiadások létrehozása.

		 --Sablon kiadások módosítása.

		 --Sablon kiadások törlése.

		 --Sablon bevételek létrehozása.

		 --Sablon bevételek módosítása.

		 --Sablon bevételek törlése. 

	 - Adatok mozgatása, azon belül:

		 --Adatok importálása .json fájlból.

		 --Adatok exportálása .json fájlba.

		 --Adatok importálása .csv fájlból.

		 --Adatok exportálása .csv fájlba.
		 

## Képernyő tervek

## Funkció - követelmény megfeleltetés

## Fogalomszótár
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

>*Aktor:* Az felhasználó, aki a rendszert használja.

>*Funkció:* a rendszer egy szolgáltatása, viselkedési mintája.