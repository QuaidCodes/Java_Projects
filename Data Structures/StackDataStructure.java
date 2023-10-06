
// Stack data structure
// Stack is a LIFO data Structure means Last In First Out, stores objects in a
// vertical tower, linear DS
// with stack we can run out of memory because it is dynamic, compiled at
// runtime and is stored on the HEAP.
// Stacks are used in browser forward/backward button, undo/redo in text
// editors, backtacking algorithms
// maze, and file directories.
package DataStructures;

import java.util.Stack;

public class StackDataStructure {
  public static void main(String[] args) {

    Stack<String> stack = new Stack<String>();

    // Stack has five unique methods
    // stack.push() - inserts an item on top of the stack
    // stack.pop() - remove and returns item on top of the stack
    // stack.peek() - returns the item on top of stack
    // stack.empty() - checks if the stack is empty
    // stack.search() - checks the stack for a certain item and return its
    // index top of the stack is 1, if search is
    // unable to find the item it will return -1.

    stack.push("Game of thrones");
    stack.push("The Witcher");
    stack.push("Kengan Ashura");
    stack.push("Baki Hanma");

    if (!stack.empty()) {
      Stack<String> anime = new Stack<String>();
      anime.push(stack.pop());
      anime.push(stack.pop());

      System.out.println("Anime " + anime);
      System.out.println("Shows " + stack);
    }

    System.out.println(stack.peek());
    System.out.println(stack.search("Game of thrones"));
  }
}
