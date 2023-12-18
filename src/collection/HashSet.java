package collection;

import java.util.LinkedHashSet;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> even=new LinkedHashSet<>();
		even.add(null);
		even.add(24);        //HashSet used for avoid repeating numbers
		even.add(14);
		even.add(12);
		even.add(24);
		even.add(null);
		System.out.println("Elements in HashSet :"+even);
		
		
		LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(24);
        
        
        //Union of two set
        numbers.addAll(even);
        System.out.println("Union of Elements :"+numbers);
        
        
        numbers.retainAll(even);
        System.out.println("Intersection of Elements :"+numbers);
        
        numbers.removeAll(numbers);
        System.out.println("Difference in Elements :"+numbers);
	}

}


//HashSet<Integer> even = new HashSet<>();
//even.add(null);
//even.add(2);
//even.add(4);
//even.add(2);
//even.add(8);
//even.add(null);
//System.out.println("HashSet1: " + even);
//
//HashSet<Integer> numbers = new HashSet<>();
//numbers.add(1);
//numbers.add(3);
//numbers.add(2);
//System.out.println("HashSet2: " + numbers);
////
////// Union of two set
////numbers.addAll(even);
////System.out.println("Union is: " + numbers);
////numbers.retainAll(even);
////System.out.println("Intersection is: " + numbers);
//numbers.removeAll(even);
//System.out.println("Diffrence : " + numbers);
