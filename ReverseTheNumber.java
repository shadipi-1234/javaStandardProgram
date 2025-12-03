package standard_program;

public class ReverseTheNumber {
	
	public static void main(String[] args) {
		long num = 1243;
		long rev;
		System.out.println("before reversing the number: "+num);
		System.out.print("revrsing the given number: ");
		while(num!=0)
		{
			rev = num %10;
			System.out.print(rev);
			num= num/10;
			
		}
	}

}
