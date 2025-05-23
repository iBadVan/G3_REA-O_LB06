package Ejercicio3;

import Actividad1.ExceptionIsEmpty;
import Actividad2.QueueLink;
import Actividad3.PriorityQueue;

public class PriorityQueueLinked<E> implements PriorityQueue<E, Integer> {
    private QueueLink<E>[] queues;
    private int levels;

    public PriorityQueueLinked(int levels) {
        this.levels = levels;
        queues = (QueueLink<E>[]) new QueueLink[levels];
        for (int i = 0; i < levels; i++) {
            queues[i] = new QueueLink<>();
        }
    }
    
    @Override
    public void enqueue(E x, Integer pr) {
        if (pr < 0 || pr >= levels) {
            throw new IllegalArgumentException("Prioridad fuera de rango");
        }
        queues[pr].enqueue(x);
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        for (int i = 0; i < levels; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("Cola de prioridad vacía");
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        for (int i = 0; i < levels; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].front();
            }
        }
        throw new ExceptionIsEmpty("Cola de prioridad vacía");
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        for (int i = levels - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                return queues[i].back();
            }
        }
        throw new ExceptionIsEmpty("Cola de prioridad vacía");
    }

    @Override
    public boolean isEmpty() {
        for (QueueLink<E> q : queues) {
            if (!q.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cola de prioridad:\n");
        for (int i = 0; i < levels; i++) {
            sb.append("Prioridad ").append(i).append(": ").append(queues[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
