import java.util.Scanner;
public class Fizz_buzz {
	
	
	public static void modfizzbuzz(int start,int end)
	{
		int fizzy=0,buzzy=0,fizzybuzzy=0;
		
		if(start > end)
		{
			int temp = start;
			start=end;
			end=temp;
		}
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
			if(i%3==0 && i%5!=0)
			{
				fizzy+=1;
				if(fizzy == 3)
				{
					fizzy=0;
					System.out.println("Fizzy");
				}
				else
				{
					System.out.println("Fizz");
				}
			}
			else if(i%5==0 && i%3!=0)
			{
				buzzy+=1;
				if(buzzy == 3)
				{
					buzzy =0;
					System.out.println("Buzzy");
				}
				else
				{
					System.out.println("Buzz");
				}
			}
			else if(i%5==0 && i%3==0)
			{
				fizzybuzzy+=1;
				if(fizzybuzzy == 4)
				{
					fizzybuzzy =0;
					System.out.println("FizzyBuzzy");
				}
				else
				{
					System.out.println("FizzBuzz");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int fizzy=0,buzzy=0,fizzybuzzy=0;
	
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			if(i%3==0 && i%5!=0)
			{
				fizzy+=1;
				if(fizzy == 3)
				{
					fizzy=0;
					System.out.println("Fizzy");
				}
				else
				{
					System.out.println("Fizz");
				}
			}
			else if(i%5==0 && i%3!=0)
			{
				buzzy+=1;
				if(buzzy == 3)
				{
					buzzy =0;
					System.out.println("Buzzy");
				}
				else
				{
					System.out.println("Buzz");
				}
			}
			else if(i%5==0 && i%3==0)
			{
				fizzybuzzy+=1;
				if(fizzybuzzy == 4)
				{
					fizzybuzzy =0;
					System.out.println("FizzyBuzzy");
				}
				else
				{
					System.out.println("FizzBuzz");
				}
			}
		}
		
		/*FizzBuzz upgrade */
		
		int start,end;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Starting number : ");
		start = scn.nextInt();
		System.out.println("Enter the Ending number : ");
		end = scn.nextInt();
		modfizzbuzz(start,end);
		
	}

}
