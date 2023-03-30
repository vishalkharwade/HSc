package practice;

public class maxvalueArray {
public static void main(String[] args) {
	 int[] array = {12, 43, 56, 23, 67, 89, 34, 23}; // example array
     int max = array[0]; // initialize max to the first element of the array

     for (int i = 1; i < array.length; i++) {
         if (array[i] > max) {
             max = array[i];
         }
     }

     System.out.println("The maximum value in the array is: " + max);
}
}
