import java.util.*;
public class Main
{
    static void GCD(int n1,int n2)
    {
        int gcd;
        if(n1<n2)
        gcd=n1;
        else
        gcd=n2;
        
        while(true)
        {
            if(n1%gcd==0 && n2%gcd==0)
            break;
            else
            gcd--;
        }
        System.out.println(gcd);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		GCD(n1,n2);
	}
}
