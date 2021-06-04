package Exercises;

import static java.lang.System.*;

public class FloidTriangle {

    public void printFloydsPyramid(int height) {
        int num = 1;

        int maxValue = height * (height + 1) / 2;
        int length = String.valueOf(maxValue).length();

        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++ ){
                int nowStringLength = String.valueOf(num).length();
                for (int k = nowStringLength; k < length; k++){
                    out.print(" ");
                }
                out.printf("%d ", num++);
            }
            out.println();
        }
    }

    public static void main(String[] args) {
        FloidTriangle printer = new FloidTriangle();

        // 테스트
        printer.printFloydsPyramid(3);
        out.println("----------");
        printer.printFloydsPyramid(5);
        out.println("----------");
        printer.printFloydsPyramid(15);
    }
}
