/* Program to print following pattern
sample input and output:
Enter no.of rows:                                                                                                       
5                                                                                                                       
        *                                                                                                               
      * * *                                                                                                             
    * * * * *                                                                                                           
  * * * * * * *                                                                                                         
* * * * * * * * *                                                                                                               
*/
import java.util.*;

class DArray{
    char arr[][];
    int i,j,n,k,l;
    DArray(int y){
        l=y;
        arr=new char[l][2*l];
    }
    void pattern(int x){
        n=2*x-1;
        k=0;
        for(i=x-1;i>=0;i--){
            for(j=x;j<n-k;j++){
                arr[i][j]='*';
            }
            for(j=k;j<x;j++){
                arr[i][j]='*';
            }
            k++;
        }
        for(i=0;i<x;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
        // Write your code here
        
}
class starHill{
    public static void main(String args[]){
        int n;
        System.out.println("Enter no.of rows:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        DArray d=new DArray(n);
        d.pattern(n);
    }
}

