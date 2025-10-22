package chapter6;

public class Box {
    double width;
    double height;
    double depth;

    class Stack {
        int stck;
        int tos;

        Stack() {

        }
    }

    Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    public Box(double w, double h, double d) {
    }


    double volume() {
        System.out.println("Oбъeм равен ");
        System.out.println(width * height * depth);
        return width * height * depth;
    }
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;


    }

}


