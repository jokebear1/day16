package day16;

public class circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
     public static void main(String[] args) {
	 circle pizza= new circle();
	 pizza.radius=10;
	 pizza.name="타츠미오빠피자";
	 double area= pizza.getArea();
	 System.out.println(pizza.name + "의 면적은 " + area);
	 
	 circle dounut=new circle();
	 dounut.radius=2;
	 dounut.name="자바도넛";
	 area=dounut.getArea();
	 System.out.println(dounut.name+"의 면적은 "+area);
	}

}
