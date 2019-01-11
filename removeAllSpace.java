import java.util.*;
public class Main
{
    
    static void removeAllSpace(String s)
    {
        char[] array = s.toCharArray();
        String result = "";
        for(int i=0;i<s.length();i++)
        {
            if(array[i]!=' ')
            result += array[i];
        }
        System.out.print(result);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		removeAllSpace(s);
	}
}
