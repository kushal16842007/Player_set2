import java.util.Scanner;
public class ReverseAndRemoveVowel {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] array = s.toCharArray();
        char[] array1 = new char[array.length];
        int j = 0;
        for(int i = 0; i < array.length ; i++)
        {
            if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u' || array[i]=='A' || array[i]=='E' || array[i]=='I' || array[i]=='O' || array[i]=='U')
            {
            }
            else
            {
                array1[j] = array[i];
                j++;
            }
        }
        char[] reverse = new char[j];
        int length = --j;
        for(int i=0;i<=j;i++)
        {
            reverse[length] = array1[i];
           // System.out.print(array1[i]);
            length--;
        }
        for(int i=0;i<=j;i++)
        {
          System.out.print(reverse[i]);
        }
    
}
}
