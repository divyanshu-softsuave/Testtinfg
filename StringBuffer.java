	import java.util.Scanner;
	public class StringBuffer 
	{
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter str value : ");
			String str =s.nextLine();
			StringBuilder sb = new StringBuilder(str);
			sb.append(" Sai");
			System.out.println(sb);
			sb.insert(1,"charan");
			System.out.println(sb);
			sb.replace(1,3, "str");
			System.out.println(sb);
			sb.delete(2,4);
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
			
		}
	}


