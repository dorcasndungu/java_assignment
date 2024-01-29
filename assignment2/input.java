package assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Please enter an integer ");
            int intVal=scanner.nextInt();
            System.out.println("You have entered integer "+intVal+" and its square is "+intVal*intVal);
            System.out.println("Please enter a float ");
            float floatVal=scanner.nextFloat();
            System.out.println("You have entered float "+floatVal+" and its square is "+floatVal*floatVal);
            System.out.println("Please enter a boolean ");
            boolean boolVal=scanner.nextBoolean();
            System.out.println("You have entered boolean "+boolVal);
            System.out.println("Please enter a string ");
            String StringVal=scanner.next();
            System.out.println("You have entered String "+StringVal);
            System.out.println("Please enter a Short ");
            Short shortVal=scanner.nextShort();
            System.out.println("You have entered Short "+shortVal);
            System.out.println("Please enter a Byte ");
            Byte byteVal=scanner.nextByte();
            System.out.println("You have entered byte "+byteVal);
            System.out.println("Please enter a long ");
            long longVal=scanner.nextLong();
            System.out.println("You have entered long "+longVal);
        }
      catch(InputMismatchException e){
        System.out.println("Error: Invalid input. Please enter the correct data type.");
      }  
      finally{
        scanner.close();
      }
    }
    
}