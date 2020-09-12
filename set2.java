/*//a...
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends Applet implements ActionListener{
	Label l1,l2;
	TextField tf1,tf2;
	Button b1;
	public void init(){
		setSize(400,200);
		setLayout(new FlowLayout());
		l1=new Label("Number :");
		l1.setForeground(Color.BLUE);
		add(l1);
		tf1=new TextField(5);
		tf1.setText("0");
		add(tf1);	
		b1=new Button("Compute");
		b1.addActionListener(this);
		add(b1);
		l2=new Label("Factorial :");
		l2.setForeground(Color.BLUE);
		add(l2);
		tf2=new TextField(5);
		add(tf2);		
	}
	public void actionPerformed(ActionEvent ae){
		long n=Integer.parseInt(tf1.getText());
		long f=1;
		while(n!=0){
			f=f*n;
			n--;
		}
		tf2.setText(String.valueOf(f));
	}
}*/
//b..
import java.util.*;
class QuickSort {
	String names[];
	int length;
	public static void main(String[] args){
		QuickSort sorter=new QuickSort();
		String words[]={"happy","sad","dance","sing","pray","lean","die"};
		sorter.sort(words);
		for(String i:words){
			System.out.println(i);
		}
	}
	void sort(String[]	array){
		if(array==null||array.length==0)	
			return;
		this.names=array;
		this.length=array.length;
		quickSort(0,length-1);
	}
	void quickSort(int lowerIndex,int higherIndex){
		int i=lowerIndex;
		int j=higherIndex;
		String pivot=this.names[i+(j-i)/2];
		while(i<=j){
			while(this.names[i].compareToIgnoreCase(pivot)<0)
				i++;
			while(this.names[j].compareToIgnoreCase(pivot)>0)
				j--;
			if(i<=j){
				exchangeNames(i,j);
				i++;
				j--;
			}
		}//call quickSort recursively
		if(lowerIndex<j){
			quickSort(lowerIndex,j);
		}
		if(higherIndex>i){
			quickSort(i,higherIndex);
		}		
	}
	void exchangeNames(int i,int j){
		String temp=this.names[i];
		this.names[i]=this.names[j];
		this.names[j]=temp;
		i++;
		j--;
	}
}
/*
QuickSort.... main(){array...}
sort(){names,length....}
quicksort(){index low,high,...3 whiles..recursion)
exchangeNames()....
*/