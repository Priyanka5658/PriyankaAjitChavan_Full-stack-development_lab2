package com.greatlearning.driver;
import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.NotesCount;

public class Main {
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("enter size of currency denomination");
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
			}
		System.out.println("enter amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes,amount);
		
	}

}
