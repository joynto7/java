import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r , area;
        System.out.print("Enter the radius:");
        r = input.nextDouble();
        area = 3.1416 * r * r ;
        System.out.println("The area of circle is :"+ area);
    }
}
