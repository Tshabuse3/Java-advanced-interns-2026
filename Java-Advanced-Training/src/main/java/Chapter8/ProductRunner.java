package Chapter8;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 **/
public class ProductRunner {
    static void main() {
        try {
            Product objProduct = new Product("code1234", "microwave", 500, 5);

            objProduct.increasePrice(1);
            objProduct.sell(2);
            System.out.println(objProduct);
        } catch (IllegalArgumentException | LowStockException | HighPriceIncreaseException ex) {
            System.err.println(ex.getMessage());
        }
    }

}