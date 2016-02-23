package algos;

import java.util.Arrays;

public class InsertionSort {
	boolean less (int min, int curr_min){
		if (curr_min<min) {
			return true;
		}
		return false;
	}
	void swap(int [] a, int min, int curr_min){
		
		int temp;
		temp = a[min];
		a[min] = a[curr_min];
		a[curr_min] = temp;
	}	
// Insertion Sort  BC: O(N) WC: O(N^2)
	void insertionSort(int [] array){
		int i,j=0,N;
		N = array.length-1;

		for (i=0;i<N;i++){
			for(j=i;j>0;j--){
				if (less(array[j-1],array[j])){
					swap(array,j-1,j);
				}
			} 
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort is = new InsertionSort();
		int [] array = {5,15,1,8,20};
		is.insertionSort(array);
	}

}
