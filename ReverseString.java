package strings;

public class ReverseString {

	String reverse (String input){
		int i = 0;
		int j=0;
		j= input.length()-1;
		char[]temp = new char[j];
		temp =input.toCharArray();
		
		if (input.length() == 1){
			return input;
		}
		while (i<j){
			
			char temp1 = temp[i];
			temp[i] = temp[j];
			temp[j] = temp1;
			i++;
			j--;

		}
		String ret = String.valueOf(temp);
		return ret;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString rs = new ReverseString ();
		System.out.println(rs.reverse("hello"));
	}

}
