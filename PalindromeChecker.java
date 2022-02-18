
import java.util.Scanner;

public class PalindromeChecker 
{  

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter str value : ");
		 String str = input.nextLine();
		 StringBuilder sb=new StringBuilder(str);  
			sb.reverse();
		String rev=sb.toString();  
		if(str.equals(rev)){  
			System.out.println(str+" is "+true);  
		}else{  
		System.out.println(str+" is "+false);  
		} 
				
	}
}  



