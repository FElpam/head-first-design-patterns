package factory.simplefactory;

public class Square implements Shape {
    @Override
    public ShapeType getShapeType() {
        return ShapeType.SQUARE;
    }

}
