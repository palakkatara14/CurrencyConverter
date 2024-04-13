import java.util.*;

public class CurrencyConverter{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        // Take input from the user
        System.out.print("Enter the amount to convert: ");
        double amount = sc.nextDouble();

        //fixed conversion rate
        double exchangeRate = 0.85;

        // Display the result
        System.out.println(amount + " USD is equivalent to " + (amount * exchangeRate) + " EUR");

        
    }
}