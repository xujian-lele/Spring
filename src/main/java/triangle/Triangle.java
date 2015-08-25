package triangle;

/**
 * Created by xujian on 2015/8/25.
 */
public class Triangle {
    private Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void drawPoint(){
        System.out.println(point.toString());
    }
}
