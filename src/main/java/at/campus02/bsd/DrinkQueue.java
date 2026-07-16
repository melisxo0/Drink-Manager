package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue<Drink> {

    private List<Drink> elements = new ArrayList<>();
    private int maxSize;

    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    // Melisa will do these two
    @Override
    public boolean offer(Drink obj) {
        return false; // placeholder
    }

    @Override
    public Drink poll() {
        return null; // placeholder
    }

    // Viktoria will do these three
    @Override
    public Drink remove() {
        Drink element = poll();
        if (element == null) {
            throw new NoSuchElementException("There are no elements left in the queue");
        }
        return element;
    }

    @Override
    public Drink peek() {
        if (!elements.isEmpty()) {
            return elements.get(0);
        }
        return null;
    }

    @Override
    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("There are no elements left in the queue");
        }
        return element;
    }
}