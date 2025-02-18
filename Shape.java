abstract class Shape{
    public abstract void calculateArea();
    public abstract void calculateParameter();
    public static void main(String[] args) {
        Circle obj =new Circle();
        obj.calculateArea();
    }
}

class Circle extends Shape{
   public void calculateArea(){
    System.out.println("Area of Circle");
   }
   public void calculateParameter(){
    System.out.println("Area of Circle");
}
}
class Triangle extends Shape{
    public void calculateParameter(){
        System.out.println("Area of Triangle");
    }
    public void calculateArea(){
        System.out.println("Area of Tringle");
       }
}
