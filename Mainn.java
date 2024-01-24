/*
Suhani Thakur
22070126115
AIML B2
*/


import java.io.*;
import java.util.*;
import java.io.IOException;

//using bufferedreader to get string of numbers (array) it takes ip as string,scanner to take size of array, arrays should be dynamic	, even and odd and to increment them, count=0, initialize array 
// string array as numbers are in a single string, \s is space \-escape character, s+ because there can be multiple space characters , in regular expression, * means 0 or more, + means 1 or more, convert string to double

public class Mainn {
    public static void main(String[] args) throws IOException {

        Input input = new Input();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();

        int index_even = 0;
        int index_odd = 0;
        int count = 0;
		
        double[] even = new double[size];
        double[] odd = new double[size];
        double[] inputArray = input.arr(size);

        for (int j = 0; j < size; j++) {
            if (inputArray[j] % 2 == 0) {
                even[index_even] = inputArray[j];
                index_even++;
            } else {
                odd[index_odd] = inputArray[j];
                index_odd++;
            }
        }

        System.out.println("Even numbers are:");
        for (int k = 0; k < index_even; k++) {
            System.out.println(" " + even[k]);
        }

        System.out.println("Odd numbers are:");
        for (int m = 0; m < index_odd; m++) {
            System.out.println(" " + odd[m]);
        }
    }
}
	