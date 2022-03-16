import BasicProgram.FlipCoin;
import BasicProgram.LeapYear;
import BasicProgram.PowerOfTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short ch=0;
        do {
            System.out.printf("1. FlopCoin\n2. Leap Year\n3. Power Of Two\n0. Exit\n");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter choice: ");
            ch=in.nextShort();
            switch (ch){
                case 1: FlipCoin flipCoin = new FlipCoin();
                        flipCoin.coinFlipCalculation();
                        break;
                case 2: LeapYear leapYear = new LeapYear();
                    leapYear.checkLeapYear();
                    break;
                case 3: PowerOfTwo powerOfTwo = new PowerOfTwo();
                    powerOfTwo.calculatePowerOfTwo(Integer.parseInt(args[0]));
                    break;
                default:break;
            }
        }while (ch!=0);


    }
}
