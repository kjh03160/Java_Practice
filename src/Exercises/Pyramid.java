package Exercises;

import static java.lang.System.*;
public class Pyramid {
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++){
            for (int j = 0; j < height - i - 1; j ++ ){
                out.print(' ');
            }
            for (int k = 0; k <= i * 2; k++){
                out.print('*');
            }
            out.println();
        }
        // 코드를 입력하세요.
    }

    public static void main(String[] args) {
        Pyramid printer = new Pyramid();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }
}
