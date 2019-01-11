import java.util.*;
public class Main
{
  
static void countPerfectSquare(int start,int end)
    {
        int count = 0;
        for(int i=1;i<= end/2 ;i++)
        {
            int square = i*i;
            if(square > start && square <end)
            count++;
        }
        System.out.print(count);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		countPerfectSquare(s,e);
	}
}
