import java.util.Scanner;
public class strmethods {
    public static void main(String args[]) {
        String name="Rosalin";
        int n = name.length();
        String a = name.toLowerCase();
        String b = name.toUpperCase();
     System.out.println(n);
      System.out.println(name.replace('s', 'j'));
      System.out.println(name.replace("lin", "pin"));
        System.out.println(name.substring(3));
         System.out.println(name.startsWith("Pos"));
         System.out.println(name.endsWith("rin"));
         System.out.println(name.endsWith("lin"));
         System.out.println(name.charAt(3));
         System.out.println(name.indexOf("i"));
         System.out.println(name.equalsIgnoreCase("rosalin"));
     System.out.println(a);
     System.out.println(b);

    }   
}
