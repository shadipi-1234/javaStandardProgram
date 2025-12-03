package standard_program;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	
	long num = 1221;
	long rev =0;
	long collecting_reverse_num = 0 ;
	long num2 = num;
	while(num!=0)
	{
		 rev = num %10;
	     collecting_reverse_num = collecting_reverse_num*10 +rev;
		num= num/10;
		
	}
	if(num2 == collecting_reverse_num)
	{
		System.out.println(num2+" is palindrome number");
	}


	}
	
}
