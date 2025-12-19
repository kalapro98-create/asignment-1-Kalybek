package models;
public class Point {
    private double x;
    private double y;
    public Point (double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point cor){
        double num2=Math.sqrt(Math.pow(this.x-cor.getX(),2)+Math.pow(this.y-cor.getY(),2));
        return num2;
    }
    public String toString(){
        return "( "+x+","+y+")";
    }
}


