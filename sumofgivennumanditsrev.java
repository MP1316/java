import java.util.Scanner;

public class sumofgivennumanditsrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the numner : ");
        int n = sc.nextInt();
        int rev = 0;
        int sum = n;
        while(n!=0)
        {
            int ld = n%10;
            rev = rev*10;
            rev = rev+ld;
            n = n/10;
            
        }
        sum = sum+rev;
        System.out.println(sum);
        
    }
    
}
