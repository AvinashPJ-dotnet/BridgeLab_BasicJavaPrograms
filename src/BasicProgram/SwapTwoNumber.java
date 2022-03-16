package BasicProgram;

public class SwapTwoNumber {

    public void computeSwapTwoNumber(int first,int second){
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
}
