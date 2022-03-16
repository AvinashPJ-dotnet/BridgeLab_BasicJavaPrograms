package BasicProgram;

public class HarmonicNumber {
    double harmonicSum=0;
    public void calculateHarmonicNumber(int number){
        float harmonicNumber=0.0f;
        System.out.println(number);
        if (number>0){
            for (int i = 1; i <=number; i++) {
                System.out.println(i);
                harmonicNumber+=(1/(double)i);
            }
        }
        System.out.println(harmonicNumber);
    }
}
