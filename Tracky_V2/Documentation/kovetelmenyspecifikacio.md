# Követelmény specifikáció

## Jelenlegi helyzet
A cégünk jelenleg egy papír alapú vezetési rendszert használ. Ez nagyon sok téren nem effektív és a kezelése is nehéz.
Egyrészt a munkaerő, és fizikai munka ami benne van. Mindent kézzel kell írni, és vezetni, ami nem egyszerű. Javítási vagy szerkesztőség lehetősége sem áll nagyon fent, vagy unprofesszionális.
Mivel papír alapú, így nagyon sok papírra van szükség, és ezeket rendezni is időigényes.
Például ha megakarunk találni egy régebbi dokumentumot, ez nagyon időígényes és sok munkát von maga után mivel, meg kell keresni az évjáratot ( évjárat / hónap szerint vannak rendezve a dokumentumok ), hónapot, és azon belül végigmenni az összes papíron ameddig meg nem találjuk az általunk keresettett.
Tárolása is nagyon hely igényes, az összes dossziét úgy kell elrendeznünk és tárolnunk, hogy ezeket könnyen elérhessük, de mégse legyenek útba.

## Vágyálom rendszer
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


## Jelenlegi üzleti folyamatok
3.1 **Bevételek Kezelése**

3.1.1 Bevétel felvitele a jegyzetfüzetbe => Az aktuális jegyzetfüzet megkeresése -> Az utolsó bejegyzés
megkeresése -> Tollal, kézzel beírni a keletkezett kiadást

3.1.2 Bevétel törlése a jegyzetfüzetből => Az aktuális jegyzetfüzet megkeresése -> A törölni kívánt bejegyzés
megkeresése kézzel a teljes füzetből -> A bejegyzés áthúzása

3.1.3 Minden Bevétel törlése a jegyzetfüzetből => Füzetborítóra jegyzőkönyvet írni a törölni kívánt oldalak
számairól

3.1.4 Bevétel szerkesztése => Az aktuális jegyzetfüzet megkeresése -> A szerkeszteni kívánt bejegyzés
megkeresése kézzel a teljes füzetből -> A bejegyzés áthúzása -> Szerkesztési megjegyzést írni a margóra
a javított bejegyzés aktuális füzet és oldalszámáról -> A megadott füzet megadott oldalán új bejegyzést
létrehozni a javított értékekkel -> A margóra az eredet hivatkozását feljegyezni

3.2 **Kiadások Kezelése**

3.2.1 Kiadás felvitele a jegyzetfüzetbe => Az aktuális jegyzetfüzet megkeresése -> Az utolsó bejegyzés
megkeresése -> Tollal, kézzel beírni a keletkezett kiadást

3.2.2 Kiadás törlése a jegyzetfüzetből => Az aktuális jegyzetfüzet megkeresése -> A törölni kívánt bejegyzés
megkeresése kézzel a teljes füzetből -> A bejegyzés áthúzása

3.2.3 Minden Kiadás törlése a jegyzetfüzetből => Füzetborítóra jegyzőkönyvet írni a törölni kívánt oldalak
számairól

3.2.4 Kiadás szerkesztése => Az aktuális jegyzetfüzet megkeresése -> A szerkeszteni kívánt bejegyzés
megkeresése kézzel a teljes füzetből -> A bejegyzés áthúzása -> Szerkesztési megjegyzést írni a margóra
a javított bejegyzés aktuális füzet és oldalszámáról -> A megadott füzet megadott oldalán új bejegyzést
létrehozni a javított értékekkel -> A margóra az eredet hivatkozását feljegyezni

3.3 **Csoportok Kezelése**

3.3.1. Csoport létrehozása => A jegyzetfüzet elülső borítójának belső oldalára tollal feljegyezni a létrehozni kívánt
csoportot -> Megjegyzést létrehozni a csoporthoz -> Csoport azonosító kódot feljegyezni a sor legelejére

3.3.2. Csoport törlése => A jegyzetfüzet elülső borítójának belső oldalán kikeresni a törölni kívánt
csoportot -> A törölni kívánt csoport sorát tollal áthúzni -> Az adott füzetben az összes törölt csoportra
hivatkozó csoport azonosító kódot megkeresni -> A nem létező csoportra hivatkozó azonosító áthúzása

3.3.3. Minden csoport törlése =>  A jegyzetfüzet elülső borítójának belső oldalán a legutolsó csoport alatt
vonalat húzni -> A vonal alatt jegyzőkönyvet írni a törlésről -> A jegyzőkönyvbe bejegyezni az összes csoport
azonosító kód érvénytelenítéséről szóló emlékeztetőt

3.3.4 Csoport szerkesztése => A jegyzetfüzet elülső borítójának belső oldalán kikeresni a javítani kívánt
csoportot -> A javítani kívánt csoport sorát tollal áthúzni -> Szerkesztési megjegyzést írni a margóra
a javított csoport aktuális sorszámáról -> A legutolsó csoport sor után új sor írása a javítani kívánt csoport
javított adatokkal

