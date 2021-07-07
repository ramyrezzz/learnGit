/*
        Calculate Circle Area using Java Example
        This Calculate Circle Area using Java Example shows how to calculate
        area of circle using it's radius.
*/
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CalculateCircleAreaExample {
 
	public static void main(String[] args) {
		  
		// Code review added here :D
		int radius = 0;
		System.out.println("Please enter radius of a circle");
	   
		try {
			//get the radius from console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			radius = Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException ne | IOException ioe) {
			//if invalid value was entered	
			System.out.println("Invalid radius value+Florin_commitIncremeent" + ne + "posible conflict situation: Florin:commitincrement");
			System.exit(0);
		}
	   
		/*
		 * Area of a circle is
		 * pi * r * r
		 * where r is a radius of a circle.
		 */
	   
		//NOTE : use Math.PI constant to get value of pi
		double area = Math.PI * radius * radius;
	   
		System.out.println("Area of a circle is " + area);
		System.out.println("Calculating area using a method" + areaOfTheCircle(area));
	}

	public double areaOfTheCircle(double areaLocal){
		return areaLocal;
	}
}//a simple comment in a java class
