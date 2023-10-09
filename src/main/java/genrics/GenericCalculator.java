package genrics;

public class GenericCalculator<L extends Number, R extends Number> {
    L x;
    R y;
    public GenericCalculator(L x, R y){
        this.x = x;
        this.y = y;
    }

    public void print(L x, R y){
        System.out.println(x + " " + y);
    }
}
