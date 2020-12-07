# Tesztelési napló

### A dokumentum célja

Ez a dokumentum azért készült, hogy a fejlesztésért felelős csapat, jegyezni tudja az általuk elvégzett
* tesztek idejét,
* állapotát és
* eredményét.

A tesztelés a felületi tesztelést alkalmazza, amely célja, hogy minden az elkészült alkalmazásban található
funkció úgy működik, ahogy az a fejlesztés előtt meg lett tervezve. A tesztelés során a tesztelő az alkalmazást
a fejlesztett grafikus felületen keresztül teszteli le, ahogyan a neve is utal rá. Ennek a tesztelési módnak az a
legnagyobb előnye, hogy a fejlesztők a felhasználó szemszögéből tudják tesztelni az alkalmazást, és olyan
hibákat tudnak kiszűrni, amely teljes mértékben felhasználó eredetű. 

### A tesztelés menete

 1. A fejlesztő elkészít egy felületi elemet (például: gomb)
 2. Ellenőrzi a megjelenését (megfelel-e az elvártaknak)
 3. Teszteli a funkcionalitását (azt teszi-e az elem ami a feladata)
 4. Feljegyzi az elvégzett tesztet:

|Teszt azonosító|Teszt leírása|Várt eredmény|Kapott eredmény|Tesztelés ideje|Teszt elvégzője|Teszt állapota|
|--|--|--|--|--|--|--|
|Btn-1|A menügomb tesztelése|A menü megjelenik|A menü megjelenik|2999.12.31 23:59|Fejlesztő 1|Sikeres|


## Tesztelési jegyzőkönyv

