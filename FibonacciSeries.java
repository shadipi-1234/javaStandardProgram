package standard_program;

public class FibonacciSeries {
	
//	printing fibonacci series without method
//	public static void main(String[] args) {
//		int num= 0;//0,1,1,2,3
//		int n = 7;
//		int term1 = 0;
//		int term2 =1;
				
//		for(int i= 1;i<=n;i++ ) {
			
//			System.out.print(term1+" ");
			
//			    int sum = term1+term2;
//			     term1=term2;
//			    term2 = sum;
//		}
//	}
	
//	printing fibonacci series with using method
	
	public static int fibSeries_method(int term)
	{
		if (term <=1)
		{
			return term;
		}
		return fibSeries_method(term-1)+fibSeries_method(term-2);
	}public static void main(String[] args) 
	{
		int n = 5;
		System.out.println("Fibonacci Series :- ");
		for(int i= 0;i<=n;i++)
		{
			System.out.print( fibSeries_method(i)+" ");
			
		}
	}

}
