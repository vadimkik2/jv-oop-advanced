package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculate() + " sq.units"
                + ", radius: " + getRadius() + " units"
                + ", color: " + getColor());
    }
}