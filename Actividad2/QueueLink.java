package Actividad2;

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
        
}
