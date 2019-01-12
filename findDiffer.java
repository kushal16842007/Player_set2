import java.util.*;
public class Main
{
    static void findDiffer(String s1,String s2,int n)
    {
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        int flag = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(array1[i]!=array2[i])
            {
                flag++;
            }
        }
        if(flag == n)
        System.out.println("yes");
        else
            System.out.println("no");
        
    }
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s1 = scan.nextLine();
	    String s2 = scan.nextLine();
	    int n = scan.nextInt();
	    findDiffer(s1,s2,n);
	}
}
