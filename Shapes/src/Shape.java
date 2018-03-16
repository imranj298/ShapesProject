import java.util.Scanner;
public class Shape {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Choose your shape:");
        System.out.println("(1)Triangle,(2)Rectangle/Square,(3)Circle");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Value for base:");
                Triangle.setBase(scan.nextDouble());
                System.out.println("Value for height:");
                Triangle.setHeight(scan.nextDouble());
                System.out.println("Here is your area:" +Triangle.getArea());
                break;
            case 2:
                System.out.println("Value for base:");
                Rectangle.setWidth(scan.nextDouble());
                System.out.println("Value for length:");
                Rectangle.setLength(scan.nextDouble());
                System.out.println("Here is your area:" +Rectangle.getArea());
                break;
            case 3:
                System.out.println("Enter a radius:");
                Circle.setRad(scan.nextDouble());
                System.out.println("All done! Here is your area:" +Circle.getArea());
                System.out.println("and your circumference:" + Circle.getCircum());
                break;
            default:
                System.out.println("Sorry, what?");
                break;
        }
    }
}
class Triangle{
    private static double base;
    private static double height;
    public static void setBase(double base){
        Triangle.base =base;
    }
    public static void setHeight(double height){
        Triangle.height=height;
    }
    public static double getArea(){
        return (base * height) / 2;
    }
}
class Rectangle{
    private static double width;
    private static double length;
    public static void setWidth(double width){
        Rectangle.width=width;
    }
    public static void setLength(double length){
        Rectangle.length=length;
    }
    public static double getArea(){
        return (width*length);
    }
}
class Circle{
    private static double radius;
    public static void setRad(double radius){
        Circle.radius=radius;
    }
    public static double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }
    public static double getCircum(){
        return 2*Math.PI*radius;
    }
}