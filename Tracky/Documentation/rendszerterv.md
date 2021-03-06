# Rendszerterv
## A rendszer célja
- **A rendszer céljai:**

	- A rendszer célja, hogy a jelenleg papíron vezetett kiadás és bevétel kezelés lecserélése egy alkalmazásra. Ennek az alkalmazásnak egy érthető, és egyszerűen navigálható grafikus felhasználói felülettel kell rendelkeznie a könnyű használhatóság érdekében.

	- Fontos továbbá az is, hogy a megadott bevételeket és kiadásokat többféleképpen is lehessen rendezni.

	- Ilyen rendezési alap például a kiadás típusa. Ez alatt azt értjük, hogy a felhasználó megadhatja azt, hogy például az adott kiadást mire költötte el. Ilyen lehet például az étel, a csekkek befizetése, cigaretta stb.

	- Egy másik rendezési alap pedig a dátum. A felhasználó megadhat egy kezdődátumot, és egy végdátumot, majd a rendszer a két dátum közötti időszak bevételeit automatikusan összesíti.

	- Valamint lehessen statisztikai kimutatásokat is létrehozni az adatokból annak érdekében, hogy ne kézzel kelljen ezeket kiszámolni. A kimutatásoknak könnyen érthetőnek kell lennie.

	- Végül pedig fontos, hogy a lokális adatokat exportálni lehessen .csv fájlba annak érdekében, hogy a megadott adatok könnyen hordozhatóak legyenek.

- **A rendszernek nem céljai:**

	- Az alkalmazásnak nincs olyan része, ami online kapcsolatot igényelne, éppen ezért a rendszernek nem célja semmilyen online kapcsolatot kialakítani egy szerverrel se online adattárolás, sem pedig online hitelesítés miatt.

	- Az adatok tárolása csakis lokális formában valósuljon meg.

	- Egy eszközön a rendszernek csupán egy felhasználó egy adott költségvetési adatait kell nyílván tartania, azaz nem egy többfelhasználós rendszer a cél.

	- A rendszernek továbbá nem célja sem egy akadálymentes mód biztosítása, sem pedig különböző nyelvek támogatása.

## Projekt terv

 1. A program alap UI-át megcsinálni, ebbe beleértve a táblázatunkat és a főoldalon lévő gombokat. 
 2. Megcsinálni a programunkhoz tartózó fájlrendszert ebbe:
      * Tudjunk írni a hozzáadás gomb segítségével
      * Beolvasni a fájlban lévő adatokat és beilleszteni a táblázatunkba
      * Szerkeszteni a fájlban / táblázatban lévő adatokat
      * Törölni adatokat
3. Az adattípusok elkülönítése.
4. Az oldalról kijövő menüt, és a menüpontjait. 
5. Statisztika menüpontot, ahol akár hónapos statisztikákat tudunk megnézni a költekezéseinkról, vagy bevételünkről. 
6. Rendezés, ezzel együtt típus alapú rendezés, amikor csak egy bizonyos típusú elemeket fog megjeleníteni. Például, csak a office kellékek csoportját, és ezen belül tollak, papír stb.
7. Tudjuk az adatainkat impotálni és exportálni ezzel biztosítva a mozgathatóságot.

## Üzleti folyamatok modellje
**Üzleti szereplők:** Az üzleti szereplők, mostantól *aktorok*: olyan személyek, akik a megrendelő
cég alkalmazottai és a jövőben az elkészült programot fogják használni az üzleti folyamatok
végrehajtásához.

**Üzleti folyamatok:** 

* **Kiadás felvitele lokális fájlba:** Ez a folyamat akkor következik be, amikor az aktorok új kiadással
   szembesülnek. Ekkor az alkalmazás megnyitását követően lehetőségük van az aktoroknak a kiadást
   a programban lejegyezni, amely a későbbiekben egyéb képességeket biztosít a régi üzleti folyamatokkal
   szemben.
   
 * **Bevételek felvitele lokális fájlba:** Ez a folyamat akkor következik be, amikor az aktorok új bevétellel
   szembesülnek. Ekkor az alkalmazás megnyitását követően lehetőségük van az aktoroknak a bevételt
   a programban lejegyezni, amely a későbbiekben egyéb képességeket biztosít a régi üzleti folyamatokkal
   szemben. 
   
