package main.java.challenge;

public class mergesort {
/*
	 Functionality to merge sorted arrays
	 MergeSort (myArray){
	 	if(myArray.length == 1){
	 		return myArray;
	 	}
		 leftHalf = MergeSort (left half of myArray)
		 rightHalf = MergeSort (right half of myArray)
		 
		 resultArray = myArray.length
		
		Sort both halves {
			2 cursors
			for each new element, 
				add the smallest cursor element to the result array,
				iterate the used cursor,
				until one of the halves has been fully used
			result array
			Once one  side of the merge has been expended, 
				we iterate through the remaining half and add all of the elements
			
		
		}
		
	 }
	*/ 
	
	public static int[] combineArrays(int[] a, int[] b) {
		int[] newArr = new int[a.length + b.length];
		
		int cursorA = 0;
		int cursorB = 0;
		
		while(cursorA < a.length && cursorB < b.length) {
			if(a[cursorA] < b[cursorB]) {
				newArr[cursorA + cursorB] = a[cursorA];
				System.out.println("Adding " + a[cursorA] + " from array left");
				cursorA++;	
			} else {
				newArr[cursorA + cursorB] = b[cursorB];
				System.out.println("Adding " + b[cursorB] + " from array right");
				cursorB++;
			}
		}
		
		while(cursorA < a.length) {
			newArr[cursorA + cursorB] = a[cursorA];
			System.out.println("Adding " + a[cursorA] + " from array A");
			cursorA++;
		}
		
		while(cursorB < b.length) {
			newArr[cursorA + cursorB] = b[cursorB];
			System.out.println("Adding " + b[cursorB] + " from array B");
			cursorB++;
		}
		
		return newArr;
	}
	
	public static int[] mergeSort(int[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int[] leftHalf = new int[arr.length/2];
		
		// so that odd numbered lengths have the right size
		int[] rightHalf = new int[arr.length - arr.length/2];
		
		for(int i = 0; i < arr.length/2; i++) {
			// TODO: copy left half over
			leftHalf[i] = arr[i];
		}
		for(int j = arr.length/2; j < arr.length; j++) {
			// TODO: copy right half over
			rightHalf[j-arr.length/2] = arr[j];
		}
		
		
		System.out.println("Starting sort on left half");
		printIntArr(leftHalf);
		leftHalf = mergeSort(leftHalf);
		
		System.out.println("Starting sort on right half");
		printIntArr(rightHalf);
		rightHalf = mergeSort(rightHalf);
		
		int[] merged = combineArrays(leftHalf, rightHalf);
		
		return merged;
		
	}
	
	public static void printIntArr(int[] arr) {
		for(int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {0,2,4,6,8};
		int[] b = {1,3,5,7,9};
		
		// int[] result = combineArrays(a, b);
		int[] result = mergeSort(new int[] {9,2,7,8,6,4,3,2,1,8});
		
//		for(int r:result) {
//			System.out.print(r + ", ");
//		}
		printIntArr(new int[] {9,2,7,8,6,4,3,2,1,8});
		System.out.println("result");
		printIntArr(result);
	}
}
