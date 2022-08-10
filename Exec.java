import java.util.*;
import SHAPE.Circle;
import SHAPE.Square;
import SHAPE.Triangle;
public class Exec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("---menu---");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		System.out.println("0.Exit");
		System.out.println("ENTER THE CHOICE");
		
		int ch=sc.nextInt();
		
			if(ch==1) {
				System.out.println("enter the radius");
				float r=sc.nextFloat();
				Circle c=new Circle(r);
				c.perimeter();
				c.area();
				
			}
			else if(ch==2) {
				System.out.println("enter the side1");
				float s1=sc.nextFloat();
				System.out.println("Enter the side2");
				float s2=sc.nextFloat();
				System.out.println("Enter the height");
				float h=sc.nextFloat();
				System.out.println("Enter the length");
				float l=sc.nextFloat();
				Triangle tr=new Triangle(s1,s2,h,l);
				tr.perimeter();
				tr.area();
			}
			else if(ch==3) {
				// Square
				 System.out.print("Enter Side: ");
				 float s = sc.nextFloat();
				 Square c = new Square(s);
				 c.perimeter();
				 c.area();
				 
			}
			
			else {
				System.out.println("invalid choice");
				
			}
		
	}

}
