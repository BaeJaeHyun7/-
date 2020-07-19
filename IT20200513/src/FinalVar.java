
public class FinalVar {
	
	//»ó¼ö
	final int i = 9;
	
	
	
	public void go() {
		
		//i = 10; error
		
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		FinalVar fv = new FinalVar();
		fv.go();
		
		/*int arr[] = new int[10];
		System.out.println(arr[10]);*/
		
		
	}
	
	
	
	

}
