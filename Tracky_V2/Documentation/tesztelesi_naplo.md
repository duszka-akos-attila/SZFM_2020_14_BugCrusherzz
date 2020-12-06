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
|Btn-1|A menügomb tesztelése|A menü megjelenik|A menü megjelenik|2999.12.31|Fejlesztő 1|Sikeres|


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
||||||||

