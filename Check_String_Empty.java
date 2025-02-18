//Write a java program to check string is empty or not using lambda expression
import java.util.function.*;
public class Check_String_Empty {
    public static void main(String[] args) {
        Predicate<String> isEmpty=str->str.isEmpty();
        String s1="";
        String s2="Hello";
        System.out.println("String 1: "+isEmpty.test(s1));
        System.out.println("String 1: "+isEmpty.test(s2));
    }
}
