# Läsordning och projektplan

Ta ett issue i taget. Varje rad har gratis läsning som du kan använda direkt i koden. Börja gärna med ett eget exempel på papper innan du jämför med bokens exempel.

| Uppgift | Gratis läsning | Startpunkt i koden |
| --- | --- | --- |
| [#2 Kom igång med arraylistan](https://github.com/leoforsell/kth-data-structures-oop/issues/2) | [Dev.java om gränssnitt](https://dev.java/learn/interfaces/) och [generiska typer](https://dev.java/learn/generics/). [Open Data Structures §2.1](https://opendatastructures.org/ods-java/2_Array_Based_Lists.html) om dynamiska arrayer och [JUnit om assertions](https://docs.junit.org/5.10.2/user-guide/#writing-tests-assertions). | [CustomArrayListTest](../src/test/java/se/kth/prep/structures/CustomArrayListTest.java) |
| [#3 Enkellänkad lista](https://github.com/leoforsell/kth-data-structures-oop/issues/3) | [Open Data Structures §3.1](https://opendatastructures.org/ods-java/3_Linked_Lists.html) om noder och länkar. | [CustomLinkedList](../src/main/java/se/kth/prep/structures/CustomLinkedList.java) och [CustomList](../src/main/java/se/kth/prep/structures/CustomList.java) |
| [#4 Stack och kö](https://github.com/leoforsell/kth-data-structures-oop/issues/4) | [Open Data Structures §3.1](https://opendatastructures.org/ods-java/3_Linked_Lists.html) om LIFO och FIFO. | [ListStack](../src/main/java/se/kth/prep/structures/ListStack.java) och [ListQueue](../src/main/java/se/kth/prep/structures/ListQueue.java) |
| [#5 Linjär och binär sökning](https://github.com/leoforsell/kth-data-structures-oop/issues/5) | [Princeton Algorithms, Basic Programming Model](https://algs4.cs.princeton.edu/11model/), avsnittet Binary Search. [Open Data Structures §1.4](https://opendatastructures.org/ods-java/1_Introduction.html) om analys. | [SearchAlgorithms](../src/main/java/se/kth/prep/structures/SearchAlgorithms.java) |
| [#6 Insättningssortering och mergesort](https://github.com/leoforsell/kth-data-structures-oop/issues/6) | [Princeton om insättningssortering](https://algs4.cs.princeton.edu/21elementary/) och [Open Data Structures §11.1](https://opendatastructures.org/ods-java/11_Sorting_Algorithms.html) om mergesort. | [SortAlgorithms](../src/main/java/se/kth/prep/structures/SortAlgorithms.java) |

## Börja med den länkade listan efter första passet

1. Rita en tom lista och en lista med två noder. Markera `head`, `tail` och `size` före och efter ett anrop till `add(T)`. Skriv ett test som lägger in två element och läser tillbaka dem i ordning.
2. Lägg till indexerad insättning, ersättning och borttagning. Insättning accepterar index `size()`. Hämtning, ersättning och borttagning kräver ett befintligt index. `set` och `remove` returnerar det tidigare värdet. Kontrollera att `tail` pekar rätt efter borttagning av sista noden.
3. Fyll i sökning och iteration. Matcha arraylistans beteende för `null`, dubbletter och utebliven träff. Iterera direkt via nodernas länkar. Byt sedan till `CustomLinkedList` i demon på din arbetsgren och kontrollera att utskriften är densamma.

Kör ett enskilt test med exempelvis `mvn -Dtest=CustomArrayListTest test`. Kör hela sviten med `mvn clean test` innan du öppnar din PR. Lägg in `Closes #N` i beskrivningen när ändringen uppfyller uppgiftens kriterier. N är uppgiftens nummer.

## Vidare läsning

När de fem uppgifterna är klara kan du läsa [kapitel 5 om hashtabeller](https://opendatastructures.org/ods-java/5_Hash_Tables.html) och [kapitel 6 om binära träd](https://opendatastructures.org/ods-java/6_Binary_Trees.html) i *Open Data Structures*. Koppla tillbaka till kursmålen i [ID1021](https://www.kth.se/student/kurser/kurs/ID1021) och till designvalen kring gränssnitt och komposition i [IV1350](https://www.kth.se/student/kurser/kurs/IV1350).
