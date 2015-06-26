package Easy;

public class StringMasker {
	
	public static void main(String[] args){
		System.out.println(mask("hello", "11001"));
		
	}
	
	public static String mask(String word, String binary){
		StringBuilder wordBuilder = new StringBuilder(word);
		
		for(int i = binary.length() - 1; i >= 0; i--){
			if(binary.charAt(i) == '1'){
				wordBuilder.setCharAt(i, Character.toUpperCase(wordBuilder.charAt(i)));
			}
			
		}
		
		return wordBuilder.toString();
	}
	
}
