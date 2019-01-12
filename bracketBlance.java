import java.util.*;
public class Main
{
static void bracketBlance(String s)
    {
        char[] bracket = s.toCharArray();
        int open = 0;
        int close = 0;
        for(int i=0;i<s.length();i++)
        {
            if(bracket[i]=='(')
            open++;
            else
            close++;
        }
        if(open==close)
        System.out.println("yes");
        else
            System.out.println("no");
        
    }
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    bracketBlance(s);
	   
	}
}
