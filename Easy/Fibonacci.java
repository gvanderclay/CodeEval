package Easy;

public class Fibonacci {

	public static void main(String[] args){
		System.out.println(fibRec(1000));
	}
	
	
	public static int fibRec(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		return fibRec(n - 2) + fibRec(n - 1);
	}
}
