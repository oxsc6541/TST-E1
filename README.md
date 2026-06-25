# Einsendeaufgabe TST-E1: Projektaufgabe Testen
README wurde mit Hilfe Google KI-Modus ergänzt und korrigiert
Dieses Repository enthält die praktische Umsetzung der Einsendeaufgabe **TST-E1**. Das Projekt wurde mit **Java 23**, **Maven** und **IntelliJ IDEA Premium** umgesetzt.

## Abgegeben wurde die Variante: A1 + A2 + A3 + A4

---

## 🛠️ Projektstruktur & Übersicht

* **A1: Unit-Tests für eigenen Code**
  * Klasse: `src/main/java/de/meinprojekt/Calculator.java`
  * Test: `src/test/java/de/meinprojekt/CalculatorTest.java`
  * *Abdeckung:* Standard-Operationen sowie explizite Überprüfung von Fehlern mittels **Exception**-Handling (`assertThrows`).

* **A2: TDD - Shopping Cart**
  * Klassen: `ShoppingCart.java`, `CartItem.java`
  * Test: `ShoppingCartTest.java`
  * *Besonderheit:* Die schrittweise Entwicklung (Evolution) des Warenkorbs ist lückenlos über die Git-History in den Commits nachvollziehbar (`test (red)` -> `feat (green)`).

* **A3: Mocking**
  * Schnittstellen & Klassen: `DiscountService.java`, `PriceCalculator.java`
  * Test: `PriceCalculatorTest.java`
  * *Fokus:* Isolation einer unvorhersehbaren Netzwerk-API mittels **Mockito**. Verwendung von `@Mock`, `@InjectMocks`, `when().thenReturn()` und `verify()`.

* **A4: Mutation Testing**
  * Werkzeug: **PIT (Pitest)**
  * *Fokus:* Überprüfung der Testqualität durch das gezielte Injizieren von Mutanten (Künstliche Fehler).

---

##  Wie man die Tests ausführt

### Normale Unit- & Mock-Tests (JUnit 5 / Mockito)
Führen Sie im Hauptverzeichnis des Projekts folgenden Befehl im Terminal aus:
```bash
mvn test
```

### Mutation Testing (PIT-Report generieren)
Um das Mutation-Testing-Tool zu starten und den Report zu erzeugen, nutzen Sie:
```bash
mvn pitest:mutationCoverage
```
Der generierte, interaktive HTML-Bericht befindet sich nach dem Durchlauf unter:  
`target/pit-reports/index.html`

---

## 📝 Wichtiger Hinweis zur Dokumentation
Die vollständige und kritische Auseinandersetzung mit dem Code, den gefundenen Grenzwerten (Edge-Cases), der KI-Nutzung sowie den technischen Hürden (wie dem Java 23 ByteBuddy-Konflikt) befindet sich detailliert in der Datei **`AI_NOTES.md`** hier im Repository.
