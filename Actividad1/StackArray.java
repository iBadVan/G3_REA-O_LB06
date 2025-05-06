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
    


}
