/* program to store pattern in 2D Array 
Sample input &output:
Enter no.of rows:
0
1 2
3 4 5
6 7 8 9
*/

import java.util.*;

class DArray{
    int arr[][],i,j,n;
    DArray(int x){
        n=x;
        //initialize arr
        arr=new int[n][n];
        }
    
    void pattern(){
        
        int k=0;
        
        //write your code for pattern to store in a 2D array
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                arr[i][j]=k;
                k++;
            }
        }
        
    }
    void print2D(){
        
        //print elements from arr
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }
}
class TwoDArray{
    public static void main(String args[]){
        int n;
        System.out.println("Enter no.of rows:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        DArray d=new DArray(n);
        d.pattern();
        d.print2D();
    }
}