package com.sorting;

public class MergeSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = {10, 5, 2, 0, 7, 6, 4};
		mergeSort(array, 0, array.length - 1);
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void mergeSort(int array[], int start, int end) {
		if(start>=end) {
			return;
		}
		int mid = (start + end)/2;
		mergeSort(array, start, mid);
		mergeSort(array, mid+1, end);
		merge(array, start, end);
		return;
	}
	public static void merge(int array[], int start, int end) {
		int result [] = new int[array.length];
		int mid = (start + end)/2;
		int i = start;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= end) {
			if(array[i] < array[j]) {
				result[k++] = array[i];
				i++;
			}
			else if(array[j] < array[i]) {
				result[k++] = array[j];
				j++;
			}
			else {
				result[k++] = array[i];
				i++;
				j++;
			}
		}
		while(i <= mid) {
			result[k++] = array[i++];
		}
		while(j <= end) {
			result[k++] = array[j++];
		}
		k = 0;
		for(int index = start;index <= end;index++) {
			array[index] = result[k++];
		}
		return;
	}
}
