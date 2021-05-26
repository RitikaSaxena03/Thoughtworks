import java.util.*;
public class ComputeSalary {
    public static void main(String[] args)
    {   int hoursWorked, salary=0, weekdaysHourWorked=0;
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=7;i++)
        {
         hoursWorked=sc.nextInt();
         if(i==1)
         {
             salary+=150*hoursWorked;
         }
         else if(i==7)
         {
             salary+=125*hoursWorked;
         }

         else if(hoursWorked<=8)
         {
             weekdaysHourWorked+=hoursWorked;
             salary+=100*hoursWorked;

         }
         else if (hoursWorked>8)
         {
             weekdaysHourWorked+=hoursWorked;
             salary+=800+(hoursWorked-8)*115;
         }
        }
        if(weekdaysHourWorked>40)
            salary+=125*(weekdaysHourWorked-40);

        System.out.println(salary);
    }
}
