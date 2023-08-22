import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
         System.out.println(
                "Name: " + lastName + ", " + firstName 
            +     "\nID: " + idNumber); 
    }
     
}

class Student extends Person{
    private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    /*    
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    int i;
    int summ = 0;
    int sum;
    public char calculate(int[] testScores) {
        for (i =0; i < testScores.length; i++) {
            summ = summ + testScores[i];
        }
        
        sum = summ / testScores.length;
        
        if (sum >= 90 && sum <= 100) {
        return 'O';
        } else if (sum >= 80 && sum < 90) {
        return 'E';
        } else if (sum >= 70 && sum < 80) {
        return 'A';
        } else if (sum >= 55 && sum < 70) {
        return 'P';
        } else if (sum >= 40 && sum < 55) {
        return 'D';
        } else {
        return 'T';
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int identification = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, identification, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate(testScores) );
    }
}
