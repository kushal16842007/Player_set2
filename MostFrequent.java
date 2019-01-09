import java.util.*;
class MostFrequent{
static void duplicate(String s)
    {
        char[] array = s.toCharArray();
        int[] value = new int[52];
        int max=0;
        for(int i=0;i<52;i++)
        {
            value[i]=0;
        }
        for(int i=0;i<s.length();i++)
        {
            if(array[i]>=97 && array[i]< 123)
            {
                value[array[i]-97] +=1;
            }
            if(array[i]>=65 && array[i]< 90)
            {
                value[array[i]-39] +=1;
            }
        }
	char character = '*';
        for(int i=0;i<52;i++)
        {
           
        //char character;
            if(max<value[i])
            {
               if(i<26)
               {          
                character = (char)(i+97);
		max = value[i];
               }
               else
               {
                character = (char)(i+39);
		max = value[i];
               }
                                      
            }
        }
	  System.out.println(character);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        duplicate(s);
       
    }               
}