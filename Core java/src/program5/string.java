package program5;

public class string {
	public static void main(String[] args) {
		int i=0;
		String s1="JAVA is Simple";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String[] words=s1.split("\\s");	
		for(String w:words){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		
		
		String[] words1=s1.split("\\s");
		for(String w:words1){  
			System.out.println(w); 
		}

StringBuilder words2= new StringBuilder("JAVA is Simple");
		
		Object words21;
		System.out.println("String = " + words2.toString());
		StringBuilder reverseStr = words2.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		
		//Total Length
		System.out.println("length of string " + s1.length());

	}

}
