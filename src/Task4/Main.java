package src.Task4;

public class Main {
    public static void main(String[] args) {
        //Test the getArea-methods
        Circle c1 = new Circle(10);
        System.out.println(c1.getArea()); //should give approx. 314.16

        Square sq1 = new Square(15);
        System.out.println(sq1.getArea()); //should give 225

        //create more shapes
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(17);
        Square sq2 = new Square(10);
        Square sq3 = new Square(7);

        //Test ShapeBuilder class
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(c2);
        shapeBuilder.addShape(c3);
        shapeBuilder.addShape(sq1);
        shapeBuilder.addShape(sq2);
        shapeBuilder.addShape(sq3);

        System.out.println("\nTotal area of all added shapes is: " + shapeBuilder.getTotalArea());
    }
}
