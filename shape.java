class Shape{
    void displayShape(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{
    double radius;
    double area(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double length,width;
    double area(){
        return length*width;
    }
}
public class Test2{
    public static void main(String[]args){
        Circle c=new Circle();
        c.radius=5;
        c.displayShape();
        System.out.println("Circle Area:"+c.area());

        Rectangle r=new Rectangle();
        r.length=4;
        r.width=6;
        r.displayShape();
        System.out.println("Rectangle Area:"+r.area());
    }
}
