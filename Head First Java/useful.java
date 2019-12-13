// 布尔运算
public class Main
{
    public static void main(String[] args)
    {
    int age = 18;
        // primary student的定义: 6~12岁
        boolean  anwser = (6 <= age) && ( age <= 12);
        boolean isPrimaryStudent = anwser;
        System.out.println(isPrimaryStudent ? "Yes" : "No");  // 三元运算b ? x : y会首先计算b，如果b为true，则只计算x，否则，只计算y.
                                                              // 此外，x和y的类型必须相同，因为返回值不是boolean，而是x和y之一.
    }
}
