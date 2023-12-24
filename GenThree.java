/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int Rnd1 =(int)(Math.random()*(b - a) + a);
		int Rnd2 =(int)(Math.random()*(b - a) + a);
		int Rnd3 =(int)(Math.random()*(b - a) + a);
		
		int minimum = Math.min(Rnd1, Rnd2);
		int Minimum = Math.min(minimum, Rnd3);
		
		System.out.println(Rnd1);
		System.out.println(Rnd2); 
		System.out.println(Rnd3); 



		System.out.println("The minimal generated number was " + Minimum); 
		

		
	}
}
