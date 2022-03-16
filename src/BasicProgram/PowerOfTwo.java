package BasicProgram;

public class PowerOfTwo {
    public void calculatePowerOfTwo(int num){
        if(num>=0 && num<=31)
        {
            for (int i = 1; i <= num; i++) {
                int value=(int)Math.pow(2,i);
                System.out.println("2 pow "+i+": "+value);
            }
        }
        else {
            System.out.println("number should not greater then 31 and less then 0");
            System.exit(0);
        }

    }

}
