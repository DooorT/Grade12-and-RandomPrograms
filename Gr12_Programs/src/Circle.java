import java.util.Scanner;
public class Circle 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a radius: ");
		int radius = input.nextInt();
		for(int i = 0; i < 22; i++)
		{
			for(int j = 0; j < 22; j++)
			{
				if((i*i) + (j*j) < (radius*radius))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}
	}//end main
}//end class