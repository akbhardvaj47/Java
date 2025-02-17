//Write a java program to create a class vehicle with a method drive create a  subclass called car that override drive to print repairing a car?
class Drive{
    public void drive(){
        System.out.println("Driving the car");
    }
}
public class Vehicle extends Drive{

    public void drive(){
        super.drive();  //Calling drive method of Drive car
        System.out.println("Repairing a Car");
    }
    public static void main(String[] args) {
        Vehicle obj=new Vehicle();
        obj.drive();
    }
}
