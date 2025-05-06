package Actividad1;

public class StackArray <E> implements Stack<E> {
    private E[] array;
    private int tope;

    public StackArray(int n){
        this.array=(E[])new Object[n];
        tope=-1;

    }
    
}
