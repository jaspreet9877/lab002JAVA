class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public int getSides() {
        return 4;
    }
}
