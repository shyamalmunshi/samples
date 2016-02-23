package strings;

public class ReplaceSpace {

	//URL

	void checkSpace(char[] c, int len){
		// First pass, count white spaces

		int i, spacecount, index;
		spacecount = 0;

		
		for (i = 0; i< len; i++){
			if (c[i] == ' '){
				spacecount++;
			}
		}
		// length of new array is 2 times current length + white spaces
		index = len-1 + spacecount * 2;
		if (len<c.length){
			c[len] = '\0';
		}
		for (i = len-1;i>=0;i--){
			// if white space do something
			if (c[i] == ' '){
				c[index] = '0';
				c[index-1] = '2';
				c[index-2] = '%';
				index = index-3; 
			}
			//else
			else{
				c[index] = c[i];
				index--;
			}
		}
		
		System.out.println(String.valueOf(c));

	}

	public static void main(String[] args) {
		String inputstring = "Mr John Smith       ";
		char [] c = inputstring.toCharArray();
		ReplaceSpace urlspacereplace = new ReplaceSpace();
		urlspacereplace.checkSpace(c,13);

	}

}
