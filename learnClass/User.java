package learnClass;

/**
 *  构造器重载
 * */

public class User {
    int id;
    String name;
    String password;

    public User(){

    }

   public User(int id, String name){
        super();    // 构造方法的第一句总是super(),不写也会自动生成
        this.id = id;
        this.name = name;
   }

   public User(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
   }

   public static void main(String[] args){
        User u1 = new User();
        User u2 = new User(101, "Amadeus");
        User u3 = new User(102, "iwhere", "1234");
   }
}
