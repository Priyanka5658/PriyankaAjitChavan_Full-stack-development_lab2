package com.greatlearning.iir.dsa.labsession2;

import java.util.Scanner;

class Transaction {
	public static void main(String args[]) throws Exception{
		Scanner s = new Scanner (System.in);
		System.out.println("enter the size of transaction array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("enter values of array");
		for (int i =0; i < size; i++)
			arr[i] = s.nextInt();
		System.out.println("enter total number of targets that need to be acheived");
		int targetNo = s.nextInt();
		
		while (targetNo-- != 0) {
			int flag = 0;
			long target;
			System.out.println("enter values of target");
			target = s .nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target acheived after "+(i+1) + " transactions");
					flag = 1;
					break;
					
				}
			}
			if (flag== 0) {
				System.out.println("Target is not acheived");
			}
		}
	
	}

}
