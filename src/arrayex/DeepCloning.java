package arrayex;

public class DeepCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray= {3,2,5,6};
		int[] arrayClone=intArray.clone();
		
	//Deep cloning applied for aingle dimensional -> store in different memory location
		System.out.println(intArray == arrayClone);
		
		System.out.println("Show the Array Elements :");
		for (int i=0;i<arrayClone.length;i++) {
			System.out.println(arrayClone[i]+" ");
		}
	}

}
