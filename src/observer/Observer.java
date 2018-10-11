package observer;

public interface Observer {
    // 用该函数传递观察到的参数
    public void update(double temperature, double humidity, double pressure);
}
