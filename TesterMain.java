package CS_442_Assignment2;

public class TesterMain {
    public static void main(String[] args) {
        // ArrayListQueue2<Integer> queue21 = null;
        // queue21.enqueue(69);
        ArrayListQueue2<Integer> queue21 = new ArrayListQueue2<>();
        System.out.println("equeue 69"); queue21.enqueue(69);
        System.out.println("Did it dequeue? " + queue21.dequeue());
        //System.out.println("Did it dequeue? " + queue21.dequeue());
        System.out.println("equeue 69"); queue21.enqueue(69);
        System.out.println("Did it removeQueue 69? " + queue21.removeQueue(69));
        System.out.println("Did it removeQueue 69? " + queue21.removeQueue(69));
        System.out.println("Is queue empty? " + queue21.isEmpty());
        System.out.println("equeue 69"); queue21.enqueue(69);
        System.out.println("Is queue empty? " + queue21.isEmpty());
    }
}
