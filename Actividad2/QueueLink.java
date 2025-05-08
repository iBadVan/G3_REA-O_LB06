package Actividad2;

import Actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void enqueue(E x) {
        Node<E> aux = new Node<>(x);
        if (this.isEmpty()) {
            this.first = aux;
        } else {
            this.last.setNext(aux);
        }
        this.last = aux;
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        E data = this.first.getData();
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null;
        }
        return data;
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return this.first.getData();
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return this.last.getData();
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Cola vacía";

        StringBuilder sb = new StringBuilder();
        Node<E> current = this.first;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }
        return sb.toString();
    }
        
}
