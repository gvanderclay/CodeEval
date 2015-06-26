package Easy;
import java.io.*;

public class FizzBuzz {

	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] in = line.split(" ");
            fizzBuzz(in[0], in[1], in[2]);
            System.out.println();
        }
        buffer.close();
    }

	public static void fizzBuzz(String ex, String why, String scount) {

		int x = Integer.parseInt(ex);
		int y = Integer.parseInt(why);
		int count = Integer.parseInt(scount);
		
		for (int i = 1; i <= count; i++) {
			if (i % x == 0 && i % y == 0) {
				System.out.print("FB");
			} else if (i % x == 0) {
				System.out.print("F");
			} else if (i % y == 0) {
				System.out.print("B");
			}
			else{
				System.out.print(i);
			}
			System.out.print(" ");
		}

	}

}
