package com.strings.prgms;

public class String_diffprgms {

	public static void main(String[] args) {
		
		String str="Sun rises in East";
		String[] sarr=str.split(" ");
		
		
		//Reverse the string
		for(int i=0;i<sarr.length;i++){
			char[] carr=sarr[i].toCharArray();
			for(int j=carr.length-1;j>=0;j--) {
				System.out.print(carr[j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		
		//Word Count
		for(int i=0;i<sarr.length;i++) {
			System.out.print(sarr[i]+""+sarr[i].length()+" ");
		}
		System.out.println();

		//Swapping of words
		String temp="";
		temp=sarr[0];
		sarr[0]=sarr[sarr.length-1];
		sarr[sarr.length-1]=temp;
		for(int i=0;i<sarr.length;i++) {
			System.out.print(sarr[i]+" ");
		}
		System.out.println();
		
		//Swapping & Reversing of words
		String temp1="";
		temp1=sarr[0];
		sarr[0]=sarr[sarr.length-1];
		sarr[sarr.length-1]=temp1;
			
		for(int i=0;i<sarr.length;i++) {
			char[] carr=sarr[i].toCharArray();
			if(i==0 || i==3) {
				for(int j=carr.length-1;j>=0;j--) {
					System.out.print(carr[j]);
				}
				System.out.print(" ");
			}
			else {
				for(int j=0;j<carr.length;j++) {
					System.out.print(carr[j]);
				}
				System.out.print(" ");
			}		
			
		}		
		
	}

}
