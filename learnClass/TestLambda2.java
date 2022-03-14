package learnClass;

public class TestLambda2 {
    public static void main(String[] args) {
        ILove love = new Love();
        love.love(1);

//        ILove love2 = (int a) -> {
//            System.out.println("love" + a);
//        };

        // 简化1：简化参数类型
//        ILove love2 = (a) -> {
//            System.out.println("love" + a);
//        };

        // 简化2：只有一个参数时，简化括号
//        ILove love2 = a -> {
//            System.out.println("love" + a);
//        };

        // 简化3：执行体只有一条语句，简化花括号
        ILove love2 = a -> System.out.println("love" + a);
        love2.love(2);
    }
}

interface ILove{
    void love(int a);
}

class Love implements ILove{

    @Override
    public void love(int a) {
        System.out.println("i love you " + a);
    }
}