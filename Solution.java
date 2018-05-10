import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static long results(int[] arr, int maximum) {
		LinkedList<Long> list = new LinkedList<Long>();
		for (int i = 0; i < arr.length - 1; i++) {
			list.add((long) arr[i]);
		}
		Collections.sort(list);

		long result = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			long max = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[j] - arr[i]) > max) {
					max = arr[j] - arr[i];

					if (maximum == arr[j]) {
						 break;
					}
				}
			}
			result += max;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long[] tradeMax = new long[t];
		
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			int max = 0;
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
				if (arr[arr_i]>max){
					max = arr[arr_i];
				}
			}
			tradeMax[a0] = results(arr, max);
		}
		for (long n : tradeMax) {
			System.out.println(n);
		}
		in.close();
	}
}
