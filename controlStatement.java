import java.util.Scanner;

public class controlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a num : ");
        num = input.nextInt();
        if(num>0){
            System.out.println(" You enter a Positive  Number");
        }else if (num == 0) {
            System.out.println("You enter Zero");
            
        }else{
            System.out.println("You enter a Negative number");
        }

     }

    }

