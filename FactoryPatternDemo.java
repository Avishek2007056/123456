public class FactoryPatternDemo {
    public static void main(String[] args) {
        //ShapeFactory shapeFactory = new ShapeFactory();
        ShapeFactory f1 = ShapeFactory.getInstance();
        ShapeFactory f2 = ShapeFactory.getInstance();
        Shape shape1 = f1.getShape("SQUARE");shape1.draw();
        Shape shape2 = f2.getShape("RECTANGLE");shape2.draw();
        System.out.println("hashcode of shape1: " + f1.hashCode());
        System.out.println("hashcode of shape2: " + f2.hashCode());
    }
}
