import java.util.Scanner;
public class sumOfSequreOfDigit {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n,sum = 0;
        n = scan.nextInt();
        while(n!=0)
        {
            int digit = n%10;
            n = n/10;
            sum += (digit*digit);
        }
        System.out.print(sum);
        
    
}
}
