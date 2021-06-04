package Exercises;

import java.util.Scanner;

import static java.lang.System.out;

public class Intro {
    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);
        boolean inMain = true;
        while (inMain) {
            out.println("(I)ntro (C)ourses (E)xit");
            switch (scanner.next()) {
                case "I":
                case "i":
                    out.println("안녕하세요! 우리는 코드잇입니다.");
                    out.println("함께 공부합시다!");
                    break;
                case "C":
                case "c":
                    boolean inCourse = true;
                    while (inCourse) {
                        out.println("코드잇 수업을 소개합니다.");
                        out.println("(P)ython (J)ava (i)OS (B)ack");
                        switch (scanner.next()){
                            case "p":
                            case "P":
                                out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                        "강사: 강영훈\n" +
                                        "추천 선수과목: 없음");
                                break;
                            case "j":
                            case "J":
                                out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                        "강사: 김신의\n" +
                                        "추천 선수과목: Python");
                                break;
                            case "i":
                            case "I":
                                out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                        "강사: 성태호\n" +
                                        "추천 선수과목: Python, Java");
                                break;
                            case "b":
                            case "B":
                                inCourse = false;
                                break;
                            default:
                                out.println("다시 입력해주세요.");
                                break;
                        }
                    }
                    break;
                case "e":
                case "E":
                    out.println("안녕히 가세요.");
                    inMain = false;
                    break;
                default:
                    out.println("다시 입력해주세요.");
                    break;
            }
        }
    }
}
