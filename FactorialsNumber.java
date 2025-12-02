package standard_program;


import java.util.Scanner;

public class FactorialsNumber {
	
//	using without method
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number to find the factorial : ");
		int num = sc.nextInt();
		int res = 1;
		if(num ==0)
		{
			System.out.println(num+"! factorial number is "+1);
		}
		for(int i= num ;i>=1;i--)
		{
		
		if(num>=i)
		{
			System.out.print(i);
			if(i!=1)
			{
				System.out.print("x");
			}
			
		}
		res*=i;
		}
		System.out.print("="+res);
	}

}
