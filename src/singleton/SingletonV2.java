package singleton;

public class SingletonV2 {
    private static SingletonV2 theSingle;
    private SingletonV2(){}
    // 优点：增加了synchronized，使得多个线程无法同时执行该方法
    // 缺点：第一次初始化完之后，仍然需要阻塞执行。
    public static synchronized SingletonV2 getInstance(){
        if (theSingle == null){
            // 多线程同时进入到这里时，会生成多个Singleton实例
            theSingle = new SingletonV2();
        }
        return theSingle;
    }
}