|Teszt azonosító|Teszt leírása|Várt eredmény|Kapott eredmény|Tesztelés ideje|Teszt elvégzője|Teszt állapota|
|--|--|--|--|--|--|--|
|Start-01|Az alkalmazás elindítása|Az alkalmazás elindulása|Az alkalmazás elindulása|2020.12.07 00:15|Duszka Ákos Attila|Sikeres|
|Home-01|A főoldalon található egyenleg dinamikus módosulása|Automatikus frissülés|Automatikus frissülés|2020.12.07 00:17|Duszka Ákos Attila|Sikeres|
|Home-02|A főoldalon található egyenleg előzmények dinamikus módosulása|Automatikus frissülés|Automatikus frissülés|2020.12.07 00:20|Duszka Ákos Attila|Sikeres|
|Menu-01|A főmenü megjelenése|A menü gombnyomásra megjelenik|A menü gombnyomásra megjelenik|2020.12.07 00:21|Duszka Ákos Attila|Sikeres|
|Menu-02|A főmenü eltűnése|A menü gombnyomásra eltűnik|A menü gombnyomásra eltűnik|2020.12.07 00:22|Duszka Ákos Attila|Sikeres|
|Home-03|A főoldalon található egyenleg ellenőrzése|Az egyenleg pontos, minden bejegyzést belekalkulál|Az egyenleg pontos, minden bejegyzést belekalkulál|2020.12.07 00:24|Duszka Ákos Attila|Sikeres|
|Home-04|A főoldalon található egyenleg előzmények ellenőrzése|A legutolsó öt módosulás időrendi sorrendben megjelenik|A legutolsó öt módosulás időrendi sorrendben megjelenik|2020.12.07 00:27|Duszka Ákos Attila|Sikeres|
|Home-05|A fejléc cím ellenőrzése|Fejléc szövege: "Kezdőkép"| Fejléc szövege: "Kezdőkép"| 2020.12.07 00:30|Duszka Ákos Attila|Sikeres|
|Home-06|Sötét mód ellenőrzése a kezdőképernyőn|A szöveg látható, a dizájn kivehető|A szöveg látható, a dizájn részben kivehető|2020.12.07 00:33|Duszka Ákos Attila|Sikeres|
|Menu-03|Sötét mód ellenőrzése a menüben|A szöveg látható, a dizájn kivehető|A szöveg látható, a dizájn kivehető|2020.12.07 00:35|Duszka Ákos Attila|Sikeres|
|Menu-04|Kiadás menüpont működése|Megnyomás hatására kirajzolódik a Kiadás képernyő|Megnyomás hatására kirajzolódik a Kiadás képernyő|2020.12.07 00:37|Duszka Ákos Attila|Sikeres|
|Exp-01|A kiadás képernyő megjelenése|A tartalom megjelenik, formázva|A tartalom formázottan megjelenik|2020.12.07 00:38|Duszka Ákos Attila|Sikeres|
|Exp-02|A lista navigálása|A képernyő görgethető|A képernyő a húzás irányába görgethető|2020.12.07 00:40|Duszka Ákos Attila|Sikeres|
|Exp-03|Elemek megjelenése|Minden elem megjelenik a listában|Minden elem megjelenik a listában|2020.12.07 00:50|Duszka Ákos Attila|Sikeres|
|Exp-04|Lista elemek törlése|A lista elem balra húzásakor az elem törlődik|A lista elem balra húzásakor az elem törlődik|2020.12.07 00:52|Duszka Ákos Attila|Sikeres|
|Exp-05|Értesítés a lista elem törléséről|A képernyő alján megjelenik egy értesítési sáv a törölt elem nevével|A képernyő alján megjelenik egy értesítési sáv a törölt elem nevével|2020.12.07 00:53|Duszka Ákos Attila|Sikeres|
|Exp-06|Törölés visszavonása|Az értesítési sávon megjelenő `Visszavonás` gomb segítségével újra megjelenik a törölt elem|A `Visszavonás` gomb segítségével megjelenik a törölt elem|2020.12.07 00:55|Duszka Ákos Attila|Sikeres|
|Exp-07|Törölt és visszavont elem ellenőrzése|Az adatok megegyeznek a törlés előttivel, pozíciója változatlan|Az adatok megegyeznek, pozíciója nem változott|2020.12.07 00:59|Duszka Ákos Attila|Sikeres|
|Exp-08|Sötét mód ellenőrzése a Kiadások képernyőn|A szöveg látható, a dizájn kivehető|A szöveg látható, a dizájn kivehető|2020.12.07 01:02|Duszka Ákos Attila|Sikeres|
|Exp-09|A kiadásokhoz csatolt Kiadás csoport színeinek ellenőrzése|A színek megjelennek, a csoport neve könnyen kiolvasható|A színek megjelennek, a szöveg könnyen olvasható|2020.12.07 01:05|Duszka Ákos Attila|Sikeres|
|Exp-10|A lebegőgomb ellenőrzése|Megfelelő helyen van, megnyomható|Megfelelő helyen van, megnyomható|2020.12.07 01:08|Duszka Ákos Attila|Sikeres|
|Exp-11|Kiadás hozzáadási képernyő|A képernyő a lebegőgomb megnyomásának hatására megjelenik| A képernyő a lebegőgomb megnyomásának hatására megjelenik|2020.12.07 01:13|Duszka Ákos Attila|Sikeres|
|Menu-05|Csoportok Fül működése|Menüpontra kattintva megnyitodik a Csoportok screen|Menüpontra kattintva megnyitodik a Csoportok screen|2020.12.07 01:54|Halász Ádám|Sikeres|
|Grp-01|Csoportok screen megjelenése|A képernyő és tartalma megjelenik|A képernyő és tartalma megjelenik|2020.12.07 02:12|Halász Ádám|Sikeres|
|Grp-02|Csoportunk eleme megjelenik|Betöltéskor a csoport egyik eleme sikeresen megjelenik|Betöltéskor a csoport egyik eleme sikeresen megjelenik|2020.12.07 02:19|Halász Ádám|Sikeres|
|Grp-03|Csoportok eleme szineződik|A csoportunk eleme mellett megjelenik egy szines elem|A csoportunk eleme mellett megjelenik egy szines elem|2020.12.07 02:20|Halász Ádám|Sikeres|
|Grp-04|A csoportunk szine változó|A csoportunkhoz asszociált szín elemtől függő színt vesz fel|A csoportunkhoz asszociált szín elemtől függő színt vesz fel|2020.12.07 02:21|Halász Ádám|Sikeres|
|Grp-05|Táblázat feltöltése|Adatbázisból feltöltődik a táblázatunk adatokkal|A táblázatban megjelennek adatbázisból szerzett elemek|2020.12.07 02:25|Halász Ádám|Sikeres|
|Grp-06|Csoportok listázása|Több különböző féle listaelem megjelenik egymás mellett|Több különböző féle listaelem megjelenik egymás mellett|2020.12.07 02:30|Halász Ádám|Sikeres|
|Grp-07|Lista elemek közötti elválasztó|Az elemek között megjelenik egy elválasztó elem|Az elemek között megjelenik egy elválasztó elem|2020.12.07 02:32|Halász Ádám|Sikeres|
|Grp-08|Több elem kilistázása|Egyszerre több elem sorolódik fel a táblázatunkban|Több elem jelenik meg a táblázatunkban|2020.12.07 02:33|Halász Ádám|Sikeres|
|Grp-09|Lista elemek görgetése|A képernyőn megjeleníthetőnél több elem megjelenése görgetés segítségével|A képernyőn megjeleníthetőnél több elem megjelenése görgetés segítségével|2020.12.07 02:36|Halász Ádám|Sikeres|
|Grp-10|Lista elemek törlése|A lista elem balra húzásakor a kívánt elem törtlődik|Az elem törtlődik balra húzáskor|2020.12.07 02:39|Halász Ádám|Sikeres|
|Grp-11|Egy értesítés megjelenik törlés esetén|Elem törlése esetén alul megjelenik egy üzenet a törölt elem nevével|Elem törlése esetén alul megjelenik egy üzenet a törölt elem nevével|2020.12.07 02:41|Halász Ádám|Sikeres|
|Grp-12|Törlés visszavonása gomb|Az alsó értesítés jobb oldalán megjelenik egy Visszavonás gomb|Az alsó értesítés jobb oldalán megjelenik egy Visszavonás gomb|2020.12.07 02:46|Halász Ádám|Sikeres|
|Grp-13|Visszavonás gomb működése|A visszavonás gomb megnyomásával újra megjelenik a törölt elemünk|A visszavonás gomb megnyomásával újra megjelenik a törölt elemünk|2020.12.07 02:47|Halász Ádám|Sikeres|
|Grp-14|Sötét mód működése|Sötét módra váltás esetén a csoportlista alkalmazkodik|A lista sötétmódra váltott|2020.12.07 02:53|Halász Ádám|Sikeres|
||||||||

