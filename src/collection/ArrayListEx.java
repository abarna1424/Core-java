package collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> al=new ArrayList<>();
        al.add(24);
        al.add(14);
        al.add(12);
        al.add(122);
        al.remove(3);
        al.add(0,14);
        System.out.println("Elements in the array :"+al);
        System.out.println("Elements in the array size :"+al.size());
	}

}


//ArrayList<String> al=new ArrayList<>();
//al.add("Rutika");
//al.add("Pragati");
//al.add("Lekha");
//al.add("Zeba");
//al.add("Angel");
//al.add(1, "Shweta");
//
//al.add("Raj");
//
//System.out.println("My arraylist:"+al);
//al.remove(3);
//System.out.println("My arraylist:"+al);
//System.out.println("First Position : "+al.get(1));
//al.set(2, "Neha");
//System.out.println("My arraylist:"+al.size());
//System.out.println("My arraylist:"+al);
