import java.util.*;
/** 
 * Java区分大小写
 * @author pengc
 *
 */
public class Welcome //public访问修饰符(access modifier);关键字 class表明 Java程序中的全部内容都包含在类中;骆驼命名法
{
   public static void main(String[] args)
   {
      String greeting = "Welcome to Core Java!"; /*char 数据类型是一个采用 UTF-16 编码表示 Unicode 码点的代码单元。*/
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)	//四种整数类型：byte,int.short,long
         System.out.print("=");
      final double unchanged = 7.20;	// final指常量，只被赋值一次；两种浮点类型，float，double;
      double x = 9.997;
      int nx = (int)Math.round(x); //nx = 10:改成(int)x为9
      String word = "\uD835\uDD46";	//"𝕆" 这个数学符号码点 为U+1D546 在Java中的代码单元为  U+D835 和U+DD46
      System.out.println("\n" + "字符为："+word + " String.length(): "+ word.length()); //字符为：𝕆 String.length(): 2
      
      StringBuilder builder = new StringBuilder();
      builder.append("ch");
      builder.append("str");
      String completedString = builder.toString();
      System.out.println(completedString);
      
      Scanner in = new Scanner(System.in); // get first input
      System.out.printf("What is your name? ");
      String name = in.nextLine();// get second input
      System.out.print("How old are you? ");
      int age = in.nextInt();	// display output on console;
      System.out.println("Hello, " + name + ", Next year, you'll be " + (age + 1));
      
      double y = 10000.0 / 3.0;
      System.out.printf("%8.2f", y); //3333.33,用8个字符的宽度和小数点后两个字符的精度
      
      // scanner读写文件
      
      Scanner timeward = new Scanner(System.in);	
      String times = timeward.nextLine();
      System.out.println('\n');
      System.out.println(times);
   }
}

