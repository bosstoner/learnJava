import java.io.*;
import java.util.*;

public class Solution {
    // Define your instance variables for stack and queue
    private Stack<Character> stack = new Stack<>();
    private Queue<Character> queue = new LinkedList<>();

    // Method to push a character onto the stack
    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    // Method to enqueue a character into the queue
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // Method to pop and return the top character from the stack
    public char popCharacter() {
        return stack.pop();
    }

    // Method to dequeue and return the first character from the queue
    public char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is " +
                           ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}

