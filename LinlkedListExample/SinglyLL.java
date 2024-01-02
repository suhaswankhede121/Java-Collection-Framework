import java.util.*;


// Node is class that defined a singly LL structure that
// contains data and next pointer
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// this is actual implementation of Singly LL 
// singly LL having head and tail and their length

class SinglyLL {
    Node head, tail;
    int length;

    SinglyLL() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
// this method helps to insert data from head 
// first newnode will insert and directly point to head 
    public void InsertAtHead(int data) {
        Node newNode = new Node(data);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    // this method helps to insert data from tail 
// tail is last node that next pointer is pointing newNode i.e this.tail.next-> newNode

    public void InsertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    // this method helps to delete the node from head
    // first assingn the head pointer to next this.head.next->this.tail
    // this.head=null;

    public Node DeleteAtHead() {
        Node temp = this.head;
        if (this.length == 0) {
            System.out.println("Nothing to delete");
            return null;
        }
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            temp.next = null;
        }
        this.length--;
        return temp;
    }

     // this method helps to delete the node from tail

    public Node DeleteAtTail() {
        if (this.length == 0) {
            System.out.println("Nothing to delete");
            return null;
        }
        Node temp = this.tail;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node current = this.head;
            while (current.next != this.tail) {
                current = current.next;
            }
            current.next = null;
            this.tail = current;
        }
        this.length--;
        return temp;
    }
    
    

    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.InsertAtHead(1);
        ll.InsertAtHead(4);
        ll.InsertAtTail(33);
        ll.InsertAtTail(12);
        ll.InsertAtHead(13);
        ll.InsertAtHead(43);
        ll.InsertAtTail(32);
        ll.InsertAtTail(18);
        ll.DeleteAtHead();
        ll.DeleteAtTail();
        ll.display();
    }
}
/* 
 I will be cover Doubly LL and Circular Linked LL later on 
 when i start DSA Basic 
 above code is for understading the actual implementation done internally
 how predefined methods helps to reduced code and realible for space and time complexity 

 ...Suhas
 */