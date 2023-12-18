package palindrome;

public class Mathpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Hello varathan how are you?";

		str = str.trim();

//	        String[] words = str.split("\\s+");
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(i+"Words :"+words[i]);
		}

		int wordCount = words.length;
		System.out.println("Number of words: " + wordCount);

	}

}
