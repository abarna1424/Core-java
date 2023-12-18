package collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Integer> ll=new LinkedList<>();
        ll.add(24);
        ll.addFirst(23);
        ll.add(3);
        ll.offerLast(14);
        ll.addLast(144);
        System.out.println("Elements in Linked List :"+ll);
        System.out.println("Elements in Linked List :"+ll.pollFirst());
        System.out.println("Elements in Linked List :"+ll);
        System.out.println("Elements in Linked List :"+ll.getFirst());
        System.out.println("Elements in Linked List :"+ll);
	}

}



//LinkedList<Integer> ll=new LinkedList<>();
//ll.add(10);
//ll.addFirst(23);
//ll.add(6);
//ll.offerLast(50);
////ll.addLast(40);
//System.out.println("Element in Lined List : "+ll);
//System.out.println("Element in pullfirst : "+ll.pollFirst());
//System.out.println("Element in Lined List : "+ll);
////System.out.println("Element in Lined List : "+ll.getFirst());
////System.out.println("Element in peekfirst Linked List : "+ll.peekFirst());




//
//Stack<Integer> s=new Stack<>();
//s.push(10);
//s.push(12);
//s.push(14);
//System.out.println("My elements:"+s);
//s.pop();
//System.out.println("After Pop my elements:"+s);
//System.out.println("Top of the elment:"+s.peek());//top of elemnt
//System.out.println(s.isEmpty());