package com.strings.prgms;

public class SpiralPatterns {
	public static void main(String[] args) {
		int si=0;
		int n=7;
		int ei=n-1;
		int mid=ei/2;
		int rounds=mid,num=n*n; 		
		int[][] arr= new int[n][n];
		
		for(int i=0;i<rounds-1;i++) {
			//L2R
			for(int j=si;j<=ei;j++) {
					arr[si][j]=num--;					
			}				
			//T2B
			for(int k=si+1;k<=ei;k++) {
				arr[k][ei]=num--;
			}			
			//R2L
			for(int m=ei-1;m>=si;m-- ) {
				arr[ei][m]=num--;
			}			
			//B2T
			for(int p=ei-1;p>si;p-- ) {
				arr[p][si]=num--;
			}
			si++;
			ei--;
			rounds++;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j] < 10) {
					System.out.print(" 0"+arr[i][j]);
				}
				else
					System.out.print(" "+arr[i][j]);
			
			}
			System.out.println();
		
		}
		
	}
}


