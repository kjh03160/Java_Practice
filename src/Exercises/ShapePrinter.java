package Exercises;

import static java.lang.System.*;

public class ShapePrinter {
    public void printTriangle(int height) {
        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++) out.print("* ");
            out.println();
        }
    }

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printTriangle(3);
        out.println("----------");
        printer.printTriangle(5);
        out.println("----------");
        printer.printTriangle(10);
    }
}
