package Moderate;

import java.io.*;
import java.util.*;

public class LongestLines {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int num = Integer.parseInt(buffer.readLine());
		ArrayList<String> lines = new ArrayList<String>();
		while ((line = buffer.readLine()) != null) {
			lines.add(line);
		}
		for (int i = 0; i < num; i++) {
			System.out.println(lines.get(i));
		}
	}
}