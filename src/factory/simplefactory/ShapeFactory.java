package factory.simplefactory;

public class ShapeFactory {
    public Shape getShape(ShapeType type){
        Shape shape = null;
        switch(type){
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }

}
