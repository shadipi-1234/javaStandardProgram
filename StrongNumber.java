package standard_program;

public class StrongNumber {

	public static void main(String[] args) {
		long num = 145;
		long sum =0;
		long temp = num;
		while (num!=0)
		{
			long reminder = num%10;
			int mul = 1;
			for(int i =1; i<=reminder; i++)
			{
				mul*=i;
				
			}
			sum+=mul;
			num/=10;
		}
		if (temp == sum)
		{
			System.out.println(temp+" is strong number");
		}
	}
}
