package day16;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}
public class width {
	public static void main(String[] args) {
		Rectangle rect= new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		rect.width=sc.nextInt();
		rect.height=sc.nextInt();
		System.out.println("¸éÀûÀº "+rect.getArea());
	}

}
