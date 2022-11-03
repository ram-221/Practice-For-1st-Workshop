package com.bridgelabz;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,4,7,},
				{8,5,6,1},
				{2,4,3}
		};
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a.length;++j) {
				System.out.println(a[1][j]);
			}
		}
	}
}
