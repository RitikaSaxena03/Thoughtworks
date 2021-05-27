import java.util.*;
public class FindArrayType {
    public static void main(String[] args)
    {
        int numOfElements, elements[];
        Scanner sc= new Scanner(System.in);
        numOfElements= sc.nextInt();
        elements =new int[numOfElements];
        for(int i=0;i<numOfElements;i++)
            elements[i] = sc.nextInt();
        int result= typeOfArray(elements,numOfElements);
        if(result==1)
            System.out.println("The array is Even");
        if(result==2)
            System.out.println("The array is Odd");
        if(result==3)
            System.out.println("The array is Mixed");
    }

    public static int typeOfArray(int elements[], int numOfElements)
    {
        int evenCount=0, oddCount=0;
        for(int j=0; j<numOfElements; j++)
        {
            if(elements[j]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        if(evenCount==numOfElements)
            return 1;
        else if(oddCount== numOfElements)
            return 2;
        else
            return 3;
    }
}


