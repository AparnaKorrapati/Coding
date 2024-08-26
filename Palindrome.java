package stringbuffer;
import java.util.*;


public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any String");
		String temp,str=s.nextLine();
	 StringTokenizer s1=new StringTokenizer(str);
	StringJoiner s2=new StringJoiner(",");
	while(s1.hasMoreTokens())
	{
		temp=s1.nextToken().toLowerCase();
		if(temp.contentEquals(new StringBuffer(temp).reverse()))
			s2.add(temp);
	}
	System.out.println(s2.toString());
   
	}
}
