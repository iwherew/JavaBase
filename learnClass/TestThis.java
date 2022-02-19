package learnClass;

// this 不能用在static方法里

public class TestThis {
    int a,b,c;

    TestThis(int a, int b){
        this.a = a;
        this.b = b;
    }

    TestThis(int a, int b, int c){
//        this.a = a;
//        this.b = b;
        this(a,b); // 必须放在第一句
        this.c = c;
    }

    void sing(){
        System.out.println("sing");
    }

    void eat(){
//        this.sing();
        sing(); // 都可以
        System.out.println("eat");
    }

    public static void main(String[] args) {
        TestThis tt = new TestThis(2,3);
        tt.eat();
    }
}
