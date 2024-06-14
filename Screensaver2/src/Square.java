import java.util.Random;

public class Square extends Rectangle{
    private int size;
    private Random r = new Random();

    public Square(int Size){
        super(size,size);
        this.size=size;
    }

    public Square() {

        this.size=super.r.nextInt(91)+10;
    }
}