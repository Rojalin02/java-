import java.util.Scanner;
public class prac3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kilometers: ");
        double km = sc.nextInt();
        double miles = km * 0.6213;
        System.out.println("the distance in miles: "+miles);

    }
}
