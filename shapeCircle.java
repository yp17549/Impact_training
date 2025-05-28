
class Shape {

    void attribiutes() {
        System.out.println("Color is RED.");
        System.out.println("Area  is 10.");
    }
}

class Circle extends Shape {

    void size() {
        System.out.println("Radius is 10.");
    }
}

public class shapeCircle {

    public static void main(String[] args) {
        Circle s = new Circle();
        s.attribiutes();
        s.size();

    }
}
