package BasicProgram;

import java.io.PrintWriter;
import java.util.Scanner;

public class JavaFunctionalProgram {
    public void TwoDimentionalArray(){
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter number rows");
        int row=input.nextInt();
        System.out.printf("Enter number rows");
        int col=input.nextInt();
        PrintWriter pw = new PrintWriter(System.out);

        int arr[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter element for row "+i+" and col "+j);
                arr[i][j]=input.nextInt();
                pw.append((char) arr[i][j]);
            }
        }
        pw.flush();
        pw.close();
    }
}
