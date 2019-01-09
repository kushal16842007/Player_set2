import java.util.*;

public class isomorphic {
  public static void main(String[] args) {
    HashMap<Character, Character> hMap = new HashMap<Character, Character>();
    Scanner scan = new Scanner(System.in);
    String one = scan.nextLine();
    String two = scan.nextLine();
    char[] oneString = one.toCharArray();
    char[] twoString = two.toCharArray(); 
    int flag = 0;
  for(int i=0;i<one.length();i++)
  {
    if(hMap.containsKey(oneString[i]))
    {
      char value = hMap.get(oneString[i]);
      if(value == twoString[i])
	{
	}
      else
	{
	System.out.println("no");
	flag = 1;
	break;
	}
    }
    else
    {
      hMap.put(oneString[i], twoString[i]);
    }
  }

if(flag == 0)
System.out.println("yes");
   
  }
}