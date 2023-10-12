// Queue Data Structure
// FIFO data structure, First-In, First-Out
// A collection designed for holding elements prior to processing 
// Linear DS. In java Queue is not class therefore it cannot be 
// instantiated, Queue is an interface. In order to use Queue
// we create either a linked list or priority queue.
package DataStructures;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDataStructure {
  public static void main(String[] args){
    Queue<String> queue = new LinkedList<String>();
    // Queue has 6 methods
    // 3 methods are 
    // add()
    // remove()
    // element()

    // preferred 3 methods are 
    // offer() - enque
    // poll() - dequeu
    // peek() - lets you peek at the first element

    // Additional Methdos
    // queue.isEmpty() -- returns boolean value, based on if the queue is empty.
    // queue.contains("name of the search")  -- returns a boolean, if queue contains "search".

    queue.offer("Quaid");
    queue.offer("Leo");
    queue.offer("Leonidas");

    // queue.poll();
    // queue.poll();
    System.out.println(queue.peek());
    System.out.println(queue);
    System.out.println(queue.contains("Quaid"));
  }
}