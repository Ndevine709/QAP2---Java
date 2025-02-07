// QAP 2 - Advanced Programming (Java)
// Author - Noah Devine
// Due - February 13th

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint bottomRight = new MyPoint(2, 4);
        MyPoint topLeft = new MyPoint(4, 6);

        // Creating the rectangle with the constructor using the MyPoint objects.
        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        System.out.println("New rectangle: " + rectangle1);

        // Displaying the different methods, getters and setters.
        // Testing getTopLeft.
        System.out.println(rectangle1.getTopLeft());

        // Testing getTopLeftX
        System.out.println(rectangle1.getTopLeftX());

        // Testing getTopLeftY
        System.out.println(rectangle1.getTopLeftY());

        // Testing getBottomRight.
        System.out.println(rectangle1.getBottomRight());

        // Testing getBottomRightX
        System.out.println(rectangle1.getBottomRightX());

        // Testing getBottomRightY
        System.out.println(rectangle1.getBottomRightY());

        // Testing setTopLeftXY
        rectangle1.setTopLeftXY(8, 9);
        System.out.println(rectangle1);

        // Testing setTopLeftX
        rectangle1.setTopLeftX(1);
        System.out.println(rectangle1);

        // Testing setTopLeftY
        rectangle1.setTopLeftY(4);
        System.out.println(rectangle1);

        // Testing setBottomRightXY
        rectangle1.setBottomRightXY(6, 8);
        System.out.println(rectangle1);

        // Testing setBottomRightX
        rectangle1.setBottomRightX(5);
        System.out.println(rectangle1);

        // Testing setBottomRightY
        rectangle1.setBottomRightY(1);
        System.out.println(rectangle1);

        // Testing getWidth
        System.out.println(rectangle1.getWidth());

        // Testing getHeight
        System.out.println(rectangle1.getHeight());

        // Testing getArea
        System.out.println(rectangle1.getArea());

        // Testing getPerimeter
        System.out.println(rectangle1.getPerimeter());

        // Testing my toString method
        System.out.println(rectangle1.toString());
    }
}
