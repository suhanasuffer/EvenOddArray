import java.io.*;
import java.util.*;

class Inputt {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	public double[] arr(int size) throws IOException {
		double[] inputArray = new double[size];
		String array = br.readLine();
		String[] input = array.trim().split("\\s+");
		
		for(int i = 0; i < size ; i++) {
			inputArray[i] = Double.parseDouble(input[i]);
		}
		return inputArray;
	}
}