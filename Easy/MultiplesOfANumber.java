package Easy;

public class MultiplesOfANumber {

	public static void main(String[] args){
		MultiplesOfANumber a = new MultiplesOfANumber();
		System.out.println(a.mult(17,16));
	}
	
	
	int mult(int x, int n){
		int mult = n;
		for(int i = 0; i < x; i++){
			if(i * n > x)
				return i * n;
		}
		return mult;
	}
	
}
