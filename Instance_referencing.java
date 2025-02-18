//Referencing as a instance method=>Method referencing

interface abc {
    void say();
}
public class Instance_referencing {

    // Instance method
    public void show() {
        System.out.println("This is Instance Method");
    }

    public static void main(String[] args) {
        System.out.println("Hii");

        // Create an instance of the containing class (Method_referencing)
        Instance_referencing objRef = new Instance_referencing();

        // Interface reference pointing to the instance method using the object
        abc obj = objRef::show;  // instance method referencing
        obj.say();
    }
}
