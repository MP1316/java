public class Sum_of_digit {
    public static void main(String[] args) {
        int n=652;
        int sum = 0;
        int lastdigit ;
        while(n!=0)
        {
            lastdigit = n%10;
            sum = sum+lastdigit;
             n = n/10;
        }
        System.out.println("The sum of digit is:"+sum);
    }
    
}
