package Ejercicio2;

import Actividad1.ExceptionIsEmpty;

public class QueueArray<E> implements Queue<E> {
    private E[] array;
    private int first;
    private int last;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.array = (E[]) new Object[capacity];
        this.first = 0;
        this.last = -1;
        this.size = 0;
    }

    @Override
    public void enqueue(E x) {
        if (size == capacity) {
            throw new RuntimeException("La cola está llena.");
        }
        last = (last + 1) % capacity;
        array[last] = x;
        size++;
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede eliminar de una cola vacía");
        }
        E item = array[first];
        first = (first + 1) % capacity;
        size--;
        return item;
    }
    
}   
