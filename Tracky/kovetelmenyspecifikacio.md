
# Követelmény specifikáció

## Jelenlegi helyzet
Jelenleg a bevételek és kiadások kezeléséhez is egy papír alapú rendszert használ jelenleg a cégünk,
de ennek a rendszernek a fenntartása sok erőforrást igényel, főleg, hogy egyetlen egy ember vezeti, mivel másképp káosz lenne.
Ennek a rendszernek a tárolása és kezelése is nehéz, mivel nagyon sok dokumentumot kell eltárolni, könnyen megtalalható helyen.
Eközben a dokumentumok közötti navigálást még nehezebbé teszi,
mivel mindent fel kell cimkézni és időrendbe pakolni, ezek nélkül egy adott kiadást lehetetlen lenne megtalálni.

## Vágyálom rendszer
Az erőforrások optimalizálása érdekében szeretnénk egy korszerű adminisztratív és költségkezelő rendszert.
Célunk, hogy a mindennapi költségek vezetése egyszerűbb legyen, az időszakos összegzések áttekintését
gyorsan és könnyedén meg lehessen tenni. Szeretnénk a nyilvántartás digitális kezelését megoldani,
hogy minden illetékes folyamatosan tisztában legyen az aktuális anyagi helyzettel.
Fontos lenne számunkra, hogy a kimutatásokat valamilyen módon vizualizálva tekinthessük meg.

## Jelenlegi üzleti folyamatok
3.1.**Személyes költekezések vezetése: papír alapon kézzel vezetve**

3.1.1. Kiadás jegyzése: új kiadás => füzetbe való bejegyzése

3.1.2. Bevétel jegyzése: új bevétel => füzetbe való bejegyzése

3.2. **Összesítés: Kézzel történő összesítés papír füzetben, fejben vagy számológép általi számítás, tételek manuális szortírozása**

3.2.1. Tételcsoportok összegzése: Minden elszámolás alkalmával segédjegyzetbe gyűjteni az egyes csoportok  tételeit, majd manuális szummázni

3.2.2. Tételek csoportosítása: Felvételkor idő alapú lineáris jegyzés, sor végi azonosító kulcsszó segítségével

## Igényelt üzleti folyamatok
4.1 **Mobil alkalmazás**

4.1.1 Kiadás felvitele a lokális fájlba: új kiadás felvitele menüpont => kiadás típusa és mennyisége => véglegesítés

4.1.2 Bevétel felvitele a lokális fájlba: új bevétel felvitele menüpont => bevétel mennyisége => véglegesítés

4.2 **Összesítés: Az alkalmazás bármikor egy gombnyomásra képes összesíteni a felvitt adatokat.**

4.2.1. Tételcsoportok összegzése: Kiértékelés menüpont => Tételcsoport kiválasztása => összegzés gomb megnyomása

4.2.2. Tételek csoportosítása: Összesítéskor az alkalmazás automatikusan csoportosítja a tételeket.

## A rendszerre vonatkozó szabályok
Az alkalmazás java nyelven készüljön.
A Grafikus felhasználói felület szabványos android grafikai csomaggal készüljön.
A képek jpeg és png formátumúak lehetnek.
Az alkalmazás támogassa az európai és amerikai kontinensek karakterkészleteit.
Az megadott adatok az eszközön szabványos csv formátumú fájlokban legyenek eltárolva.

## Követelménylista
* K01 Könnyen üzemeltethető rendszer
* K02 Grafikus felhasználói felület
* K03 Reszponzív dizájn
* K04 Könnyű használat
* K05 Biztonságos és lokális adattárolás
* K06 Grafikus költség kimutatás
* K07 Adat mozgathatóság

## Fogalomszótár
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Karakterkészlet:* A számítógép számára, az emberi írásjeleket definiáló, és csoportosító szabvány.

>*Reszponzív dizájn:* A reszponzív design az alkalmazásnak egy olyan kialakítása,
ami rugalmasan alkalmazkodik a különböző eszközök képernyőjének méretéhez.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

