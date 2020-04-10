package New;

import java.util.LinkedHashSet;

public class Demo
{
	public static void main(String[] args)

	{

		String s="girish";
		String s1="";
		char [] ch=s.toCharArray();

		LinkedHashSet<Character> hs = new LinkedHashSet();

		for(int i=0;i<ch.length;i++)
		{
			hs.add(ch[i]);
		}
		System.out.println(hs);
		
		for(char x:hs)
		{
			System.out.print(x);
			
		}
	}
}
