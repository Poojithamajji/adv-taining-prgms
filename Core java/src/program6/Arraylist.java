package program6;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
	    alist.add("Sujitha");
	    alist.add("Surya");  
	    alist.add("Pooja");  
	    alist.add("Sri");
	    alist.add("Siddu");
	    alist.add("Nani");
	    System.out.println(alist);
	    
	    if (alist.contains("Sujitha"))
	        System.out.println("Sujitha exists in the ArrayList");

	    else
	        System.out.println("Sujitha does not exist in the ArrayList");

	    if (alist.contains("Priya"))
	        System.out.println("Priya exists in the ArrayList");

	    else
	        System.out.println("Priya does not exist in the ArrayList");
	}


}
