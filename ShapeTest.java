public class ShapeTest{
       public static void main(String ...args){
              Shape rectangle = new Shape(4, 3);
              Shape square = new Shape(2);
              Shape circle = new Shape(6.2);
              System.out.printf("Area of rectangle is %d%n", rectangle.getAreaRectangle(rectangle.getLength(),rectangle.getWidth()));
              System.out.printf("Area of square is %d%n", square.getAreaSquare(square.getLength()));
              System.out.printf("Area of circle is %f%n", circle.getAreaCircle(circle.getRadius()));
        }
}