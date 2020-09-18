abstract class Shape{
	double a,b;
	Shape(){
		a=0;b=0;
	}
	void printArea(){
			System.out.println("printArea of Shape called");
	}
}
class Rectangle extends Shape
{
Rectangle(){
	super.a=2;
	super.b=2;
}
Rectangle(int a, int b){
	super.a=a;
	super.b=b;
}
	void printArea(){
		System.out.println("printArea of Recatangle called : "+(a*b));
	}
}
class Triangle extends Shape 
{
Triangle(){
	super.a=3;
	super.b=3;
}
Triangle(int a, int b){
	super.a=a;
	super.b=b;
}
	void printArea(){
	double c=(a*b)/2;
		System.out.println("printArea of Triangle called : "+c);
	}
}
class Circle extends Shape
{
Circle(){
	super.a=4;
	super.b=4;
}
Circle(int a){
	super.a =a;
}
	void printArea(){    
	              double c=(3.14)*a*a;                                                                                                                                                                                                                                                                     
		System.out.println("printArea of Circle called: "+ c);
	}
}
class Test{
	public static void main(String[] args){
	Rectangle r=new Rectangle(3,2);
	r.printArea();
	Triangle t=new Triangle(2,4);
	t.printArea();
	Circle c=new Circle(3);
	c.printArea();	
}}