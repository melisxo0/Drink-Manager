# Drink Manager

## Projektinformationen
Dieses Projekt wurde im Rahmen der Übung 04 (Gruppenübung) der FH CAMPUS 02 erstellt. Ziel ist es, alle gelernten Inhalte der Lehrveranstaltung im Rahmen eines größeren Beispiels (Queue) gemeinsam umzusetzen.

**Teammitglieder:**
* Melisa Gashi
* Viktoria Gospodinova 

---

## Taskliste

**Maven Detail (`maven_detail`)**
- [x] `pom.xml` um notwendige Bibliotheken erweitern
- [x] Entwickler*innen Informationen für beide Teammitglieder hinzufügen
- [x] Adresse des Git Repositories hinzufügen
- [x] Maven Konfiguration über die Kommandozeile testen

**Bug Hunt (`bug_hunt`)**
- [x] Alle Fehler im Code korrigiert und gefunden

**Drink (`drink`)**
- [x] Klasse `Cocktail` erstellen (implementiert Interface `Drink`)
- [x] Konstruktor für Name (String) und Liquid Liste (`List<Liquid>`) umsetzen

**Queue (`queue` & persönliche Branches)**
- [x] Klasse `DrinkQueue` erstellen
- [x] Persönliche Branches (`queue_melisa`, `queue_viktoria`) erstellen
- [x] Interface-Methoden Teil 1 umsetzen
- [x] Interface-Methoden Teil 2 umsetzen
- [x] Persönliche Branches in den gemeinsamen `queue` Branch mergen

**Javadoc (`javadoc`)**
- [x] Javadoc für bestehende Klassen erstellen (inkl. `@param`, `@return`, `@throws`)
- [x] Javadoc für neue Klassen (`Cocktail`, `DrinkQueue`) erstellen
- [x] Attribute aller Klassen dokumentieren

**Tests (`tests`)**
- [ ] Testdateien nach dem vorgegebenen Namensschema (`KlassenNameTest.java`) erstellen
- [ ] 100% Testabdeckung für bestehende Klassen erreichen
- [ ] 100% Testabdeckung für neue Klassen erreichen
- [ ] `mvn test` über die Kommandozeile fehlerfrei ausführen

**Maven Site (`maven_site`)**
- [ ] Ordnerstruktur für Maven Site anlegen (`src/site/markdown`)
- [ ] `site.xml` zur Menükonfiguration erstellen
- [ ] `member1.md` mit umgesetzten Teilen erstellen
- [ ] `member2.md` mit umgesetzten Teilen erstellen
- [ ] `mvn site` (nach `mvn test`) über die Kommandozeile generieren und `index.html` prüfen