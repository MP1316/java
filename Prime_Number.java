import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        boolean flag = false; //false means prime
        for(int i=2; i<n; i++)
        {
            if(n%2==0){
                flag = true; //true means composite
                break; 
            }

        }
        if(n==1)
        {
            System.out.println("Neither compositive nor a prime number");
        }
        else if(flag == false)
        {
            System.out.println("Prime number");
        }
        else
       {
        System.out.println("Not a prime number");
       }
    }
    
}
