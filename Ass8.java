import java.util.Scanner;
class Ass8
{
	public static void main(String[] args)
	{

		Scanner read=new Scanner(System.in);
		
		double num;

		do
		{
		 System.out.println("Please enter a number");
			while(!read.hasNextDouble())
			{
				System.out.println("Invalid Input ! Please enter a valid input");
				read.next();
			}
				num=read.nextDouble();
				System.out.println("The num is : "+num);
						
		}
		while(num<102);

		System.out.println("The char for this num is "+(char)num);

		read.close();

	}
}