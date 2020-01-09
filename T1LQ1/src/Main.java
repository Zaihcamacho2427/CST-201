import java.util.Random;

public class Main {

	public static void main(String[] args) {

		//int array to hold 100 values
		int intArray[] = new int[100];
		
		//random number generator for values between 0-99
		Random rnd = new Random();
		
		//while i is less than array length
		for (int i = 0; i < intArray.length; i++) {
			//populate value at that spot in the array with a random number from the random number generator
			intArray[i] = rnd.nextInt(100);
			System.out.print(intArray[i] + " ");
		}
		
		int highest = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			
			if (intArray[i] > highest) {
				highest = intArray[i];
			}
			
		}
		System.out.println();
		System.out.println("The highest number is: " + highest);
	
	}
	
	

}
