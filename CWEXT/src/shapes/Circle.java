package shapes;

public class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return radius * Math.PI;
    }

    @Override
    double area() {
        return 34;
    }
}
