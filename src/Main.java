import com.Calculator.Round;
import com.Calculator.Square;
import com.Calculator.Triangle;

public class Main {
    public static void main(String[] args) {
        Square squ =new Square();
        Round round = new Round();
        Triangle tri = new Triangle();

        squ.setHeight(5);
        squ.setWeight(10);
        round.setRadius(7);
        tri.setBase(10);
        tri.setHeight(5);

        System.out.println(squ.calculateAreaSqu());
        System.out.println(round.calculateAreaRou());
        System.out.println(tri.calculateAreaTri());





    }
}