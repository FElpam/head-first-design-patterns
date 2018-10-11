package factory.simplefactory;

public class Circle implements Shape {
    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }

}
