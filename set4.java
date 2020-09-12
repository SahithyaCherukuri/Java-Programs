import java.util.*;
class even implements Runnable{
	int a;
	even(int n){
		this.a=n;
	}
	public void run(){
		System.out.println("Even Thread: "+"square of "+a+" is "+a*a);
	}
}
class odd implements Runnable{
	int a;
	odd(int n){
		this.a=n;
	}
	public void run(){
		System.out.println("Odd Thread: "+"cube of "+a+" is "+a*a*a);
	}
}
class MultiThread extends Thread{
	Random r;
	String tname;
	Thread t1,t2;
	int num=0;
	MultiThread(String s){
		tname=s;
	}
	public void run(){
	try{
		r=new Random();
		for(int i=0;i<10;i++){
			num=r.nextInt(50);
			if(num%2==0){
				t1=new Thread(new even(num));
				t1.start();
			}
			else{
				t2=new Thread(new odd(num));
				t2.start();
			}
			Thread.sleep(1000);
			System.out.println("------------------------");
		}
	}catch(Exception e){
		System.out.println("Exception caught");
	}	
	}
	public static void main(String[] args){
		MultiThread td=new MultiThread("one");
		td.start();
	} 
}