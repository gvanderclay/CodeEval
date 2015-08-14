package Easy;

public class BitPositions {

	public static void main(String[] args){
		System.out.println(bitPos(125,1,2));
	}
	
	public static boolean bitPos(int n, int p1, int p2){
		int pow1 = (int) Math.pow(2, p1 - 1);
		int pow2 = (int) Math.pow(2, p2 - 1);
		
		if((n/pow1) % 2 == (n/pow2) % 2){
			return true;
		}
		
		return false;
	}
}
