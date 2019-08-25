package org.unit;


public class Duplicate {

public static void main(String[] args) {
	int a[]= {10,2,20,10,2,5};
	int len=a.length;
	for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++) {
			if(a[i]==a[j]) {
				i++;
			}
		}
	}
		int[]b=removeDuplicates(a);
		for(int i:b) {
			System.out.println(i);
				
			}
		}

private static int[] removeDuplicates(int[] a) {
	// TODO Auto-generated method stub
	return null;
}}
	
