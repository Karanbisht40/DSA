class Insertion {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public Node insertAtHead(Node head, int value) {

    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;
    return head;
}

public Node insertAtTail(Node head, int value){
    Node newNode = new Node(value);

    if(head == null)
         return newNode;

    Node temp = head;

    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
    return head;
}

public Node insertatKthPosition(Node head, int k, int val){
    Node newNode = new Node(val);

    if (k ==1) {
        newNode.next = head;
        return newNode;
    }
    Node temp = head;

    //move to k-1 th node
for(int i =1 ; i<k-1 && temp != null; i++){
    temp = temp.next;
}

   //invalid position
   if(temp ==null)
    return head;

    newNode.next = temp.next;

    temp.next = newNode;

    return head;
}


public Node insertBeforeValue(Node head, int target, int value) {

    Node newNode = new Node(value);

    // Empty list
    if (head == null) {
        return null;
    }

    // Insert before head
    if (head.data == target) {
        newNode.next = head;
        return newNode;
    }

    Node temp = head;

    while (temp.next != null && temp.next.data != target) {
        temp = temp.next;
    }

    // Target not found
    if (temp.next == null) {
        return head;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
}