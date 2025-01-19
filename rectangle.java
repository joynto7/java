import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,w, area;
        System.out.print("Enter the Length:");
        l = input.nextDouble();
        System.out.print("Enter the Width:");
        w = input.nextDouble();
        area = l*w ;
        System.out.println("The area of circle is :"+ area);
    }
}