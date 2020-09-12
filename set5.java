/*import java.util.*;
class Node{
	int data;
	Node* next;
	Node* prev;
	Node(int n){
		this.data=n;
		next=NULL;
		prev=NULL;
	}
}
class DLL{
	Node *head,*tail;
	DLL(){
		head=NULL;
		tail=NULL;
	}
	void add(int n){
		if(head==NULL){
			head=new Node(n);
			last=head;
		}
		else{
			Node *temp=new Node(n);
			temp=last.next;
			temp.prev=last;
			lat=temp;
		}
	}
}*/
import java.io.*;
class DirectoryList{
	public static void main(String[] args) throws IOException{
		String DirecName,indent="";
		File direc;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Directory name:");
		DirecName=br.readLine();
		direc=new File(DirecName);
		if(direc.isDirectory()==false){
			if(!direc.exists()==false)
				System.out.println("ERROR");
		else
			System.out.println("NO FILE");
		}
		else{
			showContents(direc,indent);
		}
	}
	public static void showContents(File dir,String indent){
		String files[];
		System.out.println("Directory "+dir.getName());
		files=dir.list();
		for(int i=0;i<files.length;i++){
			File f=new File(files[i]);
			if(f.isDirectory()){
				indent+=" ";
				showContents(f,indent);
			} 
			else{
				System.out.println("Directory "+f.getName());
			}
		}
	}
}