package q3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class test {
	public static void main(String[] args) {
		Student [] arr= new Student[6];
		arr[0]= new Student( 5 , "Sarvesh" , "Kolhapur", 90.0);
		arr[1]= new Student( 3 , "Onkar" , "Jaysingpur", 91.0);
		arr[2]= new Student( 1 , "Pratik" , "Mumbai", 90.5);
		arr[3]= new Student( 2 , "Raj" , "Mumbai", 90.5);
		arr[4]= new Student( 4 , "Soma" , "Kolhapur", 91.5);
		arr[5]= new Student( 6 , "Vinayak" , "Karad", 90.0);
		
		class CustomComparator implements Comparator<Student> {
			public int compare(Student s1, Student s2) {
			int diff = -(s1.getCity().compareTo(s2.getCity()));
				if(diff == 0)
				diff= Double.compare(s2.getMarks(), s1.getMarks());
					if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
			return diff;
			}
			}
		
		System.out.println("Array : ");
		for (Student s : arr)
			System.out.println(s);
		
		
//		Arrays.sort(arr);
//		
//		
//		for (Student s : arr)
//			System.out.println(s);
//		
//		
	}

}
