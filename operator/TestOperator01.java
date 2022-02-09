package operator;

/**
 * 算数运算符
 * */

/**
 *
 * 整数运算：
 *      1、如果两个操作数有一个为long，结果为long
 *      2、没有long时，结果为int。即使操作数全为short、byte，结果也是int
 *
 * 浮点运算：
 *      1、如果两个操作数有一个为double，结果为double
 *      2、只有两个操作数都是float，结果才为float
 *
 * */

public class TestOperator01 {
    public static void main(String[] args) {
        Long a = 2L;
        float b = 1.2F;
        System.out.println(a + b);
    }
}
