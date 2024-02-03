
import java.util.Scanner;
import java.util.InputMismatchException;
public class grades {
    // Write program that ask the use to enter marks, display the grade. Use a while
    // loop so user can repeat entering grade ten times
    // The university uses the following grading scheme
    // E 0-39
    // D 40-49
    // C 50-59
    // B 60-69
    // A 70-100
    public static void main(String[] args) {
        try{

            int i = 1;
            while (i <= 10) {
                System.out.println("Please enter marks to determine the grade: ");
                Scanner scanner = new Scanner(System.in);
                int marks = scanner.nextInt();
                if (marks >= 70 && marks <= 100) {
                    System.out.println("Grade A");
                } else if (marks >= 60 && marks <= 69) {
                    System.out.println("Grade B");
                } else if (marks >= 50 && marks <= 59) {
                    System.out.println("Grade C");
                } else if (marks >= 40 && marks <= 49) {
                    System.out.println("Grade D");
                } else if (marks >= 0 && marks <= 39) {
                    System.out.println("Grade E");
                } else {
                    System.out.println("Please enter valid marks");
                }
                System.out.println(10-i +" remaining marks");
                i++;
            }
            System.out.println("Thank you for your patience.");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter valid marks");
        }
    
    }

}
