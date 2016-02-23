package arrays;

public class FindIndexOf {

	int indexof(int[] input){
		int i;
		int value = -1;
		int len= input.length;
		
		for (i=0;i<len-1;i++){

			if (input[i]==input[i+1]) {
				value = i;
				break;
			}//return value;		
		}
		return value;
		
	}
	public static void main(String[] args) {
		
		int array []= {1,2,3,4,5,6,7,7,8,8};
		FindIndexOf fin = new FindIndexOf();
		System.out.println("The first occurence of value: "+array[fin.indexof(array)] + " is at index: "+fin.indexof(array));
	}

}
