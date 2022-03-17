package FunctionProgram;

import java.util.Scanner;

public class Distance {
    public void calculateDistance(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter point one:");
        int pointOne=scanner.nextInt();
        System.out.print("enter point two:");
        int pointTwo=scanner.nextInt();
        double distance=Math.sqrt((pointOne*pointOne)+(pointTwo*pointTwo));
        System.out.println("Distance is: "+distance);

    }
}
