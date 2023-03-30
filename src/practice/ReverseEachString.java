package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class ReverseEachString {
public static void main(String[] args) {
	 List<String> list = new ArrayList<>();
     Set<String> set = new HashSet<>();
     
     // Adding elements to the list and set
     list.add("apple");
     list.add("banana");
     list.add("apple");
     set.add("apple");
     set.add("banana");
     set.add("apple");
     
     System.out.println("List: " + list);   // Output: [apple, banana, apple]
     System.out.println("Set: " + set);     // Output: [banana, apple]
 }
	
}

