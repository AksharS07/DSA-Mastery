import java.util.*;

public class Day13_QueueAndStack {
    public static void main(String[] args) {
        // Queue (FIFO)
        Queue<String> fifo = new LinkedList<>();
        fifo.offer("First");
        fifo.offer("Second");
        fifo.offer("Third");
        while(!fifo.isEmpty()) {
            System.out.println(fifo.poll());
        }

        // Stack (LIFO)
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        while(!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }
    }
}
