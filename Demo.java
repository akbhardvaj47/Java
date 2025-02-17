public class Demo {

    public static void student(String name, int Roll_no){
        System.out.println(name);
        System.out.println(Roll_no);
    }
    
    public static void student(int Roll_no, String name){
        System.out.println(name);
        System.out.println(Roll_no);
    }

    public static void main(String[] args){
        student(4, "Amit");
        student("Amit", 4);
    }
}
