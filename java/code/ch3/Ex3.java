package ch3;

public class Ex3 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); //int 보다 작은 자료형이기 때문에 int로 형변환 된다.
        System.out.println(c);
    }
}
