//Referencing as a instance method=>Method referencing
interface abc{
    void say();
}

public class Method_referencing {
    public static  void show(){
        System.out.println("This is Main Method");
    }
    public static void main(String[] args) {
        System.out.println("Hii");
        abc obj= Method_referencing::show;//interface object=Containing class :: reference static class
        obj.say();
    }
}
