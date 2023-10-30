// Priority Queues
// A FIFO data structure that serves elements with the highest priorities
// first before elements with lower priority.

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String args[]) {

        // PriorityQueue sorts the data in ascending order
        // if you want to sort descending then use the line
        // Queue<Double> queue = new PriorityQueue<>();
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        // To add data to queue we use offer method
        queue.offer(4.0);
        queue.offer(3.3);
        queue.offer(2.5);
        queue.offer(1.3);
        queue.offer(2.5);
        
        while(!queue.isEmpty())
            System.err.println(queue.poll());
        

        // Sorts it or prioritizes it in alphabetical order
        Queue<String> queueStrings = new PriorityQueue<>();
        queueStrings.offer("B");
        queueStrings.offer("A");
        queueStrings.offer("D");
        queueStrings.offer("C");

        while(!queueStrings.isEmpty()) 
            System.out.println(queueStrings.poll());
    }
}