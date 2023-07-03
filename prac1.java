import java.util.Scanner;
public class prac1
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of five subjects: ");
        int m = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int sum = m+s+e+h+g ;
        int avg = sum/5;
        System.out.println("the percentage obtained: " +avg);
    }
}
