package standard_program;

import java.util.Random;
//import java.util.Scanner;

public class Positive_n_NegatativeNumber {
	
//	without using method and use scanner class
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter one number to check whether it is positive number and negative number");
//		
//		int a = sc.nextInt();
//		if (a<0)
//		{
//			System.out.println("======="+a+"is a negative number=====");
//		}
//		else
//		{
//			System.out.println("======="+a+"is a positive number=====");
//
//		}
//		
//	}

//	with using method and random class
	public static void pos_Neg(int a)
	{
		if (a<0)
			{
				System.out.println("======="+a+"is a negative number=====");
			}
			else
			{
				System.out.println("======="+a+"is a positive number=====");
	
			}		
	}
	public static void main(String[] args) {
		Random rn = new Random();
		int a= rn.nextInt();
		pos_Neg(a);
	}

}
