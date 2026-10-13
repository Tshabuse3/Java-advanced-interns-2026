package Chapter8;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 * <ol>
 *     <li>A product description should be at least 5 characters long</li>
 *     <li>Price cannot be negative or zero</li>
 *     <li>Quantity to sell cannot be more than quantity in stock</li>
 *     <li>Price increase should be less than R10</li>
 * </ol>
 **/
public class Product {
    private String code, description;
    private double price;
    private int qtyInStock;

    public Product(String code, String description, int qtyInStock, double price) {
        setCode(code);
        setDescription(description);
        setQtyInStock(qtyInStock);
        setPrice(price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Seth the description of the product
     * @param description
     * @throws IllegalArgumentException when a product description is less than 5
     */
    public void setDescription(String description)throws IllegalArgumentException{
        if (description.length() < 5) {
            throw new IllegalArgumentException("Description should be at least 5 characters long."
                    + "\n description: [" + description + "]");
        }

        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    /**
     * Sells the product by substractin the requested quantity from the current quantity in stock
     * @param qtyToSell Requested quantity to sell
     * @throws LowStockException When the requested quantity is more than the available quantity in stock
     */
    public void sell(int qtyToSell) throws LowStockException{
   if(qtyToSell > qtyInStock){
       throw new LowStockException("Not enough quatity to sell " + getDescription() +
               "\nCurrent Qty In Stock: "+  getQtyInStock() +
               "\nRequested Qty to sell: "  + qtyToSell);
   }

    }

    /**
     * Increase the Product by a Percentage
     * @param percentage Percentage to increase the price by
     * @throws HighPriceIncreaseException When the price increase is more or equal to 10
     */
    public void increasePrice(double percentage) throws HighPriceIncreaseException{
        double increase = this.price * (percentage / 100);
        if(increase >=10){
            throw new HighPriceIncreaseException("The price increase on " + getDescription() +
                    " is too high [" + increase + "]" +
                    "/nIncrease should be less than 10.00");
        }
        this.price += increase;
    }

    @Override
    public String toString() {
        return String.format("""
                ==========Product Details for %s [%s] ======
                Code          :   %s
                Description   :  %s
                Price         :   %.2f
                Qty in stock  : %d""", getDescription(), getCode() ,getDescription() ,getPrice() ,getQtyInStock());
    }

    }

