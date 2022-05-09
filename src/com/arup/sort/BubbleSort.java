package com.arup.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] i = {3,7,8,1,2,5};
		bubbleSort(i);
		Util.printArray(i);
	}
	
	/**
	 * Bubble Sort
	 * Time Complexity is O(n^2)
	 * @param input
	 */
	public static void bubbleSort(int[] input){
		for(int i=0;i<input.length-1;i++){
			for(int j=0;j<input.length-1-i;j++){
				if(input[j]>input[j+1]){
					//Swap values
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	}

}
