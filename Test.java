package fibonacci;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		for(int i=1;i<=n;i++) {
			int j = fibonacci(i);
			System.out.println("Fibonacci("+i+")="+j);
		}
	}
	public static int fibonacci(int n){
		if(n==1||n==2) {
			return 1;
		}
		else return fibonacci(n-1)+fibonacci(n-2);
	}

}
