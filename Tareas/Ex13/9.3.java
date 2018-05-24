

public class metodox {
	public static void metodo(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
		char c = string.charAt(i);
		if (c == '(' || c == '[' || c == '{') {
		count++;
		} else if (c == ')' || c == ']' || c == '}') {
		count--;
		}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		metodo("([]]))");
	}
}

/**
 * Output: -2
* Metodo para contar paréntesis 
**/