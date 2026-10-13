package Chapter8;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 * Thrown when a {@code Product} has a low quantity in stock
 **/
public class LowStockException  extends Exception{
public LowStockException(String message){
    super(message);

}

}
