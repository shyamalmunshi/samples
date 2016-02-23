package algos;

import java.util.Arrays;

public class SelectionSort {
	
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

	//Selection Sort
	void selectionSort(int [] array){
		int i,j,N,min;
		N =array.length-1;

		for(i=0;i<N;i++){
			min = i;
			for (j=i+1;j<N;j++){
				//curr_min = less(array[min],array[j]);
				if (less(array[min],array[j])){
					min = j;
				}			
			}	
			swap(array, i, min);		
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,15,1,8,20}; 
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(array);
	}

}
