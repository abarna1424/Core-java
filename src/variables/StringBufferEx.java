package variables;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Hello");
		System.out.println("String Buffer Append :"+s.append("abarna"));// append joins the word
		
		StringBuilder ss= new StringBuilder("Hello");
		System.out.println("String Builder Append :"+ss.append("abarna"));
	//	System.out.println("Reverse :"+ ss.reverse());
        
		System.out.println("Insert :"+ ss.insert(5,  "varathan"));
		
		System.out.println("Capacity method :"+ s.capacity());
	}

}
