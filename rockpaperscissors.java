import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {
    public static void main(String args[]){
        int cr = 0;
        int cy = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number for as follows: \n rock : 0 \n paper : 1 \n scissors : 2");
            
         
       for(int i=0; i<3; i++)
       {
         int s = sc.nextInt();
        int r = rand.nextInt(3);
        System.out.println("Rose: " +r);
        if(s==r)
       System.out.println("draw");
       else
       {
        if(r==0 && s==1)
        System.out.println("you win");
        cy = cy+1;
         if(r==0 && s==2)
        System.out.println("rose won");
        cr =cr+1;
         if(r==1 && s==0)
        System.out.println("rose won");
        cr= cr+1;
         if(r==1 && s==2)
        System.out.println("you win");
        cy=cy+1;
         if(r==2 && s==0)
        System.out.println("you win");
        cy=cy+1;
         if(r==2 && s==1)
        System.out.println("rose won");
          cr = cr+1;
       }
       }
          if(cr>cy)
            System.out.println("rose is the winner.!");
            else
            System.out.println("you are the winner.!");
       }
    }
