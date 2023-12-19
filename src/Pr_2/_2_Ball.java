package Pr_2;

public class _2_Ball {

    private double x = 0.0;
    private double y = 0.0;

    _2_Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    _2_Ball(){ }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY (double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){

        this.x = xDisp + this.x;
        this.y = yDisp + this.y;
    }
    public String toString(){
        return "Местоположение мяча: (" + x +"," + y + ")";
    }
}
