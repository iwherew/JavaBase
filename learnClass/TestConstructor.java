package learnClass;

/**
 *  构造器
 *  1、通过new关键字调用
 *  2、构造器虽然有返回值，但是不能定义返回值类型（返回值类型肯定是本类）
 *     不能在构造器里使用return返回某个值
 *  3、如果我们没有定义构造器，则编译器会自动定义一个无参的构造函数。
 *     如果已定义则编译器不会自动添加
 *  4、构造器的方法名字必须和类名一致
 * */

class Point {
    double x,y;

    public Point(double _x, double _y){
        x = _x;
        y = _y;
    }


    public double getDistance(Point p){
        return Math.sqrt((x - p.x)*(x - p.x) +  (y - p.y)*(y - p.y));
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0,0.0);

        System.out.println(p.getDistance(origin));
    }
}
