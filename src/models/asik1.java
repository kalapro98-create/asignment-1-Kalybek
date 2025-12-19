package models;
import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class asik1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/models/source");

        Scanner sc = new Scanner(file);
        sc.useLocale(Locale.GERMANY);
        Shape shape = new Shape();

        while(sc.hasNextDouble()){
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            Point point=new Point(x,y);
            shape.addPoint(point);
        }

        System.out.println("Perimetr "+shape.calculatePerimeter());
        System.out.println("Longest "+shape.getLongest());
        System.out.println("Avarage "+shape.avarage());
    }
}

