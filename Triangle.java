package SHAPE;

public class Triangle {
	float side1,side2,height,length;
	public Triangle() {}
	public Triangle(float side1,float side2,float height,float length) {
		this.side1=side1;
		this.side2=side2;
		this.height=height;
		this.length=length; //base
	}
	public void perimeter() {
		float ans=side1+side2+length;
		System.out.println("perimeter of traingle"+ans+" cm");
	}
	public void area() {
		float ans=0.5f*length*height;
		System.out.println("perimeter of traingle"+ans+" cm^2");
	}
}
