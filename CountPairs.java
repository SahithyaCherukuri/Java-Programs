/*import java.util.*;
class CountPairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        ArrayList<Long> al = new ArrayList<Long>();
        int count=0;
        for(int i=0;i<n;i++){
            al.add(sc.nextLong());
        }
        for(int i=0;i<n;i++){
            //System.out.println(al+" "+arr[i]+" "+k);
            if(checkIf(al,al.get(i),k)){
                count++;
            }
        }
       System.out.println(count);
    }
    public static boolean checkIf(ArrayList<Long> al,long l,int k){
        for(int i=0;i<al.size();i++){
            long x= al.get(i);
            if(x<=(l+k)&&x>=(l-k)&&l!=x){
                //System.out.println(al+" "+x+" "+(k+l)+" "+(l-k));
                return true;
            }
        }
        return false;
    }
}*/
import java.util.*;
class CountPairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        ArrayList<Long> al = new ArrayList<Long>();
        int count=0;
        for(int i=0;i<n;i++){
            al.add(sc.nextLong());
        }
        int last=0;
        Collections.sort(al);
        for(int i=0;i<n;i++) {
            if(i!=n-1&&al.get(i + 1)== al.get(i)){
                count+=last==0?0:1;
            }
            else if (i!=n-1&&al.get(i + 1) <= al.get(i) + k ) {
                count++;
                last=1;
            }
            else if(i!=0&&al.get(i-1)>=al.get(i)-k) {
                count++;
                last=1;
            }
            else{
                last=0;
            }
        }
        System.out.println(count);
    }
}