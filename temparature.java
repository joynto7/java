import java.util.Scanner;

public class temparature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels,fahren;
        System.out.println("Celsius:");
        cels = input.nextDouble();
        fahren = 1.8 * cels + 32 ;
        System.out.println("Fahrenheit:"+fahren);
    }
    
}