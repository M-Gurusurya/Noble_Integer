import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(findNobleInteger(array,size));
    }
    public static int findNobleInteger (int array[],int size)
    {
        Arrays.sort(array);
        int count=0;
        for(int i=0;i<size;i++)
        {
            if((size-i)-1==array[i])
            {
                count++;
            }
        }
        if(count==0)
        {
            return -1;
        }
        return count;
    }
}
