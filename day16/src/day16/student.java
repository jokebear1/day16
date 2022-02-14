package day16;

class gpgp
{
	String name;
	int score;
}
public class student {
	public static void main(String[] args) {
		Ex01 e=new Ex01();
		e.x=10;
		e.y=20;
		
		gpgp hgd= new gpgp();
		hgd.name="임명진";
		hgd.score=100;
		
		System.out.println("같은~~~~~가능");
		System.out.println("e.x: "+e.x);
		System.out.println("e.y: "+e.y);
		System.out.println("==============");
		System.out.println("hgd.name: "+hgd.name);
		System.out.println("hgd.score: "+hgd.score);
	}

}