* **Tételek csoportosítása:**  Ez a folyamat az összesítések alkalmával fontos, mivel amikor az aktoroknak
csoportosítania kell bizonyos tétel csoportokat, az elkészülő program segítségével rengeteg erőforrást
spórolhat meg a megrendelő. A folyamat működése azon alapszik, hogy a tételek felvitelekor minimális
erőforrás befektetésével hosszú távon sokat meg lehet takarítani. A folyamat úgy zajlik, hogy amikor
az aktor felviszi a tételt, megad egy tétel csoportot, ami még manuális munka, azonban a munka jelentős
része automatizálható az által, hogy a csoportosítást a számítógép végzi el.

* **Összesítés:** Ebben a folyamatban az aktorok számára legmegterhelőbb feladatot terheljük rá az
informatikai berendezésre, amely a csoportosítás és statisztikai elemzés készítése. Mivel a számítógépek
sokkal jobbak a matematikai számítások elvégzésében, ezért ez volt a legnagyobb oka a gépesített rendszer
igényének felmerülésére. Az aktoroknak elég néhány gombot megnyomnia, specifikálni néhány beállítást és
a rendszer már ki is számítja a meglévő adatok alapján a költségvetést a specifikált időintervallumra.

**Erőforrás igények:**

* **Jelenlegi üzleti folyamatok:**
	* Kiadás rögzítése: 1 aktor, 3-5 perc.

	* Bevétel rögzítése: 1 aktor, 3-5 perc.

	* Tételek csoportosítása: 1-2 aktor, 1-2 óra, egy havi bevételek és kiadások esetében, 
	  amelyek összesített száma nem haladja meg az egyezer tételt.
	
	* Összesítés: 2-3 aktor, 6-9 óra egy havi bevételek és kiadások esetében, amelyek
	  összesített száma nem haladja meg az ötezer tételt.

* **Igényelt üzleti folyamatok:**
	* Kiadás rögzítése: 1 aktor, 1-2 perc.

	* Bevétel rögzítése: 1 aktor, 1-2 perc.

	* Tételek csoportosítása: 1 aktor, 2-5 perc akár több mint ötezer tétel esetén is.
	
	* Összesítés: 1 aktor, 3-5 perc akár több mint ötezer tétel esetén is.

## Követelmények
**Funkcionális követelmények:**

* Adat tárolási modul (Data Storage module): 
	Feladata az adatok mentése a lokális eszközre, valamint az adatok programba való betöltése a
	rendszer indulásakor. Ezen felül lehetőséget nyújt a külső programokkal való közös használatra
	az importálási, valamint exportálási funkciók segítségével.
	
* Adat kezelői modul (Data Handler module):
	Az adat kezelői modul feladatául szolgál a különböző tételek rögzítése, mint például a bevételek
	vagy a kiadások. A már létező tételek módosítása valamint eltávolítása is ennek a modulnak
	a segítségével történhet meg. Ezen felül pedig fontos feladata még a kiadás csoportok menedzsmentje is,
	amely egyéb funkciókat biztosít, például a kiadások csoportosításában.
	
* Adat elemző modul (Data Analytic module):
	Az adat elemző modul, lehetővé teszi, hogy a kiadásokon és bevételeken statisztikát végezzünk,
	ezáltal figyelemmel követhetjük, egyes kiadás csoportjainkat, pontosan számon tarthatjuk a
	pénzügyi változások történéseinek idejét, valamint elemzéseket kaphatunk az általunk megadott
	időszakokra.
	
* Sablon kezelő modul (Template Handler module):
	A sablon kezelő modul lehetőséget nyújt sablonok használatára, amely segítségével
	könnyen és gyorsan létre lehet hozni sablonokat, a villám gyors tétel kiíráshoz.

**Nem funkcionális követelmények:**
* Hatékonyság:
	Fontos, hogy a program képes legyen minimális költségű eszközökön is működni,
	valamint legalább olyan sebességet nyújtani, hogy a tétel kiírás a lehető legkevesebb idő
	alatt megtörténjen. Ez maximálisan öt másodperc lehet nem sablonból történő tétel kiírás
	alkalmával.
	
* Megbízhatóság:
	Az Adat tárolási rendszer belső mentési szolgáltatásában nem fordulhat elő olyan hiba,
	amely adatvesztéssel járna. A felhasználói felületen maximum olyan hiba üzenet jelenhet 
	meg, amely a felhasználó hibájából keletkező hiba létét jelzi, minden egyéb belső rendszer
	hibát a programnak rejtett módon, magának kell kijavítania.
	
