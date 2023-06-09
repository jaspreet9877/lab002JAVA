public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(5, 6);
        System.out.println("The area of the RECTANGLE is " + R1.getArea());
        System.out.println("I have " + R1.getSides() + " sides");

        Square S1 = new Square(5);
        System.out.println("The area of the SQUARE is " + S1.getArea());
        System.out.println("I have " + S1.getSides() + " sides");
    }
}