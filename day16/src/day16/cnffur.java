package day16;

class Ex03
{
	int[] arr= {87,100,11,72,92};
}
public class cnffur {
	public static void main(String[] args) {
		Ex03 a=new Ex03();
		Ex03 hdg=new Ex03();
		
		int sum=0;//1번
		for(int i=0; i<hdg.arr.length; i++)
		{
		sum+=hdg.arr[i];
		}
		
		int hap=0;//2번
		for(int i=0; i<hdg.arr.length; i++)
		{
			if(hdg.arr[i]%4==0);
			{
			 hap+=hdg.arr[i];
			
			}
		}
		
		
		int count=0;//3번
		for(int i=0; i<hdg.arr.length; i++)
		{
			if(hdg.arr[i]%4==0)
			{
				count++;
			}
		}
		
		
		int WKr=0;//4번
		for(int i=hdg.arr.length; i<5; i++)	
		{
			if(hdg.arr[i]%2==0)
			{
				WKr++;
			}
		}
		
		
		System.out.println("전체 합 출력: "+sum);
		System.out.println("4의 배수 합 출력: "+ hap);
		System.out.println("4의 배수 개수 출렷: "+count);
		System.out.println("짝수: "+WKr);
	}

}
