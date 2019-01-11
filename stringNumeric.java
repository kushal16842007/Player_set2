import java.util.*;
public class Main
{
static void stringNumeric(String s)
    {
        char[] array = s.toCharArray();
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if(array[i]==1||array[i]==2 ||array[i]==3||array[i]==4||array[i]==5||array[i]==6||array[i]==7||array[i]==8||array[i]==9||array[i]==0)
            {
                
            }
            else
            {
                f=1;
                break;
            }
        }
        if(f == 0)
        {
        System.out.println("yes");
        }
        else
        {
        System.out.println("no");
        }
        
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	String s = scan.nextLine();
		stringNumeric(s);
	}
}
