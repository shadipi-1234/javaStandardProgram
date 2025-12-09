package standard_program;

public class SpyNumber {

	public static void main(String[] args) {
		long num = 123;
		long temp = num;
		int sum = 0;
		int mul=1;
		while(num!=0)
		{
			long reminder = num%10;
			sum +=reminder;
			num/=10;
			
		}
		long temp2=temp;
		while(temp!=0)
		{
			long reminder2 = temp%10;
			mul *=reminder2;
			temp/=10;

		}
		if(sum ==mul)
		{
			System.out.println(temp2+" is a spy number");
		}
	}
}
