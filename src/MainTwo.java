import BasicProgram.CoreJavaPrograms;
import FunctionProgram.JavaFunctionalProgram;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        short ch=0;
        JavaFunctionalProgram javaFunctionalProgram = new JavaFunctionalProgram();
        do {
            System.out.printf("\n1. Two Dimensional Array\n2. Distance\n3. Quadratic Eq\n5. Wind Chill\n0. Exit\n");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter choice: ");
            ch=in.nextShort();
            switch (ch){
                case 1: javaFunctionalProgram.TwoDimentionalArray();
                    break;
                case 2: javaFunctionalProgram.calculateDistance();
                    break;
                case 3: javaFunctionalProgram.quadraticEquation();
                    break;
                case 5: javaFunctionalProgram.checkWindChill(45.0,44.0);
                    break;

                case 0:
                    System.out.println("Exiting..........");
                    break;
                default:
                    System.out.println("Please select valid choice..");
                    break;
            }
        }while (ch!=0);

    }
}
