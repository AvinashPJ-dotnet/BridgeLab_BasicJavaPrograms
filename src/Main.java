import BasicProgram.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short ch=0;
        CoreJavaPrograms coreJavaPrograms = new CoreJavaPrograms();
        do {
            System.out.printf("\n1. FlopCoin\n2. Leap Year\n3. Power Of Two\n" +
                    "4. Harmonic\n6. Quotient & Reminder\n7. Swap Two Number\n" +
                    "8. Even and Odd\n0. Exit\n");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter choice: ");
            ch=in.nextShort();
            switch (ch){
                case 1: coreJavaPrograms.coinFlipCalculation();
                    break;
                case 2: coreJavaPrograms.checkLeapYear();
                    break;
                case 3: coreJavaPrograms.calculatePowerOfTwo(Integer.parseInt(args[0]));
                    break;
                case 4: coreJavaPrograms.calculateHarmonicNumber(10);
                    break;
                case 6: coreJavaPrograms.findQuotientAndReminder(10,3);
                    break;
                case 7: coreJavaPrograms.computeSwapTwoNumber(10,3);
                    break;
                case 8: coreJavaPrograms.checkNumberEvenOdd();
                    break;
                case 0:
                    System.out.println("Exiting..........");
                    break;
                default:
                    System.out.println("Please select valid choice");
                    break;
            }
        }while (ch!=0);
    }
}
