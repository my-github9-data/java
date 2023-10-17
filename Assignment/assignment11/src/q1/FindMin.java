package q1;

public class FindMin {
	
	public static <T extends Number> void findMin(T[] arr) {
		System.out.println("array:");
		for (T ele : arr) {
			System.out.println(ele);
			
		}
	}
	
	public static void main(String[] args) {

		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		findMin(arr1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		findMin(arr2);
	}
}
