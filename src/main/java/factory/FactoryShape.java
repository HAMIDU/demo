package factory;

public class FactoryShape {

    public static Shape shape(Type type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }

    public enum Type {
        CIRCLE,
        SQUARE,
        RECTANGLE
    }
}
