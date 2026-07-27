// Node class for Linked List
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Solution class containing search function
class Solution {
    // Function to search for a value in LL
    public boolean SearchInLL(Node head, int key) {
        // Pointer to traverse the list
        Node current = head;

        // Traverse until end
        while (current != null) {
            // Check if current node matches key
            if (current.data == key) {
                // Return true if found
                return true;
            }
            // Move to next node
            current = current.next;
        }

        // Return false if not found
        return false;
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        // Creating linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Solution obj = new Solution();

        // Search for value
        if (obj.searchValue(head, 20))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
