package control4;

public class Recurse {
	/**
	* Returns the first character of the given String.
	*/
	public static char first(String s) {
	return s.charAt(0);
	}
	/**
	* Returns all but the first letter of the given String.
	*/
	public static String rest(String s) {
	return s.substring(1);
	}
	/**
	* Returns all but the first and last letter of the String.
	*/
	public static String middle(String s) {
	return s.substring(1, s.length() - 1);
	}
	/**
	* Returns the length of the given sing.
	*/
	public static int length(String s) {
	return s.length();
	}
	
	public static void printString(String s) {
	      if(length(s) != 0) {
	    	  System.out.println(first(s));
	    	  printString(rest(s));
	      }
	}
	
	public static void printBackward(String s){
	      if (length(s) != 0){
	         printBackward(rest(s));
	         System.out.println(first(s));
	      }
	   }

	   public static String reverseString(String s){
	      if (length(s) != 0){
	         return reverseString(rest(s)) + first(s);
	      }
	      return "";
	   }

	   public static boolean isPalindrome(String s){
	      if (length(s) == 1){
	         return true;
	      } 
	      else if (length(s) == 2){
	         return first(s) == first(rest(s));
	      } 
	      else {
	         return first(s) == first(reverseString(rest(s))) && isPalindrome(middle(s));
	      }
	   }
	   

      
      
		
		
	
	
	public static void main(String[] args) {
		System.out.println(first("0 is the first argument"));
		System.out.println(rest("This return everything after Th"));
		System.out.println(middle("This return everything after Th and length-1 x"));
		System.out.println(length("StringLength"));
		printString("Vertical");
		printBackward("Vertical");
		String backwards = reverseString("coffee");
		System.out.println(backwards);
		if(isPalindrome("oottttoo"))
		 System.out.println("True");
		
	}

}