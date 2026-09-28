public class SalesTax {
    static void main() {
        double purchasePrice = 5;
        double SALES_TAX = 0.05;
        double computedTax;
        double totalPrice;
        computedTax = purchasePrice * SALES_TAX;
        totalPrice = purchasePrice + computedTax;
        System.out.println("The price is " + purchasePrice + " and the computed tax is " + computedTax + ", so the total price is " + totalPrice);
    }
}
