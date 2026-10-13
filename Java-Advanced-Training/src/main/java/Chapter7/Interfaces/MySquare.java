package Chapter7.Interfaces;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 **/
public class MySquare implements iShapeCalculation {

    private int side;

    public MySquare(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
    public void apply(){

    }
}
