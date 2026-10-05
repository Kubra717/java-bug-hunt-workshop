class Point {
    int x, y;
    Point(int x, int y) { 
        this.x = x; 
        this.y = y; 
    }
    /* equals() checks getClass() == getClass() */ }

class ColorPoint extends Point { 
    ColorPoint(int x, int y, String color) { 
        super(x, y); this.color = color; 
    }
    String color;
}


public class Example12 {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        ColorPoint cp = new ColorPoint(1, 1, "red");
        p.equals(cp); // ?
        cp.equals(p); // ?
    }
    
}
