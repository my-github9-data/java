package solution02;

import java.util.Comparator;

public class Main {

	static <T> void selectionSort(T[] arr, Comparator<T> c) { 
	    for(int i=0; i<arr.length-1; i++) { 
	        for(int j=i+1; j<arr.length; j++) { 
	            if(c.compare(arr[i], arr[j]) > 0) { 
	               T temp = arr[i]; 
	               arr[i] = arr[j]; 
	               arr[j] = temp; 
	            } 
	        } 
	    } 
	} 
	
	public static void main(String[] args) {
	
		Double[] arr = { 2.2, 5.5, 7.7, 1.1, 3.3 }; 
		System.out.println("Before Selection Sort :");
	    for (Double double1 : arr) {
			System.out.println(double1);
		}
	    
	    class DoubleSelectionSort implements Comparator<Double>{

			@Override
			public int compare(Double a, Double b) {
				int diff = Double.compare(a, b);
				return diff;
			}
	    	
	    }

	    DoubleSelectionSort d = new DoubleSelectionSort();
	    selectionSort(arr, d);
	    System.out.println("After Selection Sort :");
	    for (Double double1 : arr) {
			System.out.println(double1);
		}
	    
	}

}
