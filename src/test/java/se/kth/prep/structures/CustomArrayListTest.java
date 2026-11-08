package se.kth.prep.structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    private CustomList<String> list;

    @BeforeEach
    void setUp() {
        list = new CustomArrayList<>();
    }

    @Test
    @DisplayName("Ska starta tom med storlek 0")
    void testInitialState() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    @DisplayName("Ska lägga till och hämta element i rätt ordning")
    void testAddAndGet() {
        list.add("KTH");
        list.add("Informationsteknik");

        assertEquals(2, list.size());
        assertEquals("KTH", list.get(0));
        assertEquals("Informationsteknik", list.get(1));
        assertFalse(list.isEmpty());
    }

    @Test
    @DisplayName("Ska automatiskt expandera arrayen när kapaciteten överskrids")
    void testDynamicResizing() {
        CustomArrayList<Integer> intList = new CustomArrayList<>(2);
        for (int i = 0; i < 20; i++) {
            intList.add(i);
        }

        assertEquals(20, intList.size());
        assertTrue(intList.capacity() >= 20);
        for (int i = 0; i < 20; i++) {
            assertEquals(i, intList.get(i));
        }
    }

    @Test
    @DisplayName("Ska kunna sätta in ett element på specifikt index")
    void testInsertAtIndex() {
        list.add("A");
        list.add("C");
        list.add(1, "B");

        assertEquals(3, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    @DisplayName("Ska ta bort element och skifta kvarvarande element korrekt")
    void testRemove() {
        list.add("X");
        list.add("Y");
        list.add("Z");

        String removed = list.remove(1);

        assertEquals("Y", removed);
        assertEquals(2, list.size());
        assertEquals("X", list.get(0));
        assertEquals("Z", list.get(1));
    }

    @Test
    @DisplayName("Ska kasta IndexOutOfBoundsException vid ogiltigt index")
    void testIndexOutOfBounds() {
        list.add("Test");

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2));
    }

    @Test
    @DisplayName("Ska kunna iterera med foreach-loop")
    void testIterator() {
        list.add("Ett");
        list.add("Två");
        list.add("Tre");

        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append(item).append(" ");
        }

        assertEquals("Ett Två Tre ", sb.toString());
    }

    @Test
    @DisplayName("Ska kunna lägga till första elementet när startkapaciteten är 0")
    void testAddFromZeroCapacity(){
        CustomArrayList<String> emptyList = new CustomArrayList<>(0);
        emptyList.add("A");
        assertEquals(1, emptyList.size());
        assertEquals("A",emptyList.get(0));
    }
}