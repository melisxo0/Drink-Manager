
// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation for managing String objects.
 * Implements the generic IQueue interface.
 */
public class StringQueue implements IQueue<String> {

    /**
     * The internal list holding the String elements.
     */
    private List<String> elements = new ArrayList<String>();

    /**
     * The maximum size of the queue.
     */
    private int maxSize = 5;

    /**
     * Constructor to create a new StringQueue with a specified capacity.
     *
     * @param maxsize the maximum size of the queue
     */
    public StringQueue(int maxsize) {
        this.maxSize = maxsize;
    }

    /**
     * Adds a String to the back of the queue if capacity has not been reached.
     *
     * @param obj the String to add
     * @return true if added successfully, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        }
        return false;
    }

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head String of the queue, or null if the queue is empty
     */
    @Override
    public String poll() {
        String element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * Retrieves and removes the head of this queue. Throws exception if empty.
     *
     * @return the head String of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return the head String of the queue, or null if the queue is empty
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the head of this queue. Throws exception if empty.
     *
     * @return the head String of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }
}
