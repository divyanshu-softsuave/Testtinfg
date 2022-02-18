
public class Palindrome 
{
	public static void main(String args[])
	{
		String s1= "nitin";
		String s2= "jatin";
		StringBuilder s= new StringBuilder(s1);
		StringBuilder ss = new StringBuilder(s2);
		s.reverse();
		String rev = s.toString();
		ss.reverse();
		String rev1 = ss.toString();
		 if (s1.equals(rev))
		 {
			System.out.println(true);
		 }else {
			 System.out.println(false);
		 }
		 if (s2.equals(rev1))
		 {
			System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
		 
		 
	}
	
}
