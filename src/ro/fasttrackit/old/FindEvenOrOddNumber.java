/*
  Even Odd Number Example
  This Java Even Odd Number Example shows how to check if the given
  number is even or odd.
*/
 
public class FindEvenOrOddNumber {
 
	public static void main(String[] args) {
		   
		//create an array 
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,12,11,15,23,100};
	   
		for(int i=0; i < numbers.length; i++){
			   
			/*
			 * use modulus operator to check if the number is even or odd. 
			 * If we divide any number by 2 and reminder is 0 then the number is
			 * even, otherwise it is odd.
			 */
			 
			 if(numbers[i]%2 == 0) {
				System.out.println(numbers[i] + " is even number.");
				System.out.println("Added new text here.");
				continue;
			 }
			System.out.println(numbers[i] + " is odd number.");
			System.out.println(numbers[i] + " is odd number.");
			System.out.println(numbers[i] + " is odd number.");
		}
	}	
	/// Add here some text. it might help later on.
}
