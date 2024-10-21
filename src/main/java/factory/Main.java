package factory;

public class Main {
    public static void main(String[] args) {

        Shape shape = FactoryShape.shape(FactoryShape.Type.CIRCLE);
        System.out.printf(shape.draw());
    }
}
