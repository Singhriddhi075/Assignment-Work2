package Assignment2;

import java.util.Scanner;
import java.util.Stack;

public class Stackspan {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = scn.nextInt();
		}
		int[] span=new int[arr.length];
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				s.pop();
			}

			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}

			s.push(i);

		}

		for (int val : span) {
			System.out.print(val + " ");
		}
		System.out.println("END");

	}

}
