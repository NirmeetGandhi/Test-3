interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        
        circle.draw();
        rectangle.draw();
    }
}
