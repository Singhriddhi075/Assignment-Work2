package Assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N=scn.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
//		int start = 0;
//		int end = 0;
		int target = scn.nextInt();
		targetsum(arr,target);
//		int i = 0;
//		int j = arr.length - 1;
//		
//		while (i < j) {
//
//			if (arr[i] + arr[j] < target) {
//				i++;
//			} else if (arr[i] + arr[j] > target) {
//				j--;
//			} else {
//				start = arr[i];
//				end = arr[j];
//				i++;
//				j--;
//			}
//
//		}
//
//		System.out.println(start + " and " + end);
//
		

	}
	public static void targetsum(int[] arr,int target) {
		Arrays.sort(arr);
		for(int p=0;p<arr.length;p++) {
			for(int q=p+1;q<arr.length;q++)
			{
				
			
//				for(int k=q+1;k<arr.length;k++) 
					if(arr[p]+arr[q]==target) {
						System.out.println(arr[p] + " and " + arr[q]);
					}
				}
		}
		
		
		
		
		
		
		
		
		
	}

}
