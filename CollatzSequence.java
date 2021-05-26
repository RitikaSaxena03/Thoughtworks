import java.util.*;
public class CollatzSequence {
    public static void main(String[] args)
    {
        int number;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        while(number!=1)
        {
         if(number%2==0)
             number=number/2;
         else
             number=3*number+1;
            System.out.println(number);
        }
    }
}
