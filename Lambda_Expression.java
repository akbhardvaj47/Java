// Lambda Expression=>
//                    This is also known as anonymous function.
//                    It is not return type.
//                    ()->{System.out.print("Hello");

//                    Benefits=>It enables functional programming in java.
//                    It make the code more readable, reliable and concise.
//                    It enables Parallel programming.
interface Drawable{
    public void draw();
}
class Lambda_Expression{
    public static void main(String[] args) {
        int width=10;
        Drawable obj=new Drawable(){
            public void draw(){
                System.out.println("Width="+width);
            }
        };
        obj.draw();
    }
}

