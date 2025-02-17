//write a java program to create a class called dog with instance var name and color implement a parameterized constructor that takes name and color as parameter and initializes instance variable print the value of the variable?

class Dog{
    String name,color;
    Dog(String x, String y){
        this.name=x;
        this.color=y;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Dog obj=new Dog("Amit", "Green");
    }
}
