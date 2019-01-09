import java.util.*;
public class PrimeFacter {
    
    static void primeFacter(int n)
    {
        int i=2;
        while(n!=1)
        {
            if(n%i==0)
            {
                System.out.print(i+"  ");
                n = n/i;
                while(n%i==0)
                    n = n/i;
            }
            i++;
        }
    }
     public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     primeFacter(n);
}
}
