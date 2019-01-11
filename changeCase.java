import java.util.*;
public class Main
{
    
    static void changeCase(String s)
    {
        char[] array = s.toCharArray();
        String result = "";
        for(int i=0;i<s.length();i++)
        {
            if(array[i]>=65 && array[i]<=90)
            result += (char)(array[i] + 32);
            else if(array[i]>=97 && array[i]<=123)
            result += (char)(array[i] - 32);
        }
        System.out.print(result);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		changeCase(s);
	}
}
