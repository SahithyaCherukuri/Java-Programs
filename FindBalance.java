import java.util.*;
class FindBalance{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(GetTheNumberOfSplits(arr,0,n));
        /*for(int i=0;i<n;i++){
            
        }*/
    }
    public static int GetTheNumberOfSplits(int arr[],int p,int q){
        int sum1=0,sum2=0;
        if(p>=q){
            return 0;
        }
        for(int i=p;i<q;i++){
            sum1+=arr[i];
        }
        for(int i=p;i<q;i++){
            if(sum2==sum1-sum2){
                //System.out.println(i+" "+sum1);
                int a = GetTheNumberOfSplits(arr,p,i)+1;
                int b = GetTheNumberOfSplits(arr,i,q)+1;
                if(a>=b) return a;
                else return b;
            }
            //System.out.println(i+" "+sum1+" "+sum2);
            sum2+=arr[i];
        }
        return 0;
    }
}