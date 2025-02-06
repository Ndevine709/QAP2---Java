public class MyLine {
    // Attributes
    private MyPoint begin;
    private MyPoint end;

    // Constructors, methods, getters & setters
    public MyLine(int x1, int x2, int y1, int y2) {
       this.begin = new MyPoint(x1, y1);
       this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

   public MyPoint getBegin() {
       return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX () {
        return begin.getX();
    }

    public void setBeginX (int x) {
        begin.setX(x);
    }

    public int getBeginY () {
        return begin.getY();
    }

    public void setBeginY (int y) {
        begin.setY(y);
    }

    public int getEndX () {
        return end.getX();
    }

    public void setEndX (int x) {
        end.setX(x);
    }

    public int getEndY () {
        return end.getY();
    }

    public void setEndY (int y) {
        end.setY(y);
    }

    public int[] getBeginXY () {
        int a[] = new int[2];
        a[0] = this.begin.getX();
        a[1] = this.begin.getY();
        return a;
    }

    public void setBeginXY (int x, int y) {
        this.begin.setXY(x, y);
    }

    public int[] getEndXY () {
        int a[] = new int[2];
        a[0] = this.end.getX();
        a[1] = this.end.getY();
        return a;
    }

    public void setEndXY (int x, int y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient () {
        int x1 = begin.getX();
        int y1 = begin.getY();
        int x2 = end.getX();
        int y2 = end.getY();
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;
        return Math.atan2(yDiff, xDiff);
    }

    public String toString () {
        return ("Begin = " + this.begin + "," + "End = " + this.end);
    }
}
