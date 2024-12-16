import java.util.*;

class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListNew {
    Node head = null;

    // Method to insert the node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            // Traverse to the end of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        // Traverse and print each node's data
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListInsert {
    public static void main(String[] args) {
        LinkedListNew list = new LinkedListNew(); 
        // Create an instance of the LinkedListNew class
        Scanner sc = new Scanner(System.in);
        int value;

        while (true) {
            // Prompt user for input
            System.out.print("Enter value: ");
            if (sc.hasNextInt()) {
                value = sc.nextInt();

                // If the input value is negative, display the list and exit
                if (value < 0) {
                    System.out.println("Displaying the linked list: ");
                    list.display();
                    break;
                } else {
                    list.insert(value);
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); 
                // Clear the invalid input
            }
        }
        sc.close();
    }
}
