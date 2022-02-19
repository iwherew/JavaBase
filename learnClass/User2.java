package learnClass;

/**
 *  测试static
 * */

public class User2 {
    int id;
    String name;
    String password;

    static String company = "rootnet";

    public User2(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void login(){
        System.out. println("login");
    }

    public static void printCompany(){
        // 调用非静态成员， 编译报错
//        login();
        System.out.println(company);
    }

    public void TestParamsTransFer(String name){
        name = "iwhere";
    }

    public static void main(String[] args) {
        User2 u = new User2(101, "amadeus");
        User2.printCompany();
        User2.company = "byteDance";
        User2.printCompany();
        u.TestParamsTransFer(u.name);
        System.out.println(u.name);
    }
}
