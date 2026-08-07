class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletionin {

     
    // Delete first node
    // public Node deleNode(Node head) {
    //     if (head == null) {
    //         return null;
    //     }

    //     head = head.next;
    //     return head;
    // }

    // delete tail
    public Node delTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //delete kth element
    public Node delKth(Node head, int k){
        if(head == null) return head;
        if(k==1){
            Node temp = head;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            cnt++;
            if(cnt ==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp= temp.next;
        }
        return head;
    }
    //v=for value
 public Node delvalue(Node head, int el){
        if(head == null) return head;
        if(el==1){
            Node temp = head;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null){
        
            if(temp.data ==el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp= temp.next;
        }
        return head;
    }

    // Print Linked List
    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating Linked List
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Deletionin obj = new Deletionin();

        // System.out.println("Before Deletion:");
        // obj.printList(head);

        // Delete first node
        // head = obj.deleNode(head);

        // System.out.println("After Deletion:");
        // obj.printList(head);

        Deletionin obj = new Deletionin();

        // head = obj.delTail(head);
        // System.out.println("def");
        // obj.printList(head);

        // head = obj.delKth(head, 3);
        // System.out.println("k th :");
        // obj.printList(head);

         head = obj.delvalue(head, 40);
        System.out.println("k th :");
        obj.printList(head);

    }
}