* Biztonság:
	Mivel a program nem kapcsolódik internethez, így a biztonságot a felhasználónak kell
	megteremtenie, megfelelő eszköz biztonsági óvintézkedéssel.

* Hordozhatóság:
	A rendszernek az Android operációs rendszerek lehető legnagyobb halmazán működjön,
	alkalmazkodva többféle képernyő felbontáshoz és mérethez, azonban nem elvárás, hogy
	döntött nézetben is működő képes legyen.
	
	Fontos a kompatibilitás egyéb irodai szoftverekkel, mint például a Microsoft Office Excel
	programja, valamint egyéb külső programok, így a programnak képesnek kell lennie az adatok
	univerzálisan felhasználható módon történő kimentése is.

* Felhasználhatóság:
	A program felhasználói felületét olyan módon kell elkészíteni, hogy informatikai és pénzügyi
	szakmabeli tudás nélkül is könnyedén lehessen használni, minimális vagy elhanyagolható 
	mennyiségű betanulási idővel. Ne tartalmazzon a felhasználót nem érintő információkat,
	valamint kétes értelmezhetőségű adatokat.
	
**Törvényi előírások:**

A program nem szándékozik hivatalos dokumentumokat előállítani, valamint nem csatlakozik
internetes hálózathoz, ezért törvényi előírások, a jelen dokumentum megírásakor erre a programra
nem vonatkoznak.

**Informatikai szabványok a programban:**

A program a szabványos Java programozási nyelv elemeit tartalmazza, minimális külső szoftver
igénybevételével. A program által készített exportálható fájl szabványos `.csv` kiterjesztésűek legyenek
és pontosvessző karakter (`;`) szeparátorokat használjon. Fontos, hogy támogassa az európai nyelveket,
ezért a programban minden adatnál az *UTF-8* karakter kódolási szabványt kell használni.

## Funkcionális terv
|Funkció azonosító|Funkció metódus neve|Metódus rövid leírása|
|--|--|--|
|DS-01|`save()`|A `save()` metódus a *Java* nyelv beépített fájl kezelő rendszerének segítségével elmenti az adattárolóra a memóriában lévő összes adatot (bevételek, kiadások, sablonok, ...).|
|DS-02|`open()`|Az `open()` metódus a *Java* nyelv beépített fájl kezelő rendszerének segítségével beolvassa a memóriába a fizikai tárolón lévő összes adatot (bevételek, kiadások, sablonok, ...).|
|DS-03|`export()`|Az `export()` metódus a *Java* nyelv beépített fájl kezelő rendszerének segítségével elmenti a felhasználó által kiválasztott fájlba az eddig elmentett bevételeket és kiadásokat pontosvesszővel elválasztott formátumban.|
|DS-04|`import()`|Az `import()` metódus a *Java* nyelv beépített fájl kezelő rendszerének segítségével beolvassa a memóriába a fizikai tárolón lévő pontosvesszővel elválasztott formátumú fájlt és a rendszer által használt formátumba alakítja.|
|DH-01|`addIncome()`|Az `addIncome()` metódus létrehoz egy új `Income` egyedet a memóriában.|
|DH-02|`editIncome()`|Az `editIncome()` metódus a megadott adatokkal átírja a memóriában lévő módosítandó `Income` egyedet.|
|DH-03|`deleteIncome()`|A `deleteIncome()` metódus a kitörli a memóriában lévő megadott `Income` egyedet. (Ez később kitörli a fájlban lévő azonos elemet, amikor a felhasználó menteni fog.)|
|DH-04|`addExpense()`|Az `addExpense()` metódus létrehoz egy új `Expense` egyedet a memóriában.|
|DH-05|`editExpense()`|Az `editExpense()` metódus a megadott adatokkal átírja a memóriában lévő módosítandó `Expense` egyedet.|
|DH-06|`deleteExpense()`|A `deleteExpense()` metódus a kitörli a memóriában lévő megadott `Expense` egyedet. (Ez később kitörli a fájlban lévő azonos elemet, amikor a felhasználó menteni fog.)|
|DH-07|`addGroup()`|Az `addGroup()` metódus létrehoz egy új `Group` egyedet a memóriában.|
|DH-08|`editGroup()`|Az `editGroup()` metódus a megadott adatokkal átírja a memóriában lévő módosítandó `Group` egyedet.|
|DH-09|`deleteGroup()`|A `deleteGroup()` metódus a kitörli a memóriában lévő megadott `Group` egyedet. (Ez később kitörli a fájlban lévő azonos elemet, amikor a felhasználó menteni fog.)|
|DA-01|`balance()`|A `balance()` metódus összegzi az összes memóriában lévő bevételt és kiadást és megadja az aktuális egyenleget.|
|DA-02|`listIncomesByTime()`|A `listIncomesByTime()` metódus idő szerint rendezi az összes memóriában lévő bevételt majd átadja a program megjelenítő részének.|
|DA-03|`listExpensesByTime()`|A `listExpensesByTime()` metódus idő szerint rendezi az összes memóriában lévő kiadást majd átadja a program megjelenítő részének.|
|DA-04|`listExpensesByGroup()`|A `listExpensesByGroup()` metódus idő majd csoportok szerint rendezi az összes memóriában lévő kiadást majd átadja a program megjelenítő részének.|
|DA-05|`summarizeAll()`|A `summarizeAll()` metódus idő szerint rendezi az összes memóriában lévő bevételt és kiadást kielemzi azokat matematikai statisztika segítségével majd átadja a program megjelenítő részének.|
|TH-01|`addExpenseTemplate()`|Az `addExpenseTemplate()` metódus létrehoz egy új `Template` egyedet a memóriában.|
|TH-02|`editExpenseTemplate()`|Az `editExpenseTemplate()` metódus a megadott adatokkal átírja a memóriában lévő módosítandó `Template` egyedet.|
|TH-03|`deleteExpenseTemplate()`|A `deleteExpenseTemplate()` metódus a kitörli a memóriában lévő megadott `Template` egyedet. (Ez később kitörli a fájlban lévő azonos elemet, amikor a felhasználó menteni fog.)|
|TH-04|`addIncomeTemplate()`|Az `addIncomeTemplate()` metódus létrehoz egy új `Template` egyedet a memóriában.|
|TH-05|`editIncomeTemplate()`|Az `editIncomeTemplate()` metódus a megadott adatokkal átírja a memóriában lévő módosítandó `Template` egyedet.|
|TH-06|`deleteIncomeTemplate()`|A `deleteIncomeTemplate()` metódus a kitörli a memóriában lévő megadott `Template` egyedet. (Ez később kitörli a fájlban lévő azonos elemet, amikor a felhasználó menteni fog.)|

