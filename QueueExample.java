import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> queueList = new LinkedList<>();

        // Adding new elements to the Queue
        queueList.add("Mohamed");
        queueList.add("Ahmed");
        queueList.add("AbdElrahman");
        queueList.add("Ali");

        System.out.println("queueList : " + queueList);

        // Removing an element from the Queue 
        String name = queueList.remove();

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = queueList.poll();
    }
}
