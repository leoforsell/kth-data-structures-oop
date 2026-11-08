package se.kth.prep.structures;

import java.util.Iterator;

public class CustomLinkedList<T> implements CustomList<T> {
    private static final class Node<T> {
        private T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }

    // I en tom lista är både head och tail null.
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    @Override
    public void add(T element) {
        // TODO: Lägg till sist. Uppdatera head, tail och size.
        throw new UnsupportedOperationException("add är inte implementerad");
    }

    @Override
    public void add(int index, T element) {
        // TODO: Tillåt index från 0 till och med size.
        throw new UnsupportedOperationException("add är inte implementerad");
    }

    @Override
    public T get(int index) {
        // TODO: Gå till noden vid index. Kräv 0 <= index < size.
        throw new UnsupportedOperationException("get är inte implementerad");
    }

    @Override
    public T set(int index, T element) {
        // TODO: Byt nodens värde och returnera det tidigare värdet.
        throw new UnsupportedOperationException("set är inte implementerad");
    }

    @Override
    public T remove(int index) {
        // TODO: Länka förbi noden och returnera det borttagna värdet.
        throw new UnsupportedOperationException("remove är inte implementerad");
    }

    @Override
    public int indexOf(T element) {
        // TODO: Hitta första matchningen med Objects.equals. Returnera -1 om värdet saknas.
        throw new UnsupportedOperationException("indexOf är inte implementerad");
    }

    @Override
    public Iterator<T> iterator() {
        // TODO: Gå igenom noderna i listordning. Kasta NoSuchElementException när nästa nod saknas.
        throw new UnsupportedOperationException("iterator är inte implementerad");
    }
}
