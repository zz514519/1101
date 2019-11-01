import java.util.Scanner;

/**
 * Author : Zhang Zhe
 */
public class Test {
    public static void main(String[] args) {
        int num2 = 1;
        int sum = 0;
        System.out.println("请输入一个整数");
        Scanner  sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while(num1>0) {
            int value = num1;
                   num2=1;//将num2恢复初值
            while (value > 0) {
                num2 *= value;
                value--;
            }
            sum +=num2;
            num1--;
        }
        System.out.println(sum);
    }
}