import java.util.Scanner;
public class CalendarTest
{

	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);								
		System.out.print("Your weight(kg) is:"); 						
		int Weight = scanner.nextInt();
		
		System.out.print("Your height(m): "); 			
		float Height = scanner.nextFloat();
		
        double BMI = Weight / (Height*Height);
        System.out.printf("Your BMI is %.2f.\n",BMI);
        
        if (BMI > 32)
        {
        	System.out.println("You're very fat!");
        }
        else if (32 >= BMI && BMI >= 28)
        	{
        		System.out.println("You're very fat!");
        	}
        else if (28 > BMI && BMI >= 25)
        	{
        		System.out.println("You're too weight!");
        	}
        else if (25 > BMI && BMI >= 18.5)
        	{
        		System.out.println("You're fine!");
        	}
        				
        else if (18.5 > BMI ) 
        	{
        		System.out.println("You're too light!");
        	}
        else
        	{
        		System.out.println("wrong");
        	}
	}
}
