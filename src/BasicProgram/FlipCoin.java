package BasicProgram;

import java.util.Scanner;

public class FlipCoin {
    final int HEAD = 1;

    public void coinFlipCalculation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of time want to flip a coin");
        int totalTimes = in.nextInt();
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < totalTimes; i++) {
            int coinFlip = (int) Math.round(Math.random());
            if (coinFlip == HEAD)
                headCount++;
            else
                tailCount++;

        }
        System.out.println("total head and tail count: "+headCount+"&"+tailCount);
        System.out.println("percentage of head: "+ calculationPercentage(headCount,totalTimes));
        System.out.println("percentage of Tail: "+ calculationPercentage(tailCount,totalTimes));

    }
    public double calculationPercentage(int totalCount,double totalTimes){
        double value=(totalCount/totalTimes);
        value=value*100;
        return value;
    }
}
