import java.util.*;
class Holiday
{
public static void main(String[] arg)
{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("Saturday") || s.equals("Sunday"))
        {
            System.out.println("Yes");
            
        }
        else
        {
            System.out.println("No");
        }
}
}
