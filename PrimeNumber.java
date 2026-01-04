package standard_program;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 58;
		for(int i= 2 ;i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" is not a prime num and divisible by "+i);
			}
			
		}
		
		
	}

}
