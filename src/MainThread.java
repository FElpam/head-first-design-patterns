import singleton.Sun;

public class MainThread {
    public static void main(String[] args){
        testSingleton();
    }

    public static void testSingleton(){
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        sun1.printBrightness();
        sun2.printBrightness();
        System.out.println(sun1 == sun2);
        sun1.setBrightness(150);
        sun2.printBrightness();
    }
}
