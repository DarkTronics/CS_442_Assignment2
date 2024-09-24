package CS_442_Assignment2;

import java.util.ArrayList;

public class TesterMain {
    public static void enqueueTestArrayListQueue2(ArrayListQueue2<Integer> X, int num) {
        try {
            X.enqueue(num);
            System.err.println("Enqueue " + num);
        } catch (Exception e) {
            System.out.println("Null exception for enqueue");
        }
    }

    public static void dequeueTestArrayListQueue2(ArrayListQueue2<Integer> X) {
        try {
            int num = X.dequeue();
            System.err.println("Dequeue " + num);
        } catch (Exception e) {
            System.out.println("Null exception for dequeue or empty exception");
        }
    }

    public static void enqueueTestArrayListQueue1(ArrayListQueue1<Integer> queue1, int element) {
        try {
            queue1.enqueue(element);
            System.out.println("Enqueue " + element);
        } catch (Exception e) {
            System.out.println("Null exception for enqueue");
        }
    }

    public static void dequeueTestArrayListQueue1(ArrayListQueue1<Integer> X) {
        try {
            X.dequeue();
            System.out.println("Succesfully dequeue");
        } catch (Exception e) {
            System.out.println("Null exception or empty exception for dequeue");
        }
    }

    public static void main(String[] args) {

        System.out.println("##########Test for ArrayListQueue1#############");
        ArrayListQueue1<Integer> alq1 = new ArrayListQueue1<>();
        System.out.println("enqueue 69");
        enqueueTestArrayListQueue1(alq1,69);
        alq1 = null;
        enqueueTestArrayListQueue1(alq1,69);
        alq1 = new ArrayListQueue1<>();
        enqueueTestArrayListQueue1(alq1,69);
        dequeueTestArrayListQueue1(alq1);
        dequeueTestArrayListQueue1(alq1);
        alq1 = null;
        dequeueTestArrayListQueue1(alq1);
        alq1 = new ArrayListQueue1<>();
        enqueueTestArrayListQueue1(alq1,69);
        enqueueTestArrayListQueue1(alq1,59);
        dequeueTestArrayListQueue1(alq1);
        dequeueTestArrayListQueue1(alq1);
        dequeueTestArrayListQueue1(alq1);
        System.out.println("Is alq1 empty? " +  alq1.isEmpty());

        // dequeue does not catch a null or empty queue
        // System.out.println("enqueue 69");
        // enqueueTestArrayListQueue1(alq1,69);
        System.out.println("Did it removeQueue 69? " + alq1.removeQueue(69));
        System.out.println("Is queue empty? " + alq1.isEmpty());
        // System.out.println("Is queue empty? " + alq1.isEmpty());
        // System.out.println("enqueue 69");
        enqueueTestArrayListQueue1(alq1,69);
        System.out.println("Did it removeQueue 69? " + alq1.removeQueue(69));
        System.out.println("Is queue empty? " + alq1.isEmpty());
        System.out.println("###############################################");

        System.out.println("##########Test for ArrayListQueue2#############");
        ArrayListQueue2<Integer> queue21 = null;
        enqueueTestArrayListQueue2(queue21, 69);
        queue21 = new ArrayListQueue2<>();
        enqueueTestArrayListQueue2(queue21, 69);

        dequeueTestArrayListQueue2(queue21);
        dequeueTestArrayListQueue2(queue21);
        enqueueTestArrayListQueue2(queue21, 69);
        System.out.println("Did it removeQueue 69? " + queue21.removeQueue(69));
        System.out.println("Did it removeQueue 69? " + queue21.removeQueue(69));
        System.out.println("Is queue empty? " + queue21.isEmpty());
        System.out.println("enqueue 69");
        enqueueTestArrayListQueue2(queue21, 69);
        System.out.println("Is queue empty? " + queue21.isEmpty());
        System.out.println("###############################################");
    }
}
