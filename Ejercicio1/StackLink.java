package Ejercicio1;

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

    
    
}
