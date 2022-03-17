package FunctionProgram;

import java.io.PrintWriter;
import java.util.Scanner;

public class JavaFunctionalProgram {
    public void TwoDimentionalArray(){
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter number rows");
        int row=input.nextInt();
        System.out.printf("Enter number cols");
        int col=input.nextInt();
        PrintWriter pw = new PrintWriter(System.out,true);

        int arr[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter element for row "+i+" and col "+j);
                arr[i][j]=input.nextInt();

            }
        }
        System.out.println(arr[1][1]);
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                pw.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        pw.close();
        return;
    }

    public void calculateDistance(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter point one:");
        int pointOne=scanner.nextInt();
        System.out.print("enter point two:");
        int pointTwo=scanner.nextInt();
        double distance=Math.sqrt((pointOne*pointOne)+(pointTwo*pointTwo));
        System.out.println("Distance is: "+distance);

    }

    public void quadraticEquation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a:");
        int a=scanner.nextInt();
        System.out.print("enter b:");
        int b=scanner.nextInt();
        System.out.print("enter c:");
        int c=scanner.nextInt();
        double delta=(Math.pow(b,2)-(4*a*c));
        calculateRoot(delta,a,b,c);
    }
    public void calculateRoot(double delta,int a,int b ,int c){
        double rootOneX=0;
        double rootTwoX=0;
        if (delta==0){
            rootOneX = rootTwoX = -b / (2 * a);
            System.out.format("root one = root two = %.2f;", rootOneX);
        }
        else if (delta>0){
            rootOneX=(-b + Math.sqrt(delta))/(2*a);
            rootTwoX=(-b - Math.sqrt(delta))/(2*a);
            System.out.format("root1 = %.2f and root2 = %.2f", rootOneX, rootTwoX);
        }
        else{
            float real = (-b / (2 * a));
            double imaginary = (Math.sqrt(-delta) / (2 * a));
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
