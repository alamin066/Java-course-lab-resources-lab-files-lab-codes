import java.util.*;

public class BankQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("Dave");

        System.out.println("Queue before serving: " + queue);

        String servedCustomer = queue.poll();
        System.out.println("Serving customer: " + servedCustomer);

        System.out.println("Queue after serving: " + queue);

        String nextCustomer = queue.peek();
        System.out.println("Next customer to be served: " + nextCustomer);

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer("Eve");
        priorityQueue.offer("Frank");
        priorityQueue.offer("Grace");

        System.out.println("Priority queue: " + priorityQueue);
    }
}
