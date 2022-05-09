package com.arup.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] i = {7,8,3,1,2};
		insertionSort(i);
		Util.printArray(i);
	}
	
	public static void insertionSort(int[] input){
		for(int i=1;i<input.length;i++){
			int current = input[i];
			int j = i-1;
			while(j>=0 && current<input[j]){
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = current;
		}
	}

}
