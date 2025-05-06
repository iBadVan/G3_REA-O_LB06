package Actividad1;

public class StackArray <E> implements Stack<E> {
    private E[] array;
    private int tope;

    public StackArray(int n){
        this.array=(E[])new Object[n];
        tope=-1;
    }

    @Override
    public void push(E x) {
        if (tope == array.length - 1) {
            throw new RuntimeException();
        }
        array[++tope] = x;
    }
    
    @Override
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return array[tope--];
    }

    @Override
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return array[tope];
    }
    
    public boolean isEmpty() {
        return this.tope == -1;
    }

    public boolean isFull() {
        return tope == array.length - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Pila vacía";
        
        StringBuilder sb = new StringBuilder();
        for (int i = tope; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) sb.append(" -> ");
        }
        return sb.toString();
    }

}