**Menü felépítés**

A menü felépítése az alábbi képen látható, ahol a téglalapok a tényleges menüpontokat reprezentálják, míg az ovális elemek az adott oldal funkcióit
mutatják meg.

![A Főmenü felépítésének ábrája](images/menu_diagram.png)

**Képernyő tervek**

*  **Főképernyő:**

Lent látható a főképernyő terve. A főképernyőn látható a felhasználó aktuális egyenlege, valamint néhány a legutolsó egyenleg változások közül.

![A Főképernyő látvány terve](images/main_screen.png)

*  **Főmenü:**

Alább a főmenü terve látható. A fenti képen látható menü gomb (3 vonal) megnyomása után megjelenik a képernyő bal oldalán
egy lap, amelyen az egyes menüpontok között navigálhatunk.

![A Főmenü látvány terve](images/main_menu.png)

## Fizikai környezet
- Az alkalmazás androidos mobiltelefonokra, java nyelven kell, hogy elkészüljön, mivel ez a nyelv a legkedveltebb a mobil alkalmazások készítéséhez.

- Az alkalmazás elkészítéséhez az Android studio nevű programot fogjuk használni, mert egyszerűen lehet androidos alkalmazásokat készíteni vele, különösen a programok frontend részét.

- A programnak a minimális erőforrásigénye miatt nincs semmilyen különleges hardverigénye.

- A programnak nincs semmilyen internetkapcsolatot igénylő eleme, éppen ezért nem támaszt semmilyen igényt sem az eszköz tűzfalával, sem a portokkal kapcsolatban.

- Minden esetleges függőség a program részét fogja képezni, és azzal eggyütt fog feltelepülni, éppen ezért nincs szükség semmilyen külső szoftverre az alkalmazás helyes működéséhez.

- Az adatok lokális fájlba mentéséhez, valamint a lokális fájlból az adatok megnyitásához a felhasználónak engedélyezni kellesz azt, hogy az alkalmazás hozzáférjen a mobiltelefon tárhelyéhez, és módosítsa azt.

