/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. Each test case consists of two lines.
The first line of each test case is N and S, where N is the size of array and S is the sum.
The second line of each test case contains N space separated integers denoting the array elements.
Output:
For each testcase, in a new line,
print the starting and ending positions(1 indexing) of first such occuring subarray
from the left if sum equals to subarray, else print -1.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int k=0;k<T;k++){
            int current=0,n=sc.nextInt(),s=sc.nextInt(),flag=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0,j=0;i<n&&j<n;){
                if(current+arr[j]==s){
                    System.out.println((i+1)+" "+(j+1));
                    flag=1;
                    break;
                }
                else if(current+arr[j]<s){
                    current+=arr[j];
                    j++;
                }
                else if(current+arr[j]>s){
                    current-=arr[i];
                    i++;
                }
            }
            if(flag==0) System.out.println(-1);
        }
    }
}