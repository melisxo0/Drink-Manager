package at.campus02.bsd;

import java.util.NoSuchElementException;

/**
 * A generic queue interface that can handle any type of object.
 * @param <T> the type of elements held in this queue
 */
public interface IQueue<T> {

    /**
     * Adds an object to the queue.
     * @param obj the element to add to the queue
     * @return true if the addition is successful, false if the queue is full
     */
    public abstract boolean offer(T obj);

    /**
     * Retrieves and removes the first element of the queue.
     * @return the first element of the queue, or null if the queue is empty
     */
    public abstract T poll();

    /**
     * Retrieves and removes the first element of the queue.
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract T remove();

    /**
     * Retrieves, but does not remove, the first element of the queue.
     * @return the first element of the queue, or null if the queue is empty
     */
    public abstract T peek();

    /**
     * Retrieves, but does not remove, the first element of the queue.
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract T element();
}