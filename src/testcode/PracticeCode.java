package testcode;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PracticeCode {



	    // Complete the sockMerchant function below.
	    static int sockMerchant(int n, int[] ar) {	        
	    	int number1=ar[0];
	        int count=0;
	     for(int i=1;i<n;i++)
	     {
	     for(int j=i;j<n;j++)
	     {
	       if(number1==ar[j])
	           count++;
	     }
	     number1=ar[i];
	     }
	     return count;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);

	       // bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	        //bufferedWriter.close();
           System.out.println(result);
	        scanner.close();
	    }
	}


