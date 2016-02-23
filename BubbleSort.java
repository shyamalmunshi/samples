package algos;

import java.util.Arrays;

public class BubbleSort {
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
	
	//bubble sort

	void bubbleSort(int [] array){
	int i=0,N;
	N = array.length-1;
	boolean flag = true; // for optimization , avoids the last iteration

		while(flag){
			flag = false;
			for (i=0;i<N;i++){
				if (less(array[i], array[i+1])){
					swap(array,i,i+1);
					flag = true;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,15,1,8,20}; 
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(array);
	}

}
