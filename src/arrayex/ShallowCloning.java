package arrayex;

public class ShallowCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray= {{3,2,5,6},{4,5,3}};
		int[][] arrayClone=intArray.clone();
		
	//Shallow cloning applied for one dimensional -> store in different memory location
		System.out.println(intArray[0] == arrayClone[1]);
		
		System.out.println("Show the Array Elements :");
		for (int i=0;i<arrayClone.length;i++) {
			for(int j=0;j<arrayClone.length;j++)
			System.out.println(arrayClone[i][j]+" ");
		}
		System.out.println();
		
		
		
//		c[i][j] = 0;
//        for (int k = 0; k < size; k++) {
//          c[i][j] += a[i][k] * b[k][j];
//        }
//        System.out.print(c[i][j] + " ");
		
		

	}

}
