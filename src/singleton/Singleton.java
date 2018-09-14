/*
    #优点
    1. 确保全局资源只有一份，比如注册表设置（Registry settings）
    2. 与全局变量不同的是，不需要的时候可以不进行实例化

    #问题
    1. 多线程执行时，可能生成多个实例。
        a. 使用synchronized，见V2
        b. 直接在声明时初始化，见V3
        c. 使用volatile关键字，volatile可以确保每次使用的值都是最新的，见V4

 */

package singleton;

public class Singleton {
    private static Singleton theSingle;
    private Singleton(){}
    public static Singleton getInstance(){
        if (theSingle == null){
            // 多线程同时进入到这里时，会生成多个Singleton实例
            theSingle = new Singleton();
        }
        return theSingle;
    }
}

