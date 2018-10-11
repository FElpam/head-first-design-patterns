package factory.simplefactory;

public interface Shape {
    ShapeType getShapeType();
    default void draw(){
        System.out.println("Draw a " + getShapeType());
    }
}
