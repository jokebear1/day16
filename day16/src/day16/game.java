package day16;

import java.util.Random;
import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		String[] words= {"java", "mysql", "jsp", "spring"};
		
		int i=0;
		while(true) {
			int r=ran.nextInt(words.length);
			
		String temp=words[0];
		words[0]=words[r];
		words[r]=temp;
		i++;
		
		for(int j=0; j<5; j++)
		{
			System.out.println("문제 : "+words[r]);
			System.out.println("입력 : ");
			String ekq=sc.next();
			
			if(ekq.equals(words))
			{
				j++;
			}
		}
			
			
		}
		
	}

}
