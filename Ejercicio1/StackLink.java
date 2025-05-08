package Ejercicio1;

import Actividad1.ExceptionIsEmpty;
import Actividad1.Stack;

public class StackLink<E> implements Stack<E>{
    private Node<E> top;

    public StackLink() {
        this.top = null;
    }

    @Override
    public void push(E x) {
        Node<E> newNode = new Node<>(x);
        newNode.setNext(top);
        top = newNode;
    }

    @Override
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        E data = top.getData();
        top = top.getNext();
        return data;
    }

    @Override
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    
}
