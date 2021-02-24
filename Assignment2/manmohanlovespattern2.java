package Assignment2;

import java.util.Scanner;

public class manmohanlovespattern2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int val;
		while(row<=n) {
			if(row==1) {
				System.out.print("1");
				
			}else {
				
			
			for(int cst=1;cst<=nst;cst++) {
				if(cst==1||cst==nst) {
					System.out.print(row);
					System.out.print('\t');
				}else {
					System.out.print("0");
					System.out.print('\t');
				}
			}
			}
			System.out.println();
			nst++;
			row++;
		}
	
		
	}

}
