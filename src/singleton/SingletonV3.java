package singleton;

public class SingletonV3 {
    private static SingletonV3 theSingle = new SingletonV3();
    private SingletonV3(){}

    // 由于实例已经创建，所以getInstance里面不需要再调用构造函数了
    public SingletonV3 getInstance(){
        return theSingle;
    }
}
