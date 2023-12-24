/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		
		int FirstSIde = Integer.parseInt(args[0]);
		int SecondSIde = Integer.parseInt(args[1]);
		int ThirdSIde = Integer.parseInt(args[2]);
		
		boolean Check1 = ((FirstSIde + SecondSIde) > ThirdSIde);
		boolean Check2 = ((FirstSIde + ThirdSIde) > SecondSIde);
	    boolean Check3 = ((ThirdSIde + SecondSIde) > FirstSIde);
		
		boolean Final = (Check1 && Check2 && Check3);
		
		System.out.println(FirstSIde + ", " + SecondSIde + ", " + ThirdSIde + ": " + Final); 
	
	}
}
