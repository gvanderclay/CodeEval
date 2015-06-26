package Moderate;

import java.io.*;
import java.util.*;
public class LongestLines {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int num = Integer.parseInt(buffer.readLine());
        String[] lines = new String[num];
        lines[0] = buffer.readLine();
        lines[1] = buffer.readLine();
        while ((line = buffer.readLine()) != null) {
            if(line.length() > lines[0].length()){
            	lines[1] = lines[0];
            	lines[0] = line;
            }
            else if(line.length() > lines[1].length()){
            	lines[1] = line;
            }
        }
        System.out.println(lines[0] + "\n" + lines[1]);
    }
    
    public static String longestLines(int num, ArrayList<String> lines){
    	String[] longestLines = new String[num];
    	longestLines[0] = lines.get(0);
    	longestLines[1] = lines.get(1);
    	for(int i = 2; i < lines.size(); i++){
    		String line = lines.get(i);
    		if(line.length() > longestLines[0].length()){
    			longestLines[1] = longestLines[0];
    			longestLines[0] = line;
    		}
    		else if(line.length() > longestLines[1].length()){
    			longestLines[1] = line;
    		}
    	}
    	String value = longestLines[0] + "\n" + longestLines[1];
    	return value;
    }
}