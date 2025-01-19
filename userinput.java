import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1, num2 , result;
        System.out.println("Enter First Number:");
        num1 = input.nextInt();
        System.out.println("Enter Second Number:");
        num2 = input.nextInt();


        result = num1 + num2 ;
        System.out.println("Sum = "+result);
        result = num1 - num2 ;
        System.out.println("Sub = "+result);
        result = num1 * num2 ;
        System.out.println("multi = "+result);
        result = num1 / num2 ;
        System.out.println("Divide = "+result);


    }
    
}
