// QAP 2 - Advanced Programming (Java)
// Author - Noah Devine
// Due - February 13th

public class MyRectangle {
    // Attributes
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors 
    public MyRectangle (MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Methods, getters & setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public int getTopLeftX () {
       return topLeft.getX();
    }

    public int getTopLeftY () {
        return topLeft.getY();
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public int getBottomRightX () {
        return bottomRight.getX();
    }

    public int getBottomRightY () {
        return bottomRight.getY();
    }

    public void setTopLeftXY(int x, int y) {
        this.topLeft.setXY(x, y);
    }

    public void setTopLeftX (int x) {
        this.topLeft.setX(x);
    }

    public void setTopLeftY (int y) {
        this.topLeft.setY(y);
    }

    public void setBottomRightXY(int x, int y) {
        this.bottomRight.setXY(x, y);
    }

    public void setBottomRightX (int x) {
        this.bottomRight.setX(x);
    }

    public void setBottomRightY (int y) {
        this.bottomRight.setY(y);
    }

    public int getWidth () {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight () {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea () {
        return getWidth() * getHeight();
    }

    public int getPerimeter () {
        return 2 * (getWidth() + getHeight());
    }

    public String toString () {
        return ("Rectangle: " + " " + "Top Left = " + this.topLeft + " " + "Bottom right = " + this.bottomRight);
    }
}
