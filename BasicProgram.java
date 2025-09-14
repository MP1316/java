
import java.util.Scanner;

public class BasicProgram {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number:");
    //     int n = sc.nextInt();
    //     if(n<0)
    //     {
    //         n = n*-1;
          
    //     }
    //     System.out.println(n);  
        
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of length:");
    //     int l = sc.nextInt();
    //     System.out.println("Enter the value of breadth:");
    //     int b = sc.nextInt();
    //     int area = l*b;
    //     System.out.println(area);
    //     int perimeter = 2*(l+b);
    //     System.out.println(perimeter);
    //     if(area>perimeter){
    //         System.out.println("area is greater:");
    //     }
    //     else{
    //         System.out.println("perimeter is greater:");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();
        
        if(x==0 && y==0){
            System.out.println("they are not lies on the origin");
        }
        else if(x==0)
        {
            System.out.println("they are  lies on the y axis");
        }
       else{
             System.out.println("they are  lies on the x axis");
       }
    }
    
}
