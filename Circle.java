package SHAPE;

public class Circle {
	float radius;
	public Circle() {}
	public Circle(float radius)
	{
		this.radius=radius;
	}
	public void  perimeter() {
		float ans=2*3.14f*radius;
		System.out.println("Perimeter of circle "+ans+"cm");
	}
	public void area(){
		 float ans= 22/7* radius * radius;
		 System.out.println("Area: "+ans+" cm^2");
		 }

}
