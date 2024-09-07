package com.huajieyu.pricinples.demo2.Lishi.after;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testRectangle() {
        System.out.println("rectangle**********************************************");
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8);
        rectangle.setWidth(4);
        printRectangle(rectangle);

        System.out.println("resize-------------------------------");
        resize(rectangle);
        printRectangle(rectangle);

        System.out.println("square**********************************************");
        Square square = new Square();
        square.setSide(8);
        printRectangle(square);

        System.out.println("resize-------------------------------");
//        resize(square);
        printRectangle(square);
    }

    public static void resize(Rectangle rectangle) {

        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printRectangle(Quadrilateral quadrilateral) {
        System.out.println("length\t:[\t" + quadrilateral.getLength() + "\t]");
        System.out.println("width\t:[\t" + quadrilateral.getWidth() + "\t]");
    }
}
