package factory.simplefactory;

public class Rectangle implements Shape {
    @Override
    public ShapeType getShapeType() {
        return  ShapeType.RECTANGLE;
    }
}
