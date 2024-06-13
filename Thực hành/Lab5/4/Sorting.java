import java.util.*;
public class Sorting{
	public static void printArray(int n, int[] a){
		System.out.printf("%d: ", n);
		for(int i = 0; i < a.length; i++){
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
	public static void selectionSort(int[] a) {
			for (int i = 0; i < a.length - 1; i++) {
				int index = i; 

				for (int j = i + 1; j < a.length; j++) {
					if (a[j] < a[index])
						index = j;
				}
				
				int temp = a[index];
				a[index] = a[i];
				a[i] = temp;
				printArray(i, a);
			}
	}
	
	public static void bubbleSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			boolean issorted = true;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j+1]) { // the larger item bubbles down (swap)
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					issorted = false;
				}
			}
			if (issorted) return;
			printArray(i, a);
		}
	}
	
	public static void insertionSort(int[] a) {
		for (int i = 1;i < a.length; i++) { 	
			int next = a[i];
			int j; 
			
			for (j = i-1; j >= 0 && a[j] > next; j--)
				a[j+1] = a[j];
			
		a[j+1] = next;
		printArray(i, a);
		}
	}
	public static void main(String[] args){
		
		int []a1 = {3, 1, 4, 6, 2, 5};
		System.out.print("Selection Sort - With array a = {3, 1, 4, 6, 2, 5}\n");
		selectionSort(a1);
		
		int []a2 = {5, 3, 4, 2, 6, 1};
		System.out.print("Bubble Sort - With array a = {5, 3, 4, 2, 6, 1}\n");
		bubbleSort(a2);
		
		int []a3 = {5, 1, 2, 6, 4, 3};
		System.out.print("Insertion Sort - With array a = {5, 1, 2, 6, 4, 3}\n");
		insertionSort(a3);
	}
}