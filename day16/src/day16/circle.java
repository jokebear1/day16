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
	 pizza.name="Ÿ���̿�������";
	 double area= pizza.getArea();
	 System.out.println(pizza.name + "�� ������ " + area);
	 
	 circle dounut=new circle();
	 dounut.radius=2;
	 dounut.name="�ڹٵ���";
	 area=dounut.getArea();
	 System.out.println(dounut.name+"�� ������ "+area);
	}

}
