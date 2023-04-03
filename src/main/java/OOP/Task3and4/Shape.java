package OOP.Task3and4;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    abstract void getArea();

    abstract void getPerimeter();

    public String toString() {
        if (isFilled == true) {
            return "The shape has and is filled with " + color + " color.";
        } else {
            return "The shape has " + color + " color and colorless inside";
        }
    }
}
