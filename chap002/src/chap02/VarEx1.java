package chap02;
public class VarEx1 {
    public static void main(String[] args) {
        int year = 0; // 변수타입 변수이름 = 변수 초기화;
        int age = 14;
        System.out.println(year); // sysout == System.out.println(); 화면에 글자 출력
        System.out.println(age);
        year = age + 2000;
        age = age + 1;
        System.out.println(year);
        System.out.println(age);
    }
}