package learnClass;

/**
 * Lambda表达式
 * 当抽象类只有一个方式时，可用lambda简化
 * */

public class TestLambda {
    // 3、静态内部类
    static class Like2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("i like Lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        // 4、局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("i like Lambda3");
            }
        }

        like = new Like3();
        like.lambda();

        // 5、匿名内部类，没有类的名称，必须借助接口或者父类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like Lambda4");
            }
        };
        like.lambda();

        // 6、用lambda简化
        like = ()->{
            System.out.println("i like Lambda5");
        };
        like.lambda();
    }
}

// 1、定义一个函数式接口
interface ILike{
    void lambda();
}

// 2、实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("i like Lambda");
    }
}


