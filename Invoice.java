public class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize the instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }

        if (pricePerItem < 0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Getters (optional)
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // toString method for displaying invoice details
    @Override
    public String toString() {
        return String.format("Part Number: %s%nPart Description: %s%nQuantity: %d%nPrice per Item: %.2f%nTotal Amount: %.2f",partNumber, partDescription, quantity, pricePerItem, getInvoiceAmount());
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Creating an Invoice object
        Invoice invoice = new Invoice("1234", "Widget", 5, 20.0);

        // Displaying the invoice details
        System.out.println(invoice);

        // Testing with negative values
        Invoice invalidInvoice = new Invoice("5678", "Gadget", -3, -10.0);
        System.out.println(invalidInvoice);
    }
}
