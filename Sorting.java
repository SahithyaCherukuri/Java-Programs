/*Program to sort an array in ascending order in java

Sample Input and Output:
Enter size of the array:5                                                                                               
Enter elements:                                                                                                         
89                                                                                                                      
21                                                                                                                      
3                                                                                                                       
54                                                                                                                      
37                                                                                                                      
Sorted List in Ascending Order                                                                                          
3  21  37  54  89                                                                                                       
                  
*/

import java.util.Scanner;

public class Sorting
{
   public static void main(String args[])
   {
	      int arr[],i,j,n,p;
	      
        // initialize variables and objects.
       Scanner scan=new Scanner(System.in);
       // read the size of an array
       System.out.print("Enter size of the array:");
       n = scan.nextInt();
	   arr=new int[n];
       // read the elements.
       System.out.println("Enter elements: ");
      for(i=0;i<n;i++){
          arr[i]=scan.nextInt();
      }
       // sort the array elements.
  
      for (i = 0; i < n; i++) 
        {
            for ( j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
	  
       // printing sorting array
       System.out.println("Sorted List in Ascending Order");
       for(i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
   }
}