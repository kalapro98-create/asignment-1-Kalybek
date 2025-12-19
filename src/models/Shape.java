package models;
import java.util.ArrayList;
public class Shape{
    public boolean avarage;
    private ArrayList<Point> arr = new ArrayList<>();
    public void addPoint(Point p1) {
        arr.add(p1);
    }
    public double calculatePerimeter() {
        if (arr.size()<2){
            return 0;
        }
        double num1=0;
        for (int i=0;i<arr.size();i++){
            Point a=arr.get(i);
            Point b;
            if(i==arr.size()-1){
                b=arr.get(0);
            }
            else{
                b=arr.get(i+1);
            }
            num1+=a.distance(b);
        }
        return num1;
    }
    public double avarage(){
        if(arr.size()<2){
            return 0.0;
        }
        else{
            return calculatePerimeter()/arr.size();
        }
    }
    public double getLongest(){
        if (arr.size()<2){
            return 0;
        }
        double num2=0;
        for (int i=0;i<arr.size();i++){
            Point a=arr.get(i);
            Point b;
            if(i==arr.size()-1){
                b=arr.get(0);
            }
            else{
                b=arr.get(i+1);
            }
            double num3=a.distance(b);
            if(num3>num2){
                num2=num3;
            }
        }
        return num2;
    }
}
