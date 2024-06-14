import java.lang.annotation.Retention;
import java.awt.*;

//Atributos
public class Rectangle extends Shape {
    private int width;
    private int heigth;


    // Construtores
        public Rectangle(){
            this.width = super.r.nextInt(91)+10;
            this.heigth = super.r.nextInt(91)+10;

        }

        public Rectangle (int width, int heigth){
            this.width=width;
            this.heigth=heigth;
        }

        public Rectangle(Color color, int x, int y, int speedX, int speedY, int width, int heigth){
            super(color,x,y,speedX,speedY);
            this.width=width;
            this.heigth=heigth;

        }

    // Metodos
    public void draw (Graphics g){

            g.setColor(super.getColor());
            g.fillRect(super.getX(),super.getY(),this.width,this.heigth);
    }

    @Override
    public void move (int screenWidth, int screenHeigth){
            super.move(screenWidth,screenHeigth);

            //treatment collision
            if(super.getX()>0 || super.getX()+this.width>screenWidth)
                super.setSpeedX(super.getSpeedX()*-1);

        if(super.getX()>0 || super.getY()+this.width>screenWidth)
            super.setSpeedX(super.getSpeedX()*-1);

    }
    // Getters & Setters


    // toString()

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                '}'+
                super.toString();

    }

}
