package BasicProgram;

public class QuotientRemainder {
    public void findQuotientAndReminder(int dividend,int divisor){
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

}
