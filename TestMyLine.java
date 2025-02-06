import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        // Constructors testing.
        MyLine l1 = new MyLine(2, 4, 6, 8);
        System.out.println(l1);
        
        MyPoint begin1 = new MyPoint(3, 6);
        MyPoint end1 = new MyPoint(5, 8);

        MyLine l2 = new MyLine(begin1, end1);
        System.out.println(l2);

        // Public methods testing from top to bottom.
        // testing getBegin.
        System.out.println(l1.getBegin());

        // Testing setBegin.
        l1.setBegin(begin1);
        System.out.println(l1);

        // Testing getEnd.
        System.out.println(l1.getEnd());

        // Testing setEnd.
        l1.setEnd(end1);
        System.out.println(l1);

        // Testing getBeginX.
        System.out.println(l1.getBeginX());

        // testing setBeginX.
        l1.setBeginX(2);
        System.out.println(l1);

        // Testing getBeginY.
        System.out.println(l1.getBeginY());

        // Testing setBeginY.
        l1.setBeginY(6);
        System.out.println(l1);

        // Testing getEndX.
        System.out.println(l1.getEndX());

        // Testing setEndX.
        l1.setEndX(4);
        System.out.println(l1);

        // Testing getEndY.
        System.out.println(l1.getEndY());

        // Testing setEndY.
        l1.setEndY(9);
        System.out.println(l1);

        // Testing getBeginXY.
        System.out.println(Arrays.toString(l1.getBeginXY()));

        // Testing setBeginXY.
        l1.setBeginXY(3, 6);
        System.out.println(l1);

        // Testing getEndXY.
        System.out.println(Arrays.toString(l1.getEndXY()));

        // Testing setEndXY.
        l1.setEndXY(5, 10);
        System.out.println(l1);

        // Testing getLength.
        System.out.println(l1.getLength());

        // Testing getGradient.
        System.out.println(l1.getGradient());

        // Testing the toString method I had set.
        System.out.println(l1.toString());

        




    }
}
