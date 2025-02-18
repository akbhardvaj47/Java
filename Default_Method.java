//Java provides a facility to create a default method inside the interface.
//Method which are define inside the interface and tagged with default are known as default method.
//These method are not abstract method.

interface abc{
    default void say(){
        System.out.println("This is default method");
    }
}
public class Default_Method implements abc{
    public void show(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Default_Method obj=new Default_Method();
        // obj.show("This is show method");
        obj.say();
    }
}
