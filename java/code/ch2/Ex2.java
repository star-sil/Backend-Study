package ch2;

public class Ex2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int tmp = 0;
        String t;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);
    }
}
