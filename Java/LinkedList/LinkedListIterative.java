package Java.LinkedList;
/*
 * Linked List Iterative
 * - Node
 * -- Value
 * -- NextNode
 * - Linked List
 * -- Add
 * -- Remove
 * -- FindAtIndex
 * -- IndexOf
 * -- Display
 * -- Size
 */

public class LinkedListIterative {
    public Node head;

    public LinkedListIterative() {}
    public LinkedListIterative(int startingValue) {
        head = new Node(startingValue);
    }

    public void add(int addMe) {
        /*
         * add the first thing
         * add the second thing
         * add everything else
         */
        if(head == null) {
            head = new Node(addMe);
            return;
        }
        
    }
}