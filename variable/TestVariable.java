package variable;

/**
 * 测试变量
 * */

public class TestVariable {

    // 2、成员变量（实例变量）
    // 从属于对象
    // 实例变量会自动初始化
    // int 0
    // double 0.0
    // char '\u0000'
    // boolean false
    int memberVariable;

    // 3、静态变量（类变量）
    // 生命周期伴：类加载到卸载
    static int staticVariable;

    public static void main(String[] args){
        int age;
        age = 18;
        int salary = 3000;

        // 未声明不能用，声明后没有初始化也不能用
//        int wang;
//        System.out.println(wang);

        // 1、局部变量
        // 局部变量在作用域外部不能访问
        // 局部变量不会自动初始化
//        {
//            int localVariable;
//        }
//        System.out.println(localVariable);
    }
}
