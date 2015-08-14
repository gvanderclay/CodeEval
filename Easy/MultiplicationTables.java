package Easy;

public class MultiplicationTables {

	public static void main(String[] args){
		table();
	}
	
	public static void table(){
		for(int y = 1; y <= 12; y++){
			for(int x = 1; x <= 12; x++){
				System.out.printf("%4d", x * y);
			}
			System.out.println();
		}
	}
	
}
