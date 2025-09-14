
import java.util.Scanner;

public class Product_of_Digit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int n = sc.nextInt();
        int mult = 1;
        while(n!=0)
        {
            
            int ld = n%10;
            mult = mult*ld;
            n = n/10;
            
        }
        System.out.println("Product of digit is:"+mult);
    }
    
}
