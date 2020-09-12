/*//a..
	class Shared{
	int count=0;
	boolean flag;
	synchronized void put(){
		try{
			while(flag){
				wait();
			}
			count++;
			flag=true;
			System.out.println("Put: "+count);
			notify();
		}catch(InterruptedException ie){
			System.out.println(ie.getMessage());
		}
	}
	synchronized void get(){
		try{
			while(!flag){
				wait();
			}
			flag=false;
			System.out.println("Get: "+count);
			notify();
		}catch(InterruptedException ie){
			System.out.println(ie.getMessage());
		}
	}
}
class Producer extends Thread{
	Shared sh;
	Producer(Shared sh){
		this.sh=sh;
	}
	public void run(){
		for(int i=0;i<10;i++){
			sh.put();
			try{
				sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread{
	Shared sh;
	Consumer(Shared sh){
		this.sh=sh;
	}
	public void run(){
		for(int i=0;i<10;i++){
			sh.get();
			try{
				sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class MultiThreading{
	public static void main(String[] args){
		Shared sh=new Shared();
		Producer p=new Producer(sh);
		Consumer c=new Consumer(sh);
		p.start();
		c.start();
	}
}*/
//b...
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Mevents extends JFrame implements MouseListener{
	JLabel l1;
	public Mevents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setLayout(new GridBagLayout());
		l1=new JLabel();
		Font f=new Font("VERDANA",Font.BOLD,20);
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		add(l1);
		addMouseListener(this);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e){
		l1.setText("Mouse Clicked");
	}
	public void mousePressed(MouseEvent e){
		l1.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e){
		l1.setText("Mouse Released");
	}
	public void mouseEntered(MouseEvent e){
		l1.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e){
		l1.setText("Mouse Exited");
	}
	public static void main(String[] args){
		Mevents m=new Mevents();
	}
}