
import java.util.Arrays;


public class QuickSort {
	
	public QuickSort(int [] array){
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
		
	}

	void swap(int [] a, int min, int curr_min){
		
		int temp;
		temp = a[min];
		a[min] = a[curr_min];
		a[curr_min] = temp;
	}
	//Partition

	int partition (int [] array, int start, int end){
		
		int pivot = array[end];
		int pIndex = start;
		for (int i = start; i<end; i++){
			if(array[i] < pivot){
				swap (array, i,pIndex);
				pIndex++;
			}
		}
		swap(array, pIndex,end);
		return pIndex;
	}

	//QuickSort

	void quickSort(int [] array, int start, int end){
		if(end<start){
			return;
		}
		int idx = partition(array, start, end);
		quickSort (array, start, idx-1);
		quickSort (array, idx+1, end);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {45,23,11,89,77,98,4,28,65,43};
		System.out.println(Arrays.toString(a));
		//Randomize array to guarantee O(n log n)
		new QuickSort(a);
	}

}
