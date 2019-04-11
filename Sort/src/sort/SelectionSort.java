package sort;

public class SelectionSort {
	public static void main(String[] args) {
		 int[] arr = {3,8,9,22,11,90};
//		 selectionSort(arr);
		
		
	}
	/**
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++) {
			 for(int j = i + 1;j < arr.length;j++) {
				 if(arr[j] < arr[i]) {
					 swap(arr,j,i);
				 }
			 }
		 }
		 for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] swap(int[] arr,int j,int i) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		return arr;
		
	}
}