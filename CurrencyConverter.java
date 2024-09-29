import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the from currency (USD, EUR, JPY, INR): ");
        String fromcurrency = scanner.next().toUpperCase();

        System.out.print("Enter the to currency (USD, EUR, JPY, INR): ");
        String tocurrency = scanner.next().toUpperCase();

        // Conversion rates (adjust as needed)
        double conversionRate = 0.0;

        switch (fromcurrency) {
            case "USD":
                if (tocurrency.equals("INR")) conversionRate = 85.0;
                else if (tocurrency.equals("EUR")) conversionRate = 0.90;
                else if (tocurrency.equals("JPY")) conversionRate = 135.0;
                break;
            case "EUR":
                if (tocurrency.equals("USD")) conversionRate = 1.11;
                else if (tocurrency.equals("INR")) conversionRate = 94.0;
                else if (tocurrency.equals("JPY")) conversionRate = 149.0;
                break;
            case "JPY":
                if (tocurrency.equals("USD")) conversionRate = 0.0074;
                else if (tocurrency.equals("EUR")) conversionRate = 0.0067;
                else if (tocurrency.equals("INR")) conversionRate = 6.30;
                break;
            case "INR":
                if (tocurrency.equals("USD")) conversionRate = 0.0118;
                else if (tocurrency.equals("EUR")) conversionRate = 0.0106;
                else if (tocurrency.equals("JPY")) conversionRate = 16.13;
                break;
            default:
                System.out.println("Invalid currency.");
                return;
        }

        if (conversionRate != 0.0) {
            System.out.println(amount + " " + fromcurrency + " = " + (amount * conversionRate) + " " + tocurrency);
        }
    }
}