package Easy;
import java.io.*;


public class StringReverse {

	 public static void main (String[] args) throws IOException {
	        File file = new File(args[0]);
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            System.out.println(reverser(line));
	        }
	        buffer.close();
	    }
	 
	 public static String reverser(String input){
		 if(input.trim().isEmpty()){
			 return "";
		 }
		 
		 String[] rev = input.split(" ");
		 
		 String reverse = "";
		 
		 for(int i = rev.length - 1; i >= 0; i--){
			 reverse += rev[i] + " ";
		 }
		 
		 return reverse.trim();
	 }
	
}
