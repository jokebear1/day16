package day16;


public class answkduf {
	public static void main(String[] args) {
		
		String str="±èÃ¶¼ö/87,ÀÌ¸¸¼ö/42,ÀÌ¿µÈñ/95";
		String[] name=new String[3];
		int[] score=new int[3];
		
		String[]  temp=str.split(",");
		for(int i=0; i<str.length(); i++)
		{
			String[] info=temp[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
		for(int j=0; j<3;j++)
		{
			System.out.println(name[j] + " : " + score[j]);
		}
		
		
	}

}
