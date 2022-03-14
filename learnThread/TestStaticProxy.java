package learnThread;

/**
 * 静态代理模式：
 * 真实对象和代理对象都要实现同一个接口
 * 代理对象要代理真实角色
 * 
 * 好处：
 * 代理对象可以做很多真实对象做不了的事情
 * 真实对象可以专注做自己的事情
 * */

public class TestStaticProxy {
    public static void main(String[] args) {
//        You you = new You();
//        WeddingCompany weddingCompany = new WeddingCompany(you);
//        weddingCompany.happyMarry();
        new WeddingCompany(new You()).happyMarry();
    }
}

interface Marry{
    void happyMarry();
}

// 真实角色
class You implements Marry{
    @Override
    public void happyMarry() {
        System.out.println("happy");
    }
}

// 代理角色
class WeddingCompany implements Marry{
    // 代理谁 -> 真是目标角色
    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}