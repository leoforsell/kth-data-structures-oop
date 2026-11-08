# KTH Data Structures & OOP

Eget Java-projekt inför studier i informationsteknik. Bygg datastrukturer från grunden, testa hur de beter sig och jämför deras tidskomplexitet. [ID1021 Algoritmer och datastrukturer](https://www.kth.se/student/kurser/kurs/ID1021) och [IV1350 Objektorienterad design](https://www.kth.se/student/kurser/kurs/IV1350) ger kurskontext för övningarna.

## Kom igång

Installera [JDK 21](https://adoptium.net/temurin/releases/?version=21) och [Apache Maven](https://maven.apache.org/install.html). Kontrollera att även Maven använder Java 21.

```sh
java -version
mvn -version
git clone https://github.com/leoforsell/kth-data-structures-oop.git
cd kth-data-structures-oop
mvn clean test
java -cp target/classes se.kth.prep.structures.ListDemo
```

Demon skriver ut `A`, `B`, `C` på varsin rad följt av `Storlek: 3`. Öppna mappen som ett Maven-projekt via `pom.xml` om du arbetar i en IDE.

## Första arbetspasset

1. Kör testerna och demon. Följ anropen från [ListDemo](src/main/java/se/kth/prep/structures/ListDemo.java) via [CustomList](src/main/java/se/kth/prep/structures/CustomList.java) till [CustomArrayList](src/main/java/se/kth/prep/structures/CustomArrayList.java). Förklara vad som händer när ett element sätts in i mitten av listan.
2. Öppna [de befintliga JUnit-testerna](src/test/java/se/kth/prep/structures/CustomArrayListTest.java). Skapa grenen `test/array-list-edge-cases` och skriv ett test som lägger till ett element i en lista med startkapacitet 0. Kontrollera att elementet kan hämtas och att storleken är 1.
3. Kör `mvn test`, committa med `test: cover append from zero capacity` och öppna en pull request. Beskriv vilket gränsfall testet täcker.

Öppna [issue #2](https://github.com/leoforsell/kth-data-structures-oop/issues/2) för första arbetspasset. Fortsätt sedan med [studieplanen](docs/studieplan.md), där varje uppgift har läsning, kodmall och en länk till sitt issue.

`CustomArrayList` är den fungerande referensen. Metoder markerade med `TODO` i övriga mallar kastar `UnsupportedOperationException` tills du implementerar dem. Baslinjen `mvn clean test` kör testerna för arraylistan. Lägg till nya tester på din arbetsgren när du börjar med respektive mall.
