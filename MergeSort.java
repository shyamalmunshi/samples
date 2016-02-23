package algos;

import java.util.Arrays;

public class MergeSort {

	int [] aux;
	//int [] array;
	
	public MergeSort(int [] array){
		//this.array = array;
		aux = new int [array.length];
		mergeSort(array);
		System.out.println("Array after Merge Sort: " +Arrays.toString(array));
	}
	
	void merge( int []a, int [] left, int [] right){

		int i,j,k,min_index,max_index,N;

		i = 0;
		j = 0;
		k = 0;
		N = a.length;	
		min_index = left.length;
		max_index = right.length;
		// Copy elements to an aux array
		//int [] aux = new int[a.length];
		for (int n = 0; n < N ;n++){
			aux[n] = a[n];
		}

		while (i < min_index && j < max_index){
			if ( left[i] < right[j]){
				aux[k] = left[i];
				i++;
				//k++;
			}
			else if (left[i] > right[j]){
				aux[k] = right[j];
				j++;
				//k++;
			}
			k++;
		}
		while (i < min_index){
			aux[k] = left[i];
			i++;
			k++;
		}
		while (j < max_index){
			aux[k] = right[j];
			j++;
			k++;
		}
		for (int z = 0 ; z < N; z++){
			a[z] = aux[z];
		}
	}

	void mergeSort(int [] array){
		
		int N = array.length;
		if (N < 2){
			return;
		}
		int mid = (int)N/2;
		int [] left = new int [mid];
		int [] right = new int [N-mid];

		for (int i = 0; i < mid ; i++){
			left[i] = array[i];
			//i++;
		}
		for (int i = mid; i<N; i++ ){
			right[i-mid] = array[i];
			//i++;
		}
		mergeSort(left);
		mergeSort(right);
		merge(array, left, right);
		//System.out.println(Arrays.toString(aux));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {45,23,11,89,77,98,4,28,65,43};
		//MergeSort ms = 
		System.out.println("Array before Merge Sort: " +Arrays.toString(a));
		new MergeSort(a);
		//ms.mergeSort(a);
	
	}

}
