import java.util.*;
public class CheckMangoTree {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int numberOfRows, numberOfColumn, treeNumber;
        System.out.println("Enter the number of Rows");
        numberOfRows=sc.nextInt();
        System.out.println("Enter the number of Column");
        numberOfColumn= sc.nextInt();
        System.out.println("Enter a Tree Number");
        treeNumber=sc.nextInt();
        if(treeNumber<0 || treeNumber>numberOfColumn*numberOfRows) {
            System.out.println("Invalid Input");
        }
        else if(treeNumber<=numberOfColumn || treeNumber%numberOfColumn==0|| treeNumber%numberOfColumn==1) {
            System.out.println("It is a Mango Tree");
        }
        else
        {
            System.out.println("It is not a Mango Tree");
        }
    }
}
