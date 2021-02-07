/* 
 * Jake Coombes
 * 9/18/2018
 * Lab2b Acceleration:
 * This code calculates the change in velocity and acceleration of a 2015 Ferrari 488 GTB.
 */

public class Acceleration 
{
	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		
		int vInital=0, vFinal=60;
		double time=(3.0/360.0), vChange, acceleration;
		
		vChange = vFinal - vInital;
		acceleration = vChange/time;
		
		System.out.println("Your accleration is " + acceleration + "mph^2");	
	

	}
}
