package Easy;

public class SumOfDigits {

	
	public static void main(String[] args){
		System.out.println(sumOfInts(525));
	}
	
	public static int sumOfInts(int num){
		int s = 0;
		while(num > 0){
			s += num % 10;
			num /= 10;
		}
		return s;
	}
}
