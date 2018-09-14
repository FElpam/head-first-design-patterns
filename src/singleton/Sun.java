package singleton;

public class Sun {
    private static Sun theSun;
    private int brightness;
    private Sun(int brightness){
        this.brightness = brightness;
    }
    public static Sun getInstance(){
        if (theSun == null){
            theSun = new Sun(100);
        }
        return theSun;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void printBrightness(){
        System.out.println(brightness);
    }
}
