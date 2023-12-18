package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "React Js");
		hm.put(2, " Js");
		hm.put(3, "Core Java");
		hm.put(4, "python");
		hm.put(4, "python");
		hm.put(null, "c++");
		hm.putIfAbsent(5,".net");// It is non synchornized,allow only one null
		System.out.println("HashMap is :" + hm);
        System.out.println(hm.containsKey(24));
	}
}
        
//  HashMap<Entry<Integer, String> > new_Iterator= hm.entrySet().iterator();
//  //  Iterating every set of entry in the HashMap
//    while (new_Iterator.hasNext()) {
//     Map.Entry<Integer, String> new_Map
//        = (Map.Entry<Integer, String>)
//               new_Iterator.next();
//     // Displaying HashMap
//     System.out.println(new_Map.getKey() + " = "+ new_Map.getValue());	
//    }
//	}
//
//}





//Iterator<Entry<Integer, String> > new_Iterator= h.entrySet().iterator();
////Iterating every set of entry in the HashMap
//while (new_Iterator.hasNext()) {
// Map.Entry<Integer, String> new_Map
//     = (Map.Entry<Integer, String>)
//           new_Iterator.next();
// // Displaying HashMap
// System.out.println(new_Map.getKey() + " = "+ new_Map.getValue());	
//}
//
//
//h.forEach(
//         (key, value)
//             -> System.out.println(key + " = " + value));
