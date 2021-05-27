import java.util.*;
public class FindRange {
    public static void main(String[] args)
    {
        int numOfElements, elements[],range;
        Scanner sc= new Scanner(System.in);
        numOfElements = sc.nextInt();
        elements = new  int[numOfElements];
        for(int i=0;i<numOfElements;i++)
            elements[i]=sc.nextInt();
        Arrays.sort(elements);
        range= elements[4]-elements[0];
        System.out.println("The range of the array is "+range);

    }
}
