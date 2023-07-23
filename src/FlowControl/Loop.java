package FlowControl;

public class Loop {

	public static void main(String[] args) {
		
		int n = 5; int sum = 0; int s = 1000;
		
		//for loop
		
		for(int i = 1; i <=n ; i++) {
			System.out.println("Java is fun");
		}
		
		for (int j = 1; j <=n; ++j) {
			System.out.println(j);
		}
		
		
		for(int r = 1; r<= s; ++r) {
			sum +=r;
			
		}
		System.out.println("sum =" +sum);
		
	}

}
