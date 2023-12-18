package variables;



public class Scannertype {

	public static void main(String[] args) {
		
		   String s="Hello abarna";
		   String ss="Hello abarna varathan";
		   String s1=new String("Hello abarna varathan");
		   System.out.println("Concatenate :"+s.concat(s1));
		   System.out.println("Length :"+s.length());
		   System.out.println("Indexof :"+ ss.indexOf(s));
		   System.out.println("Lastindex of :"+s1.lastIndexOf('4'));
		   System.out.println("Lowercase :"+ s.toLowerCase());
		   System.out.println("Uppercase :"+s.toUpperCase());
		   System.out.println("Character :"+s1.charAt(1));
		   System.out.println("Compare to ignore :"+ss.compareToIgnoreCase(s1));
		   System.out.println("Compare To :"+s1.compareTo(s));
		  System.out.println("Substring :"+s1.substring(2,5));
		   System.out.println("Replace :"+s.replace('a', 'v'));
		   System.out.println("Contains :"+s.contains(ss));
		   System.out.println("Ends with :"+ s1.endsWith("han"));
		   System.out.println("Equals :"+s1.equals(ss));
		
		

	}

}
