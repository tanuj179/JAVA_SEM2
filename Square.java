package SHAPE;

public class Square {
	float side;

	 public Square(){}
	 public Square(float side){
	 this.side = side;
	 }
	 public void perimeter(){
		 float ans= 4* side;
		 System.out.println("Perimeter: "+ans+" cm");
		 }
		 public void area(){
		 float ans= 2* side;
		 System.out.println("Area"+ans+"cm^2");
		 }
	}
