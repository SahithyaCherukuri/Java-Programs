import java.util.*;
class gamePlay{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(PlayerWins(arr,j)){
                    //System.out.println(j+" "+i);
                    if(i%2==0){
                        System.out.println("Amith");
                        return;
                    }
                    else{
                        System.out.println("Gopal");
                        return;
                    }
                }
            }
            for(int j=0;j<n;j++){
                if(!SecondWins(arr,j)){
                    arr[j]=-11;
                }
            }
        }
    }
    static boolean SecondWins(int arr[],int x){
        int brr[]=new int[arr.length];
        brr=arr;
        brr[x]=-11;
        for(int i=0;i<arr.length;i++){
            if(SecondWins(brr,i)){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(PlayerWins(brr,i)){
                return false;
            }
        }
        return true;
    }
    static boolean PlayerWins(int arr[],int x){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==-11 || i==x){
                continue;
            }
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}