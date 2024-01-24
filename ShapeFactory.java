public class ShapeFactory {
    private static ShapeFactory ins = null;
    private ShapeFactory(){}

    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
    public static ShapeFactory getInstance()
    {
        if (ins == null)
            ins = new ShapeFactory();
        return ins;
    }
}