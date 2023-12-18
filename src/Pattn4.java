
public class Pattn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int r=1;r<=5;r++) {
			for(int c=1;c<=5;c++ ) {
				if(r=1 || r<=5  || c=1  || c<=5) {
					System.out.println("*");
				}else {
					System.out.println("");
				}
			}
			System.out.println();
		}

	}

}



//String str[]= {"Pretha","Roshni","Nandhini"};
//for(int i=0;i<str.length;i++) {
//	System.out.print(str[i]+" ");
//}
//for(String str1:str) {
//	System.out.println(str1);
//}