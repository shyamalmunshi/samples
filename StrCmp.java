package strings;

public class StrCmp {
	int strCompare(String string1,String string2){
		int i = 0;
		if (string1=="" && string2 ==""){
			return 0;
		}
		if (string1==""){
			return -1;
		}
		if (string2==""){
			return 1;
		}

		while (i<string1.length())	{
			int val = string1.charAt(i);
			int val2 = string2.charAt(i);

			if (val>val2){
				return 1;
			}			
			if (val<val2){
				return -1;
			}
			i++;
		}
		return 0;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrCmp s = new StrCmp();
		
		System.out.println(s.strCompare("2", "2"));
	}

}
