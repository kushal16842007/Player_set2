import java.util.Scanner;
public class RightShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,k;
        n = scan.nextInt();
        k = scan.nextInt();
        
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i] = scan.nextInt();
        
        for(int i =0; i<k ;i++)
        {
            int temp = array[n-1];
           
            for (int j = n-1;j>0;j--)
            {
                array[j] = array[j-1];
                
            }
            array[0] = temp;
        }
        
        for(int i=0;i<n;i++)
            System.out.print(array[i]+"  ");
        
    
}
}
