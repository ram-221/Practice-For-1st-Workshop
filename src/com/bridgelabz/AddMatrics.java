package com.bridgelabz;

public class AddMatrics {

	public static void main(String args[]) {
		
		int row=2,colum=3;
		int [][] firstMatrix= {{2,3,4},{5,2,3}};
		int [][] secondMatrix= {{-4,5,3},{5,6,3}};
		
		int[][]  sum = new int [row][colum];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
			}
		}
		
		System.out.println("Sumof Two matrix is: ");
		for(int[] rows : sum) {
			for(int colums : rows) {
				System.out.print(colums+" ");
			}
			System.out.println();
		}
	}
}
