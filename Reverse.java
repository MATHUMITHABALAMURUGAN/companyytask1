package org.prgm;

public class Reverse {
	static void reverseArray(int a[],int n) {
		int[]b=new int[n];
		int j=n;
		for (int i=0;i<n;i++){
			b[j-1]=a[i];
			j=j-1;	
		}
		for(int k=0;k<n;k++) {
			System.out.println(b[k]);
		}
	}

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		reverseArray(arr,arr.length);

	}

}
