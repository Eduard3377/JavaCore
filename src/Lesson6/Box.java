package Lesson6;

public class Box {
    double width;
    double depth;
    double height;

    Box(double w, double d, double h) {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        this.width = w;
        this.depth = d;
        this.height = h;
    }

    double volume() {
        return width * depth * height;

    }
}
