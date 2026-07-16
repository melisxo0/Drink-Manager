package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation for managing Drink objects.
 * Implements the generic IQueue interface.
 */
public class DrinkQueue implements IQueue<Drink> {

    /**
     * The internal list holding the elements of the queue.
     */
    private List<Drink> elements = new ArrayList<>();

    /**
     * The maximum number of elements this queue can store.
     */
    private int maxSize;

    /**
     * Constructor to create a new DrinkQueue with a specified maximum capacity.
     *
     * @param maxSize the maximum size of the queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds a Drink to the back of the queue if space is available.
     *
     * @param obj the Drink to add
     * @return true if added successfully, false if the queue is already full
     */
    @Override
    public boolean offer(Drink obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        }
        return false;
    }

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    @Override
    public Drink poll() {
        Drink element = peek();

        if (!elements.isEmpty()) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * Retrieves and removes the head of this queue. Throws exception if empty.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public Drink remove() {
        Drink element = poll();
        if (element == null) {
            throw new NoSuchElementException("There are no elements left in the queue");
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    @Override
    public Drink peek() {
        if (!elements.isEmpty()) {
            return elements.get(0);
        }
        return null;
    }

    /**
     * Retrieves, but does not remove, the head of this queue. Throws exception if empty.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("There are no elements left in the queue");
        }
        return element;
    }
}