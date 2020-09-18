/* program to reverse a given string
sample input and output as follows:

Enter the String:                                                                                                       
string handling methods                                                                                                 
Reverse of given String is:sdohtem gnildnah gnirts                                                                      
                                                                                                                                                                                                     
                                                                                                                        
*/
import java.util.*;

class RevString {
    String findRev(String s){
        String rs="";
        for(int i=1;i<=s.length();i++){
            rs=rs+s.charAt(s.length()-i);
        }
        return rs;
    }
    //inplace
    String inPlaceRev(String s){
        for(int i=0;i<s.length();i++){
            s+=s.charAt(s.length()-1)+""+s.substring(1,s.length()-1);
        }
        return s;
    }

    }
class RevStringTest
    {
	public static void main(String args[])
	    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		RevString sr=new RevString();
		System.out.println("Reverse of given String is:"+sr.findRev(str));
            System.out.println("Reverse of given String in place is:"+sr.inPlaceRev(str));
		}
	} 
		
