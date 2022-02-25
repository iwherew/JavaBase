package learnException;

/**
 * 自定义异常
 * */

public class TestCustomException {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-8);
    }
}

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}

// RuntimeException 运行时处理异常
// Exception 编译处理异常（需要手动try-catch 或 throws）
class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(){

    }

    public IllegalAgeException(String msg){
        super(msg);
    }
}
