package factory.simplefactory;

public class SimpleFactoryDemo {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape(ShapeType.CIRCLE);
        s1.draw();

        Shape s2 = factory.getShape(ShapeType.SQUARE);
        s2.draw();

        Shape s3 = factory.getShape(ShapeType.RECTANGLE);
        s3.draw();
    }
}
