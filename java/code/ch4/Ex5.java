package ch4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.println("점수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            } else {
                grade = 'C';
            }
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n",grade,opt);
    }
}
