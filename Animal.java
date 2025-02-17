//Write a java program to create an abstract class Animal with the Abstract method sum, create subclasses lion and tiger that extends the Animal class and implement the sound method to make a specific sound for each animal?

abstract class Animal {
    public abstract void sum();
       public static void main(String[] args) {
           Lion obj=new Lion();
           obj.sum();
           obj.sound();
       }
    }
class Lion extends Tiger{
    public void sum(){
        System.out.println("This is Animal in Lion");
    }
    public void sound(){
        System.out.println("This is lion's sound");
    }
}

class Tiger extends Animal{
                                                                                                                            
    public void sum(){
        System.out.println("This is Animal in Tiger");
    }
    public void sound(){
        System.out.println("This is lion's Tiger");
    }
}