# Rendszerterv
## A rendszer célja
A rendszer célja, hogy a jelenleg papíron vezetett kiadás és bevétel kezelés lecserélése egy alkalmazásra. Ennek az alkalmazásnak egy érthető, és egyszerűen navigálható grafikus felhasználói felülettel kell rendelkeznie a könnyű használhatóság érdekében. Fontos továbbá az is, hogy a megadott bevételeket és kiadásokat többféleképpen is lehessen rendezni, ilyen például a dátum, a kiadás csoportja stb. Valamint lehessen statisztikai kimutatásokat is létrehozni az adatokból annak érdekében, hogy ne kézzel kelljen ezeket kiszámolni. A kimutatásoknak könnyen érthetőnek kell lennie. Végül pedig fontos, hogy a lokális adatokat exportálni lehessen .csv fájlba annak érdekében, hogy a megadott adatok könnyen hordozhatóak legyenek.

Az alkalmazásnak nincs olyan része, ami online kapcsolatot igényelne, éppen ezért a rendszernek nem célja semmilyen online kapcsolatot kialakítani egy szerverrel se online adattárolás, sem pedig online hitelesítés miatt. Az adatok tárolása csakis lokális formában valósuljon meg. Egy eszközön a rendszernek csupán egy felhasználó egy adott költségvetési adatait kell nyílván tartania, azaz nem egy többfelhasználós rendszer a cél. A rendszernek továbbá nem célja sem egy akadálymentes mód biztosítása, sem pedig különböző nyelvek támogatása.

## Projekt terv
## Üzleti folyamatok modellje
## Követelmények
## Funkcionális terv
## Fizikai környezet
- Az alkalmazás androidos mobiltelefonokra, java nyelven kell, hogy elkészüljön, mivel ez a nyelv a legkedveltebb a mobil alkalmazások készítéséhez.

- Az alkalmazás elkészítéséhez az Android studio nevű programot fogjuk használni, mert egyszerűen lehet androidos alkalmazásokat készíteni vele, különösen a programok frontend részét.

- A programnak a minimális erőforrásigénye miatt nincs semmilyen különleges hardverigénye.

- A programnak nincs semmilyen internetkapcsolatot igénylő eleme, éppen ezért nem támaszt semmilyen igényt sem az eszköz tűzfalával, sem a portokkal kapcsolatban.

- Minden esetleges függőség a program részét fogja képezni, és azzal eggyütt fog feltelepülni, éppen ezért nincs szükség semmilyen külső szoftverre az alkalmazás helyes működéséhez.

- Az adatok lokális fájlba mentéséhez, valamint a lokális fájlból az adatok megnyitásához a felhasználónak engedélyezni kellesz azt, hogy az alkalmazás hozzáférjen a mobiltelefon tárhelyéhez, és módosítsa azt.

## Absztrakt domain modell
## Architekturális terv
## Implementációs terv
## Tesztterv
## Telepítési terv
## Karbantartási terv