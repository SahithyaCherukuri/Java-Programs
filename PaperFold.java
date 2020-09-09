import java.util.*;

public class PaperFold{
    public static void main(String args[])
    {
        int h,w,h1,w1,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial height and width of paper");
        h=sc.nextInt();
        w=sc.nextInt();
        System.out.println("Enter final height and width of paper");
        h1=sc.nextInt();
        w1=sc.nextInt();
        while(h>h1) {
            if (h1 >= h/2) {
                h = h1;
            } else {
                h = h - h/2;
            }
            c++;
        }
        while(w>w1)
        {
            if(w1 >= w/2)
            {
                w=w1;
            }
            else
            {
                w = w - w/2;
            }
            c++;
        }
        System.out.println(c);
    }
}