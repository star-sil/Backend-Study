package ch4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        char gender;
        String regNo = "";
        System.out.println("당신의 주민번호를 입려갛세요.(011231-1111222)>");

        Scanner scanner = new Scanner(System.in);
        regNo = scanner.nextLine();

        gender = regNo.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
