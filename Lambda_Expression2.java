interface abc{
    public void say();
}

public class Lambda_Expression2 {
    public static void main(String[] args){
        System.out.println("Hii");
        abc obj=()->{
            System.out.println("you are in Lucknow");
        };
        obj.say();
    }
}
