package Easy;

public class SumOfPrimes {

	public static void main(String[] args){
		int output = 0;
		int count = 0;
		int number  = 2;
		while(count < 1000){
			if(isPrime(number)){
				
				output += number;
				

				count++;
			}
			number++;
		}
		System.out.println(output);
	}
	
	 private static boolean isPrime(final int number) {
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	/*public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n % 2 == 0){
	    	return false;
	    }
	    //if not, then just check the odds
	    for(int i = 3; i * i <= n; i += 2) {
	        if(n %  i == 0)
	            return false;
	    }
	    return true;
	}*/
	
}
