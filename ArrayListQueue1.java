package CS_442_Assignment2;
import java.util.ArrayList;

public class ArrayListQueue1<E> implements Queue<E> {


    private ArrayList<E> elements;

    public ArrayListQueue1() {
        this.elements = new ArrayList<>();  // Initialize the list
    }

    @Override 
    public void enqueue(E e)
    {
        elements.add(e);
    }   
    
    @Override 
    public E dequeue() {
        return elements.remove(0);
    }

    @Override
    public boolean removeQueue(E e) {
        int indexofe = elements.indexOf(e);
        if(indexofe >= 0) {
            elements.remove(indexofe);
            return true;
        }
        else {
            return false;
        }
    }  

    @Override                                 
    public boolean isEmpty() {
        return elements == null || elements.isEmpty();
    }
}
