import java.math.*;
public class PI 
{
	public static void main(String[] args)
	{
		double sum = 0;
		double pi = 0;
		int s = 2;
		for (int i = 1; i < 1000000000; i = i+2) {
			sum = sum + 1 / ((Math.pow(-1, s)) * i);
			s++;
		}
		sum = 4 * sum;
		System.out.printf("PI is: %.10f",sum);
	}
}
