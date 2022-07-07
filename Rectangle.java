public class Rectangle {
    private double length, width;

    public Rectangle() {
        setLength(0);
        width = 0;
    }

    public void setLength(double length1) {
        length = length1;
    }

    public void setWidth(double width1) {
        width = width1;

    }

    public Rectangle(double l, double w) {
        setDimension(l, w);
    }

    public void setDimension(double l, double w) {
        if (l >= 0)
            setLength(l);
        else
            setLength(0);
        if (w >= 0)
            setWidth(w);
        else
            width = 0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double perimeter() {
        return getLength() * getWidth();
    }

    public String toString() {
        return ("Length = " + length + "; Width = " + width);
    }

}
