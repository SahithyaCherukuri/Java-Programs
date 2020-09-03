import java.lang.reflect.Array;
import java.util.*;
class Swayamvar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] bride=sc.next().toCharArray();
        //sc.nextLine();
        char[] groom=sc.next().toCharArray();
        //System.out.println(Arrays.toString(bride));
        //System.out.println(Arrays.toString(groom));
        int sol=n,count=0,check=0;
        for(int i=0,j=0;i<n;){
            if(count==n||check==n){
                System.out.println(sol);
                return;
            }
            if(bride[i]==groom[j]){
                bride[i]='$';
                groom[j]='$';
                i=(i+1)%n;
                j=(j+1)%n;
                sol--;
                count=0;
                check++;
            }
            else
            j=(j+1)%n;
            count++;
            //System.out.println(Arrays.toString(bride)+" "+Arrays.toString(groom)+" "+sol);
        }
        System.out.println(sol);
    }
}