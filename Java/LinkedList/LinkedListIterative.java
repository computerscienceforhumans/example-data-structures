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
        if(firstNodeIsNull()) {
            head = new Node(addMe);
            return;
        }

        if(secondNodeIsNull()) {
            head.next = new Node(addMe);
            return;
        }
        
        Node currentNode = head.next;
        while(notAtEndOfList(currentNode)) {
            currentNode = currentNode.next;
        }
        
        currentNode.next = new Node(addMe);
    }

    private boolean notAtEndOfList(Node currentNode) {
        return currentNode.next != null;
    }

    private boolean secondNodeIsNull() {
        return head.next == null;
    }
    
    private boolean firstNodeIsNull() {
        return head == null;
    }
}