3.4 **Összesítés**

3.4.1. Minden bevétel és kiadás listázása => Az aktuális összesítő jegyzetfüzet előkeresése vagy új készítése ->
Az összes jegyzetfüzet kikeresése -> Sorba rendezni a jegyzetfüzeteket -> Kikeresni a legutoljára felvitt
bejegyzéseket -> A legutoljára felvitt bejegyzést követő bejegyzéstől kezdődően kézzel felvinni minden azt
követő bejegyzést az összesítő jegyzetfüzetbe

3.4.2. Bevételek szűrése => Az aktuális összesítő jegyzetfüzet előkeresése -> Az aktuális bevétel összesítő
 jegyzetfüzet előkeresése vagy új készítése -> Kézzel felvinni minden bevételi bejegyzést az összesítő
jegyzetfüzetből a bevétel összesítő jegyzetfüzetbe

3.4.3. Kiadások szűrése => Az aktuális összesítő jegyzetfüzet előkeresése -> Az aktuális kiadás összesítő
jegyzetfüzet előkeresése vagy új készítése -> Kézzel felvinni minden kiadási bejegyzést az összesítő
jegyzetfüzetből a kiadás összesítő jegyzetfüzetbe

3.4.4.1 Kiadások és Bevételek szűrése dátum szerint=> Megkeresni a keresett dátum évéhez kapcsolódó
összesítő jegyzetfüzetet -> Megkeresni az első lapot amely a megadott dátum hónapjához kapcsolódik ->
Végig keresni az összes bejegyzést, amíg el nem jutunk a dátum által megadott nap első bejegyzéséhez ->
Feljegyezni az első bejegyzés pontos helyét: Jegyzetfüzet száma, oldala, bejegyzés sorának száma ->
Megkeresni a legutolsó bejegyzést amely a megadott dátumhoz vagy idő tartományhoz tartozik ->
Feljegyezni az utolsó bejegyzés pontos helyét: Jegyzetfüzet száma, oldala, bejegyzés sorának száma

3.4.4.2 Kiadások és Bevételek szűrése összeg szerint=> 1. lépés: Legelső jegyzetfüzet megkeresése ->
2. lépés: Kikeresni a legnagyobb összeget az aktuális oldalon -> 3. lépés: Feljegyezni az aktuális bejegyzés 
pontos helyét: Jegyzetfüzet száma, oldala, bejegyzés sorának száma -> **4. lépés: Végrehajtani a 2. és a 3.
lépést ameddig el nem végeztük a jegyzetfüzet utolsó oldalán is** -> 5. lépés: Megkeresni a soron következő
jegyzetfüzetet -> **6. lépés: Végrehajtani a 2., 3., 4. és az 5. lépést ameddig el nem végeztük a legutolsó
jegyzetfüzet legutolsó oldalán is**

## Igényelt üzleti folyamatok
4.1 **Bevételek Kezelése**

4.1.1 Bevétel felvitele az adatbázisba => Bal felső menü -> Bevétellista -> Jobb alsó
lebegő gomb -> Összeg és leírás megadása -> Hozzáad gomb megnyomása

4.1.2 Bevétel törlése az adatbázisból => Bal felső menü -> Bevétellista ->
A törölni kívánt tétel elhúzása ujjal

4.1.3 Minden Bevétel törlése az adatbázisból => Bal felső menü -> Bevétellista ->
Jobb alsó lebegő gomb -> Összes Törlése gomb megnyomása

4.1.4 Bevétel szerkesztése => Bal felső menü -> Bevétellista -> Szerkeszteni kívánt
-> Bevétel kiválasztása -> Az új adatok megadása -> Mentés

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
* K01 Könnyú használhatóság
* K02 Grafikus felhasználói felület
* K03 Reszponzív Design 
* K04 Adattárolás az eszközön 
* K05 Biztonságos adattárolás 
* K06 Mozgathatóság
* K07 Grafikus költségkimutatás
* K08 Grafikus bevételkimutatás
* K09 Összesített bevétel/költségkimutatás


## Fogalomszótár
>*Erőforrás:* Olyan szellemi, anyagi, gazdasági, társadalmi tényező,
amely lehetőséget ad vagy alkalmas Eszköz lehet adott cél megvalósításához.

>*Optimalizálás:* Legjobb állapot illetve cselekvés kiválasztására alkalmas eljárás, valamely előre meghatározott kritérium alapján.

>*Karakterkészlet:* A számítógép számára, az emberi írásjeleket definiáló, és csoportosító szabvány.

>*Reszponzív dizájn:* A reszponzív design az alkalmazásnak egy olyan kialakítása,
ami rugalmasan alkalmazkodik a különböző eszközök képernyőjének méretéhez.

>*Lokális adattárolás:* Az adatok tárolása az adatkezelő rendszerrel azonos helyen történik.

