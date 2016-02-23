package algos;

public class BinarySearch {
	int binarySearch (int [] a, int key){
		
		int low = 0,high = 0,mid = 0;

		high = a.length-1;

		while (low < high){
			mid = low + (high-low)/2;

			if (key < a[mid]){
				high = mid-1;
			}	
			else if(key > a[mid]){
				low = mid+1;
			}
			else
				return mid;

		}
		return -1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int [] array = {0,1,2,3,6};
		
		System.out.println(bs.binarySearch(array, 3));
	}

}
