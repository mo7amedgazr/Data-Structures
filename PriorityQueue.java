import java.util.Iterator;

public class PriorityQueue {

    public static void main(String[] args){
        java.util.PriorityQueue<String> pQueue = new java.util.PriorityQueue<>();
        pQueue.add("C++");
        pQueue.add("C");
        pQueue.add("Java");
        pQueue.add("Python");

        System.out.println("Head value using peek function:"
                + pQueue.peek());

        printPriorityQueue(pQueue);

        pQueue.poll();

        printPriorityQueue(pQueue);
    }

    private static void printPriorityQueue(java.util.PriorityQueue<String> pQueue) {
        System.out.println("The queue elements : ");
        Iterator iterator = pQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
