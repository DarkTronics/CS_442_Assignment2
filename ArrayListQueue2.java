package CS_442_Assignment2;
import java.util.ArrayList;

public class ArrayListQueue2<E> extends ArrayList<E> implements Queue<E> {

    public ArrayListQueue2() {
        super();
    }

    @Override
    public void enqueue(E e) {
        try {
            this.add(e);
        }
        catch(Exception error){
            System.out.println("Error queue is null");
        }
    }     

    @Override
    public E dequeue() {
        try {
            return this.remove(0);
        } catch (Exception e) {
            System.out.println("Can not dequeue because queue is null or empty");
            throw e;
        }

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