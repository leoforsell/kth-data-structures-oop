package se.kth.prep.structures;

import java.util.Objects;

/** Först in, först ut. Uttag och peek på en tom struktur ska kasta NoSuchElementException. */
public class ListQueue<T> {
    private final CustomList<T> elements;

    /** Tar över en tom lista som intern lagring. Anroparen lämnar över ansvaret för listan. */
    public ListQueue(CustomList<T> elements) {
        this.elements = Objects.requireNonNull(elements);
        if (!elements.isEmpty()) {
            throw new IllegalArgumentException("Lagringen måste vara tom");
        }
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void enqueue(T element) {
        // TODO: Lägg till elementet på rätt plats för uttagsordningen.
        throw new UnsupportedOperationException("enqueue är inte implementerad");
    }

    public T dequeue() {
        // TODO: Ta bort och returnera nästa element.
        throw new UnsupportedOperationException("dequeue är inte implementerad");
    }

    public T peek() {
        // TODO: Returnera nästa element utan att ändra lagringen.
        throw new UnsupportedOperationException("peek är inte implementerad");
    }
}
