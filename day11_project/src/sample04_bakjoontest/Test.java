package sample04_bakjoontest;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		int[] arr = new int[input.length()];

		for (int i = 0; i < input.length(); i++) {
			int cnt = -1;
			for (int j = i-1; j >= 0; j--) {
				if (input.charAt(i) == input.charAt(j)) {
					cnt = i-j;
					break;

				}

			}
			arr[i] = cnt;
		}
		System.out.println(Arrays.toString(arr));

	}
}
