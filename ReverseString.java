
public class ReverseString 
{
	public static void main(String args[]) 
	{
	 
		String s = "This is a Java";
		char c[]=s.toCharArray();
		String rev="";
		for (int i=c.length-1;i>=0;i--)
		{
			rev+=c[i];
		}
		System.out.println(rev);
		System.out.println();
		
		System.out.println("*********");//************************ other method
		
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}

}