## Absztrakt domain modell
A rendszernek öt különböző fő komponense van, amikkel az aktor interaktálni tud.

Az első ilyen komponens a kiadások kezelése, amely minden a kiadással kapcsolatos dolgot magába foglal, amik a következőek: Kiadás rögzítése, Kiadás módosítása, Kiadás törlése, Kiadás csoport rögzítése, Kiadás csoport módosítása, illetve Kiadás csoport törlése.

A második fő komponens a bevételek kezelése, ami minden a bevételekkel kapcsolatos dolgot kezel. Ezek a következőek: Bevétel rögzítése, Bevétel módosítása, illetve Bevétel törlése.

A Harmadik nagy komponense a rendszernek a Sablonok kezelése. Ezen komponens részei a Sablon kiadások módosítása, a Sablon kiadások törlése, a Sablon bevételek létrehozása, valamint a Sablon bevételek törlése.

A negyedik  nagy komponens az adatok tárolása, ami ahogy azt a neve is sugallja minden olyan dologra vonatkozik, aminek köze van az adatok tárolásához. Ezek a következőek: Adatok megnyitása .json fájlból, Adatok mentése .json fájlba, Adatok megnyitása .csv fájlból, valamint Adatok mentése .csv fájlba.

Az ötödik, és egyben utolsó nagy komponense a rendszernek az Összesítés, amely magában tartalmazza a különböző kimutatásokat, amik a következőek: Egyenleg megtekintése, Bevételek listázása idő szerint, Kiadások listázása idő szerint, Kiadások listázása csoport szerint, Kiadások listázása csoport szerint, valamint Kiadások és bevételek összesítése.

Ezt az öt komponenset, a tagjait, illetve a kapcsolatait az alábbi ábrán lehet látni:

![Absztrakt domain modell ábra](images/absztrakt_domain.png)

## Architekturális terv
- A rendszer megvalósítása a modell nézet vezérlő, azaz MVC architekturális minta alapján fog történni. Azaz szét lesz választva az alkalmazás három egymástól jól ekülönülő részre.

- Az alkalmazás fő részei a modell, vagyis az adatok, a view, ami a felhasználói felület, és a controller, ami a vezérlő szerkezet.

- A program Architekturális tervét az alábbi ábra szemlélteti:

![Architekturális terv ábra](images/architekt.png)

- Ahogyan az az ábrán is látható, minden fő komponensnek, a kiadások kezelésének, a bevételek kezelésének, a sablonok kezelésének, az adatok tárolásának, és az összesítésnek is lesz egy controller és egy manager osztálya is.

- A controller osztályok fogják frissíteni a grafikus felhasználói felület komponenseit, valamint meghívni a manager osztályok metódusait.

- A manager osztályok hatáskörébe tartoznak az adatok létrehozásáért, módosításáér, és törléséért felelős metódusok.

- A modell nézet vezérlő achitekturális mintára esett a csapat választása egyrészt a bővíthetőség miatt, mivel ha például új funkciót, vagy funkciókat hozzá kellesz adni az alkalmazáshoz, akkor azt gond nélkül meg lehetlesz oldani.

- Szintén előnyős választás a modell nézet vezérlő minta az átláthatóság szempontjából is, hiszen ha egy adott metódust keresünk, akkor egyből be lehetlesz határolni a helyzetét a projekten belül.

- És végül de nem utolsó sorban fontos előnye a modell nézet vezérlő architekturális mintának a módosíthatóság. Hiszen ha születik például egy olyan döntés, hogy át kellene írni a rendszert egy konzolos alkalmazássá, akkor ehhez a manager osztályok és metódusaik egy az egyben felhasználhatóak lesznek.

- A rendszernek nem lesznek különleges biztonsági funkciói. Mivel az alkalmazásnak nincs olyan része, amely az internethez kapcsolódik, sem pedig olyan eleme, amely személyes adatokkal dolgozna, így nincs szükség semmilyen biztonsági mechanizmusra.

## Adattárolási terv
A program nem használ adatbázist adattárolásra, helyette lokális fájlokba menti ki a felhasználói és rendszeradatokat.
A program által használt adatok .json kiterjesztésű fájlokban lesznek eltárolva.
A tételek, ami lehet bevétel vagy kiadás típusú a records.json fájlban kerülnek eltárolásra.
Amelynek a szerkezete a következőképpen néz ki:

	{
	    "records": [
	        {
		    "isIncome": boolean,
	            "id": integer,
		    "amount": integer,
		    "date": LocalDate,
		    "group": Group
		}
	    ]
	}

