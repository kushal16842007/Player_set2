import java.util.Scanner;
public class encodedShift {
    static void encodedShift(String s,int n)
    {
        char[] array = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int c = array[i]+n;
            if(c>122)
                c = c-26;
            System.out.print((char)c);
        }
    }
public static void main(String[] arg)
{
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    encodedShift(s,3);
    
}
    
}
