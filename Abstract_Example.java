abstract class Rabbit {
    public abstract void animalSound();
        public void sleep(){
            System.out.println("Hello");
        }
    }
     
    class Abstract_Example extends Rabbit{
        @Override
        public void animalSound(){
            System.out.println("Rabbit Class");
        }
        public static void main(String[] args){
            Abstract_Example obj=new Abstract_Example();
           obj.animalSound();
           obj.sleep();
        }
    }

