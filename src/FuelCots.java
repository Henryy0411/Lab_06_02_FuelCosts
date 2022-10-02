import java.util.Scanner;

public class FuelCots {
    public static void main(String[] args) {
        double gallons = 0;
        double fuel = 0;
        double price = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of gallon of ");
        gallons = in.nextDouble();
        in.nextLine();
        System.out.println("Enter number miles per gallon");
        fuel = in.nextDouble();
        in.nextLine();
        System.out.println("Enter your price per gallon");
        price = in.nextDouble();
        in.nextLine();

        if (gallons < 0 || fuel < 0 || price < 0) {
            System.out.println("You entered wrong number!");
        } else {
            System.out.println("Cost of 100 miles:" + ((100 / fuel) * price));
            System.out.printf("Car can go about %.2f miles", (fuel * gallons));
        }
    }
}
