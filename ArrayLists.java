import java.util.*;

public class ArrayLists {
	public static void main(String args[])
	{
		  ArrayList<String> list=new ArrayList<String>(); //// 
		  list.add("Mango");   
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		    System.out.println(list);
		    
		    System.out.println("###############");
		    
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }  
	}
}


//import java.util.*;  
//public class ArrayListExample3{  
// public static void main(String args[]){  
//  ArrayList<String> list=new ArrayList<String>();  
//  list.add("Mango");    
//  list.add("Apple");    
//  list.add("Banana");    
//  list.add("Grapes");    
//    
//  for(String fruit:list)    
//    System.out.println(fruit);    
//  
// }  
//} 