package com.arup.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] i = {3,7,8,1,2,5};
		insertionSort(i);
		Util.printArray(i);
	}

	/**
	 * Insersion Sort
	 * Time Complexity in (n^2) 
	 * @param input
	 */
	public static void insertionSort(int[] input){
		int smallestIndex;
		for(int i=0;i<input.length;i++){
			smallestIndex = i;
			for(int j=i+1;j<input.length;j++){
				if(input[j]<input[smallestIndex]){
					smallestIndex = j;
				}
			}
			//swap values
			int temp = input[i];
			input[i] = input[smallestIndex];
			input[smallestIndex] = temp;
		}
	}
}
