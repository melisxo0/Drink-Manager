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
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public Drink poll() {
        Drink element = peek();
        if (!elements.isEmpty()) {
            elements.remove(0);
        }
        return element;
    }

    // Viktoria will do these three
    @Override
    public Drink remove() {
        return null; // placeholder
    }

    @Override
    public Drink peek() {
        return null; // placeholder
    }

    @Override
    public Drink element() {
        return null; // placeholder
    }
}