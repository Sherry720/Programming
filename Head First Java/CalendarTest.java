// 面向对象程序设计，即OOP
import java.time.*;
public class CalendarTest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// System.out.println(new Date());	// String s = new Date().toString(); 
										// Wed Jul 10 10:52:46 CST 2019
		LocalDate date = LocalDate.now();	//构建一个日历对象，今天是7.10
		int month = date.getMonthValue();	// month = 7
		int today = date.getDayOfMonth();	// today = 10
		
		date = date.minusDays(today -1);	// 将date设置为这个月第一天，即7.1日
		DayOfWeek weekday = date.getDayOfWeek();//weekday cannot be resolved to a variable
		int value = weekday.getValue();	// value = 1,周一
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i<value;i++)
			System.out.println("");	// 日历第一行空行直到第一天对应星期
		while (date.getMonthValue() == month)	//确定月份正确
		{
			System.out.printf("%3d", date.getDayOfMonth());	//整数占位宽度为3
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) System.out.println();
		
		}
		if (date.getDayOfWeek().getValue() != 1) System.out.println();
	}

}
