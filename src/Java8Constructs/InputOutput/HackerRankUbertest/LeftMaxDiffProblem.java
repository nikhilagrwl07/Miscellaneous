package Java8Constructs.InputOutput.HackerRankUbertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Nikhil Agrawal on 7/16/17.
 */
public class LeftMaxDiffProblem {

	private static StringTokenizer st;

	public static void nextLine(BufferedReader br) throws IOException {
		st = new StringTokenizer(br.readLine());
	}

	public static int nextInt() {
		return Integer.parseInt(st.nextToken());
	}

	public static String next() {
		return st.nextToken();
	}

	public static long nextLong() {
		return Long.parseLong(st.nextToken());
	}

	public static double nextDouble() {
		return Double.parseDouble(st.nextToken());
	}

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		nextLine(br);
		int len = nextInt();
		int[] arr = new int[len];

		nextLine(br);
		//    String[] split = st.toString().split("\\s+");

		for (int i = 0; i < len; i++) {
			//      System.out.println("i = " + i);
			int x = Integer.valueOf(st.nextToken());
			//      System.out.println(x);
			arr[i] = x;
		}

		// code pre-computation


		nextLine(br);
		int q = nextInt();
		//    BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < q; i++) {
			nextLine(br);
			//      String[] split2 = nextInt(); st.toString().split("\\s+");
			int lt = nextInt();
			int rt = nextInt();
			System.out.println(maxDiff(arr, lt, rt));
			// call computation
			//      bos.write(days+"\n");
		}

		//    bos.flush();
	}

	public static int maxDiff(int arr[], int i, int j) {
		// Create a diff array of size n-1. The array will hold
		// the difference of adjacent elements
		int leftMax[] = new int[j - i + 1];
		int count = 0;
		leftMax[count] = arr[i];

		for (int k = i + 1; k <= j; k++) {
			count++;
			leftMax[count] = Math.max(arr[k], leftMax[count - 1]);
		}


		// Now find the maximum op subarray in diff array
		int max_diff = Integer.MIN_VALUE;
		int c2 = 0;
		for (int l = i; l <= j; l++) {
			max_diff = Math.max(max_diff, leftMax[c2] - arr[l]);
			c2++;
		}

		return max_diff;
	}

}



