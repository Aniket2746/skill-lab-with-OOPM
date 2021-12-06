package lab;

abstract class Shape {
float a=23 ,b=10;
abstract void printArea();
}

class triangle extends Shape{
	 void printArea()
{System.out.println("Area of traingle is ="+a*b/2);
		}
}
class Circle extends Shape{
	 void printArea()
{System.out.println("Area of circle is ="+3.14*b*b);
		}
}
class Rectangle extends Shape{
	 void printArea()
{System.out.println("Area of rectangle is ="+a*b);
		}
}
public class abstractShape {
	public static void main(String[] args) {
		
	    Circle c=new Circle();
		triangle t=new triangle();
		Rectangle r=new Rectangle();
		t.printArea();
		c.printArea();
		r.printArea();
	}
}
