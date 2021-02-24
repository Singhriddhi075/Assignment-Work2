package Assignment2;

import java.util.Scanner;

public class manmohanlovespattern1 {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int row=1;
	int nst=1;
	int val;
	while(row<=n) {
		 val=1;
		if(row==1) {
			System.out.print(1);
			
		}else {
			if(row==n-2||row==n) {
				for(int cst=1;cst<=nst;cst++) {
					if(cst==1||cst==nst) {
						System.out.print(val);
					}else {
						System.out.print(0);
					}
				}
			
			}
		else {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val);
		}
		}
		}
		System.out.println();
		nst++;
		row++;
	}
  
	}

}
