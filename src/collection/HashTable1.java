package collection;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<Integer, String> ht=new Hashtable<>();
       ht.put(1,"React Js");
       ht.put(2," Js");
       ht.put(3,"Core Java");
       ht.put(4,"python");// It will take a value if key is duplicate
       ht.put(4,"python");
       ht.put(5,null);//synchornized,not allowed both null value and null key
       System.out.println("HashTable is :"+ht);
	}

}
