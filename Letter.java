import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(),c=sc.nextInt(),arr[][]=new int[n][n],temp[]=new int[c];
        for(int i=0;i<c;i++){
            temp[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            arr[x-1][y-1]=z;
            arr[y-1][x-1]=z;
        }
        fillUpAll(arr,n);

    }
    public static void fillUpAll(int arr[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

            }
        }
    }
}