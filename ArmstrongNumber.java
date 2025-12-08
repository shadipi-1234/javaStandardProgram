package standard_program;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num = 153;
		int count = 0;
		int num2 = num;
		
		while(num!=0)
		{
			if(num %10!=0)
			{
				count++;
				num /=10;
			}
		}
		int temp = num2;
        int reminder;
		
		int sum =0;
		while(num2!=0)
		{   
			int x = 1;
			reminder = num2%10;
			for(int i =0; i<count;i++)
			{
				
				x = x*reminder;	

				
			}
			sum+=x;
			num2/=10;

		}
		if(sum == temp)
		{
			System.out.println(temp+"is a armstrong number");
		}
		
	}
		

}
