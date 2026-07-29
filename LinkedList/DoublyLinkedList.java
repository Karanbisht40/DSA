class Node {
    int data;
    Node Next;
    Node Prev;

    Node(int data1, Node Next1, Node Prev1) {
        data = data1;
        Next = Next1;
        Prev = Prev1;
    }

    Node(int data1) {
        data = data1;
        Next = null;
        Prev = null;
    }
}

public class DoublyLinkedList {

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.Next;
        }
        System.out.println();
    }

    // convert array to dll
    static Node convertLLTodll(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.Next = temp;
            prev = temp;
        }

        return head;
    }

    // Delete the head
    static Node DeleteHead(Node head) {
        if (head == null || head.Next == null) {
            return null;
        }
        Node prev = head;
        head = head.Next;

        head.Prev = null;
        prev.Next = null;

        return head;
    }

    // delete tail
    static Node DeleteTail(Node head) {
        if (head == null || head.Next == null) {
            return null;
        }
        Node tail = head;
        while (tail.Next != null) {
            tail = tail.Next;
        }
        Node newTail = tail.Prev;
        newTail.Next = null;
        tail.Prev = null;

        return head;
    }

    // delete the kth elemnt
    static Node deleteKthel(Node head, int k) {
        if (head == null)
            return null;

        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.Next;
        }
        Node Prevel = temp.Prev;
        Node Front = temp.Next;

        if (Prevel == null && Front == null) {
            return null;
        } else if (Prevel == null) {
            return DeleteHead(head);
        } else if (Front == null) {
            return DeleteTail(head);
        }
        Prevel.Next = Front;
        Front.Prev = Prevel;

        temp.Next = null;
        temp.Prev = null;

        return head;

    }

    // insertion
    // inset in head
    static Node insertAtHead(Node head, int val) {
        if (head == null)
            return null;
        Node newNode = new Node(val, head, null);
        head.Prev = newNode;

        return newNode;
    }

    // at tail
    // before tail
    static Node insertAtTail(Node head, int val) {
        if (head.Next == null)
            return insertAtTail(head, val);
        Node tail = head;
        while (tail.Next != null) {
            tail = tail.Next;
        }
        // Node Prevel = tail.Prev;
        // Node NewNode = new Node(val, tail, Prevel);
        // Prevel.Next = NewNode;
        // tail.Prev = NewNode;
        // return head;

        // after tail
        Node NewNode = new Node(val, null, tail);
        tail.Next = NewNode;
        return head;

    }


    static Node insertAtKth(Node head,int k, int val){
        if(k==1) return insertAtHead(head, val);

        Node temp = head;
        int cnt=0;
        while (temp != null) {
            cnt ++;
            if(cnt ==k) break;
            temp = temp.Next;
        }
        Node prevEl = temp.Prev;
        Node NewNode = new Node(val, temp, prevEl);
        prevEl.Next = NewNode;
        temp.Prev = NewNode;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };

        Node head = convertLLTodll(arr);

        // head = DeleteHead(head);
        // print(head);

        // head = DeleteTail(head);
        // print(head);

        // head = deleteKthel(head, 4);
        // print(head);
        // head = insertAtHead(head, 10);
        // print(head);
        // head = insertAtTail(head, 50);
        // print(head);
          head = insertAtKth(head, 3,25);
        print(head);
        
    }
}