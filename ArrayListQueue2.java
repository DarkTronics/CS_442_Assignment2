package CS_442_Assignment2;
import java.util.ArrayList;

public class ArrayListQueue2<E> extends ArrayList<E> implements Queue<E> {

    public ArrayListQueue2() {
        super();
    }

    @Override
    public void enqueue(E e) {
            this.add(e);
    }     

    @Override
    public E dequeue() {
            return this.remove(0);

    }         

    @Override
    public boolean removeQueue(E e) {
        int indexofe = this.indexOf(e);
        if(indexofe >= 0) {
            this.remove(indexofe);
            return true;
        }
        else {
            return false;
        }
    }  

    @Override                                 
    public boolean isEmpty() {
        return this == null || super.isEmpty();
    }


}