package Easy;

public class LargestPrimePali {

	
	public static void main(String[] args){
		String champ = "";
		for(int i = 0; i < 1000; i++){
			if(isPali(i) && isPrime(i)){
				champ = i + "";
			}
		}
		System.out.println(champ);
	}
	
	public static boolean isPali(int n){
		String num = n + "";
		int size = num.length();
		for(int i = 0; i < size; i++){
			if(num.charAt(i) != num.charAt(size - i - 1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(int n) {
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
	}
	
}
