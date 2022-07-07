
public class Box extends Rectangle {
    private double height;

    public Box() {
        setLength(0);
        setWidth(0);

        height = 0;
    }

    public Box(double l, double w, double h) {
        setLength(l);
        setWidth(w);
        height = h;
    }

    public void setDimension(double h) {
        if (h >= 0)
            height = h;
        else
            height = 0;

    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return getLength() * getWidth();
    }

    public double volume() {
        return height * getLength() * getWidth();
    }

    public String toString() {
        return ("Length = " + getLength() + "; Width = " + getWidth() + "; Height = " + height);
    }

}
