package BasicProgram;

import java.util.Scanner;

public class LeapYear {
    public void checkLeapYear(){
        System.out.println("enter year to check leap year: ");
        Scanner in = new Scanner(System.in);
        int year=in.nextInt();
        if(year%400 == 0 || year % 4 ==0){
            System.out.println(year+" is a Leap year");
        }
        else if (year % 100 == 0){
            System.out.println(year+" is not a leap year");
        }
        else
            System.out.println(year+" is not a leap year");
    }
}
