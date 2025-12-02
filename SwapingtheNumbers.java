package standard_program;

public class SwapingtheNumbers {
	



	
		
//		without using third variable
//		public static void main(String[] args) {
//			int a = 10;
//			int b= 20;
//			System.out.println("Before swaping the value of a = "+a+"and b = "+b);
//			 a=a+b;
//			 b=a-b;
//			 a=a-b;
//			System.out.println("After swaping the value of a = "+a+"and b = "+b);		 
//		}
		
//		using method and third variable
		public static void swapingMethod(int a, int b)
		{
			int temp = a;
			a= b;
			b=temp;
			System.out.println("After swaping the value of a = "+a+"and b = "+b);		 
			
		}
		public static void main(String[] args) {
			int a= 23;
			int b= 54;
			System.out.println("Before swaping the value of a = "+a+"and b = "+b);
			swapingMethod(a, b);
		}

}

