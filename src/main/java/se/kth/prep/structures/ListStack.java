package se.kth.prep.structures;

import java.util.Objects;

/** Sist in, först ut. Uttag och peek på en tom struktur ska kasta NoSuchElementException. */
public class ListStack<T> {
    private final CustomList<T> elements;

    /** Tar över en tom lista som intern lagring. Anroparen lämnar över ansvaret för listan. */
    public ListStack(CustomList<T> elements) {
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

    public void push(T element) {
        // TODO: Lägg till elementet på rätt plats för uttagsordningen.
        throw new UnsupportedOperationException("push är inte implementerad");
    }

    public T pop() {
        // TODO: Ta bort och returnera nästa element.
        throw new UnsupportedOperationException("pop är inte implementerad");
    }

    public T peek() {
        // TODO: Returnera nästa element utan att ändra lagringen.
        throw new UnsupportedOperationException("peek är inte implementerad");
    }
}
