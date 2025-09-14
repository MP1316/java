public class Count_Digit {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        if(n==0) count++;
        while(n!=0)
        {
            n = n/10;
            count++;
        }
        System.out.println("Your count is:"+count);
    }
    
}
