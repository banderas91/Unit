
public class Calculator {
    public static double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments");
        }
        double discount = purchaseAmount * (discountPercentage / 100.0);
        return purchaseAmount - discount;
    }
}
