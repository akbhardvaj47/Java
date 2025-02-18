//Reference as a constructor=>Method referencing

interface abc{
    void say(String msg);
}
class A{
    A(String s){
        System.out.println(s);
    }
}

public class Constructor_referencing {
    public static void main(String[] args) {
        abc obj=A::new;
        obj.say("Hello");
    }
}
