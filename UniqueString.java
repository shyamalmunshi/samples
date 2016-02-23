package strings;

public class UniqueString {
// Time: O(n) | Space: O(1)
	//string has all unique chars- Consider ASCII

	boolean isUnique (String input) {
		boolean[] charset = new boolean [256];

		if (input.length() > 256){
			return false;
		}

		
		for (int i = 0; i<input.length();i++){
			int value = input.charAt(i);
			if (charset[value]){
				return false;
			}
			charset[value] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueString us = new UniqueString();
		System.out.println(us.isUnique("abcdefghijklmmnopqrstuvwxyz"));
	}

}
