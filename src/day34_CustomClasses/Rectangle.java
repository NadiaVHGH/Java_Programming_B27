package day34_CustomClasses;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    public void calculatePerimeter(){
        perimeter = 2 * base + 2 * height;
    }

    public void calculateArea(){
        area = base * height;
    }

    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}

