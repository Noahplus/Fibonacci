package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		for(int i=1;i<=n;i++) {
			int j = Fibonacci.of(i);
			System.out.println("Fibonacci("+i+")="+j);
		}
	}
	public static int of(int n){
		int [] arr = new int[n+1];
		 arr[0]=0;
		 arr[1]=1;
		for(int k =2; k<arr.length;k++) {
			arr[k] = arr [k-2] + arr[k-1]; 
		}
		return arr[n];
	}
}
