import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    // Method to insert a new node at the end of the linked list
    public static Node insert(Node head, int data) {
        if (head == null) {
            // If the list is empty, create a new node and make it the head
            head = new Node(data);
        } else {
            // Traverse the list to find the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Create a new node and attach it to the last node
            current.next = new Node(data);
        }
        return head; // Return the reference to the head of the updated list
    }

    // Method to display the linked list
    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}

