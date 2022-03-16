import BasicProgram.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short ch=0;
        do {
            System.out.printf("1. FlopCoin\n2. Leap Year\n3. Power Of Two\n4. Harmonic\n6. Quotient & Reminder\n0. Exit\n");
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
                case 4: HarmonicNumber harmonicNumber = new HarmonicNumber();
                    harmonicNumber.calculateHarmonicNumber(10);
                    break;
                case 6: QuotientRemainder quotientReminder = new QuotientRemainder();
                    quotientReminder.findQuotientAndReminder(10,3);
                    break;

                default:break;
            }
        }while (ch!=0);


    }
}
