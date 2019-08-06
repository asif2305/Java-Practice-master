import java.util.Scanner;




public class SepbAssignment1 {
		
	public static int binarySearchRecursive(int[] array, int x, int left, int right) {
		
		if(left > right) {
			return left;
		}
		
		int mid = (left + right)/2;
		
		if(array[mid] == x) {
			return mid;
		}
		else if(x < array[mid]) {
			return binarySearchRecursive(array, x, left, mid-1);
		}
		else {
			return binarySearchRecursive(array, x, mid+1, right);
		}			
	}
	
	
	public static String getNearestValue(int[] array, int input ,int index) {
		
		String result="";
		
		if(input == array[index]) {
			result = "The value " + input + " is available in array and its position is " + index;
		}
		else {
			
			int prevValDistance, nextValDistance;
			
			prevValDistance = input - array[index - 1];
			
			nextValDistance = array[index] - input;
			
			if(nextValDistance > prevValDistance) {
				result = "The nearest value is " + array[index - 1] + " and the position is " + (index - 1);
			}
			else {
				result = "The nearest value is " + array[index] + " and the position is " + index;
			}			
		}
				
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int[] myArray = {1,3,5,7,13,16,19,21,23,25,26,28,30,36,39,42,44,46,48,50}; 
		
		/**
		 * If you want to give your own input value,
		 * please comment out below lines
		 */		
		
//		int[] myArray = new int[20];
		
//		System.out.println("Enter Numbers for array: ");
//		
//		for(int i = 0; i<20; i++) {
//			Scanner GetNum = new Scanner(System.in);
//			int number = GetNum.nextInt();
//			myArray[i] = number;
//		}
		
		int testCase=1;
		
		while(testCase <= 5) {
			
			System.out.println("Test Case " + testCase + " -> Enter the finding number: ");
			
			Scanner findingValue = new Scanner(System.in);
			int input = findingValue.nextInt();
			
			// check the last array index if you change
			if(input <= myArray[19] && input > 0) {    
				
				int left = 0;
				int right = myArray.length;

				int midValue = binarySearchRecursive(myArray, input, left, right);
			
				String output = getNearestValue(myArray, input, midValue);
			
				System.out.println(output + "\n");
			}
			else {
				System.out.println("Your finding value is out of boundary of array\n");
			}
			
			testCase++;
		}
				
	}
}
