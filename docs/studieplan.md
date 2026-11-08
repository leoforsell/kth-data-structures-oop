# Läsordning och projektplan

| Moment | Läs | Använd det i projektet |
| --- | --- | --- |
| 1. Gränssnitt och generiska typer | [Dev.java om gränssnitt](https://dev.java/learn/interfaces/) och [generiska typer](https://dev.java/learn/generics/) | Förklara skillnaden mellan typen `CustomList<String>` och objektet `new CustomArrayList<>()` i demon. |
| 2. Dynamisk array | [Open Data Structures, kapitel 2](https://opendatastructures.org/ods-java/2_Array_Based_Lists.html), särskilt 2.1 | Spåra `size` och kapacitet när en lista växer. Jämför kostnaden för `get(i)`, insättning i mitten och `add(element)` över många anrop. |
| 3. Enhetstestning | [JUnit 5 User Guide](https://docs.junit.org/5.10.2/user-guide/), avsnitten Writing Tests och Assertions | Skriv tester som kontrollerar ordning, gränsindex och undantag. Kör ett enskilt test med `mvn -Dtest=CustomArrayListTest test`. |
| 4. Enkellänkad lista | [Open Data Structures, kapitel 3](https://opendatastructures.org/ods-java/3_Linked_Lists.html), särskilt 3.1 | Rita noderna före och efter en insättning eller borttagning. Bygg nästa implementation med mallen nedan. |

## Nästa delprojekt – en enkellänkad lista

Skapa grenen `feat/custom-linked-list`. Lägg `CustomLinkedList.java` bredvid `CustomArrayList.java`. Kopiera nodmallen som utgångspunkt och lägg till `implements CustomList<T>` när listan uppfyller hela gränssnittet.

```java
package se.kth.prep.structures;

public class CustomLinkedList<T> {
    private static final class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private int size;

    // TODO: Börja med size(), add(T) och get(int).
}
```

Gör nodens `value` ändringsbart när du kommer till `set` om du väljer att uppdatera värdet i den befintliga noden.

1. Skriv `CustomLinkedListTest` med ett test för en tom lista och ett för att lägga till två värden och hämta dem i ordning. Implementera `size()`, `add(T)` och `get(int)`. Kontrollera också att `get(-1)` och `get(size())` kastar `IndexOutOfBoundsException`.
2. Implementera indexerad insättning, `set` och borttagning. Testa början, mitten och slutet, inklusive borttagning av enda elementet. Insättning accepterar index `size()`. Hämtning, ersättning och borttagning kräver ett befintligt index. `set` och `remove` returnerar det tidigare värdet.
3. Fyll i resten av gränssnittet. Matcha arraylistans beteende för `null`, dubbletter och sökning efter ett värde som saknas. Testa att iteration följer listordningen och att `next()` kastar `NoSuchElementException` när iteratorn är slut.
4. Byt implementation i demon på din gren. Verifiera samma utskrift, kör `mvn clean test` och beskriv i din PR hur arraylistan och den länkade listan skiljer sig för `get(i)` och insättning längst fram. Ange om din lista sparar en referens till sista noden när du analyserar insättning längst bak.

## När båda listorna fungerar

- Bygg en stack och en kö med små gränssnitt. Testa LIFO respektive FIFO och dokumentera hur en tom struktur hanteras. Jämför listimplementationerna som intern lagring.
- Öva därefter på linjär och binär sökning. Testa tom indata, träff först och sist samt utebliven träff. Ange sorterad indata som förvillkor för binär sökning och jämför antal jämförelser.
