import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        // Constructors testing
        MyLine l1 = new MyLine(2, 4, 6, 8);
        System.out.println(l1);
        
        MyPoint begin1 = new MyPoint(3, 6);
        MyPoint end1 = new MyPoint(5, 8);

        MyLine l2 = new MyLine(begin1, end1);
        System.out.println(l2);

        // Public methods testing
        System.out.println(l1.getBegin());

        l1.setBegin(begin1);

        System.out.println(l1);

        System.out.println(l1.getEnd());

        l1.setEnd(end1);

        System.out.println(l1);

        System.out.println(l1.getBeginX());

        l1.setBeginX(2);

        System.out.println(l1);

        System.out.println(l1.getBeginY());

        l1.setBeginY(6);

        System.out.println(l1);

        System.out.println(l1.getEndX());

        l1.setEndX(4);

        System.out.println(l1);

        System.out.println(l1.getEndY());

        l1.setEndY(9);

        System.out.println(l1);

        System.out.println(Arrays.toString(l1.getBeginXY()));

        l1.setBeginXY(3, 6);

        System.out.println(l1);

        System.out.println(Arrays.toString(l1.getEndXY()));

        l1.setEndXY(5, 10);

        System.out.println(l1);

        System.out.println(l1.getLength());

        System.out.println(l1.getGradient());

        System.out.println(l1.toString());

        




    }
}
