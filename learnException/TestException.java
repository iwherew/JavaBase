package learnException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestException {
    public static void main(String[] args) {

        // ArithmeticException: / by zero
        int a = 0;
        int b = 1;
        if(a != 0){
            System.out.println(b/a);
        }

        // NullPointerException
        String str = null;
        if(str != null){
            System.out.println(str.length());
        }

        // ClassCastException
        Animal d = new Dog();
        if(d instanceof Cat){
            Cat c = (Cat) d;
        }

        // ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        int index = 6;
        if(index < arr.length){
            System.out.println(arr[index]);
        }

        // NumberFormatException
        String str2 = "1234abcd";
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(str2);
        if(m.matches()){
            System.out.println(Integer.parseInt(str2));
        }
    }
}

class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
