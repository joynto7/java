import java.util.Scanner;

public class assinoprerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int x , y ;
         System.out.print("Enter the value of x :");
         x = input.nextInt();
         System.out.print("Enter the value of y :");
         y = input.nextInt();

         x+=y; // x = x + y 
        System.out.println("x = "+x);
         x-=y; // x = x - y 
         System.out.println("x = "+x);
         x*=y; // x = x * y 
         System.out.println("x = "+x);
         
         x/=y; // x = x / y 
         System.out.println("x = "+x);

         x%=y; // x = x % y 
         System.out.println("x = "+x);


         
    }
}
