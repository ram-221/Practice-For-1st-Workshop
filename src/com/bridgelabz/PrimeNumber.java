package com.bridgelabz;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num=11;
		int count=0;
		if(num <= 1) {
			System.out.println("The Nuber is Not prime");
			return;
		}
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
			count++;
			}
		}
		if(count >1) {
			System.out.println("number os not prime");
		}
		else {
			System.out.println("number is prime");
		}
	}

}