A felhasználó által létrehozható tétel sablonokat a rendszer egy másik templates.json nevű fájlba menti ki, amelynek szerkezete alább látható:

	{
	    "templates": [
		{
		    "id": integer,
		    "name": String,
		    "isIncome": boolean,
		    "amount": integer,
		    "date": LocalDate,
		    "group": Group
		}
	    ]
	}

Végül pedig a tételcsoportok is egy *JSON* kiterjesztésű fájlba fognak mentésre kerülni, melynek neve groups.json lesz, amelynek a felépítése a következő:

	{
	    "groups": [
	        {
		    "id": integer,
		    "name": String,
		    "color": String
		}
	    ]
	}

## Implementációs terv

Az implementáció Android Studioba fog történni, Java nyelven. A program cross platform lesz de elsődlegesen androidra lesz a kifejlesztés. Az előbb specifikált funkcionális tervből és képernyőtervből fogunk főleg dolgozni minden más mellett. Elsősorban megtervezzük a programunk alap kinézetét, vagyis a fő ablakunkat, majd erre pakoljuk fel az táblánkat és az első gombokat. Programkódba létrehozzuk ezek gombok működését, és a táblázathoz való metódusokat a funkcionális tervben leírtak alapján. Ha ez megvan tudjuk tesztelni az alapot, és ezt a ciklust folytatva implementálni a többi hiányos elemet is, mindpéldául az oldalsó menü, vagy a keresés gomb / funkció.

## Tesztterv

A projectunket az elejétől kezdve tesztelgetni fogjuk, mint ahogy ezt az implementációs tervben is közölve lett. 
* Először is amint megvan a programunk legalapja, vagyis a legminimálisabb interfacet fogjuk tesztelni. Ez az elején csak azt fogja jelenteni, hogy a fő ablakban a tábla rendesen megjelenik-e, és a többi gomb ami implementálva lett. 
* Majd ezután megcsináljuk az oldalsó menüt, amit a főképen egy gomb megnyomásával fogunk előhozni.
* Az egyenlegünket is teszteljük majd, hozzáadunk és kivonunk belőle, nézve hogy jól működik-e.
* Az oldalsó menü megjelenítése után, az adatbázist fogjuk tesztelni a táblázathoz, és annak megjelenését. Azt szeretnénk hogy:
    * Hozzá tudjunk adni egy adatot a fájlunkba
        * Ez az adat formázva legyen, hogy megkönnyítse a későbbiekben a felolvasását. Például, hogy a hozzáadott adat az egy kiadás vagy bevétel, mennyi az adatunk értéke stb.
        * Ezeken az adatokon változtatni, szerkeszteni abban az esetben ha a felhasználó hibázott volna a bevitele alatt.
        * Adatok törlése a táblázatból
    * Ha a fájlrendszerünk jól működik és sikeresen tudunk írni, szerkeszteni bele, akkor a fájlból való olvasást, vagyis, hogy a programunknak sikerül-e ezt a fájlt értelmezni-e. 
        * Ha a beolvasásunk sikeres és a programunknak sikerül értelmeznie és beolvasnia a fájlból akkor ezt eltárolni egy váltózóba. 
        * Ha megvan a váltózónk ami tartalmazza az adatainkat akkor beillesztjük őket a táblázatunkba, és leteszteljük, hogy a táblázatunk normális jeleníti-e meg az általunk belerakott adatokat.
* Az oldalsó menüsávunkat is tesztelni szeretnénk majd, ezt úgy fogjuk megtenni, hogy a menüpont elemeit megnézzük, hogy működnek-e és előhozzák-e a dolgokat amiket kell nekik.
* A statisztikánkat tesztelni, az előbb táblába, változóba illesztett adatokkal fogjuk. Először is leteszteljük, hogy egy hónapos statisztikát meg tudunk-e jeleníteni, és rendesen mutatja-e a kiadási / bevételi csoportokat.
* A táblázatba illesztett adatok alapján szűrűnk, hogy csak éppen egy csoport termékeit mutassa

## Telepítési terv

A programunk telepítése nagyon egyszerű lesz, és nem lesz szükségünk semmilyen bővítményre, vagy akarmi másra a futtatáshoz.

## Karbantartási terv
