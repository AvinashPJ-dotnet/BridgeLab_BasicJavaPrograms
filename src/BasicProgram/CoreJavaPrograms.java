package BasicProgram;

import java.util.Scanner;

public class CoreJavaPrograms {
    //Program to calculate flip sides count percentage
    public void coinFlipCalculation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of time want to flip a coin: ");
        int totalTimes = in.nextInt();
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < totalTimes; i++) {
            double coinFlip = Math.random();
            if (coinFlip > 0.5)
                headCount++;
            else
                tailCount++;

        }
        System.out.println("total head and tail count: " + headCount + "&" + tailCount);
        System.out.println("percentage of head: " + calculationPercentage(headCount, totalTimes) + "%");
        System.out.println("percentage of Tail: " + calculationPercentage(tailCount, totalTimes) + "%");

    }

    public double calculationPercentage(int totalCount, double totalTimes) {
        double value = (totalCount / totalTimes);
        value = value * 100;
        return value;
    }

    //Program to check year is leap or not
    public void checkLeapYear() {
        System.out.println("enter year to check leap year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + " is a Leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else
            System.out.println(year + " is not a leap year");
    }

    public void calculatePowerOfTwo(int num) {
        if (num >= 0 && num <= 31) {
            for (int i = 1; i <= num; i++) {
                int value = (int) Math.pow(2, i);
                System.out.println("2 pow " + i + ": " + value);
            }
        } else {
            System.out.println("number should not greater then 31 and less then 0");
            System.exit(0);
        }

    }

    public void calculateHarmonicNumber(int number) {
        float harmonicNumber = 0.0f;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                harmonicNumber += (1 / (double) i);
            }
        }
        System.out.println("Harmonic number is: " + harmonicNumber);
    }

    public void findPrimeFactors(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= n; i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)//check remainder is grater than zero
            System.out.print(n);
    }

    public void findQuotientAndReminder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public void computeSwapTwoNumber(int first, int second) {
        System.out.println("--Before swap--");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        // swap two number using third variable called temp
        int temp = first;
        first = second;
        second = temp;
        System.out.println("--After swap--");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }

    public void checkNumberEvenOdd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String evenOdd = (num % 2 == 0) ? "even " : "odd";//using ternary operator to check condition

        System.out.println(num + " is " + evenOdd + " number");
    }

    //check alphabet is vowel or consonant
    public void checkAlphabetVowelOrConsonant() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Alphabet: ");
        char ch = input.next().charAt(0);
        char newChar=Character.toUpperCase(ch);
        String returnValue = (newChar == 'A' || newChar == 'E' || newChar == 'I' || newChar == 'O' || newChar == 'U') ? "is vowel " : "is consonant ";
        System.out.println(ch + " " + returnValue);
    }

    public void checkLargestNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int numOne = input.nextInt();
        System.out.print("Enter Number 2: ");
        int numTwo = input.nextInt();
        System.out.print("Enter Number 3: ");
        int numThree = input.nextInt();
        if(numOne==numTwo && numTwo==numThree && numOne==numThree){
            System.out.println("Numbers are equal");
            return;
        }
        if( numOne >= numTwo && numOne >= numThree)
            System.out.println(numOne + " is the largest number.");

        else if (numTwo >= numOne && numTwo >= numThree)
            System.out.println(numTwo + " is the largest number.");

        else
            System.out.println(numThree + " is the largest number.");
    }
}
