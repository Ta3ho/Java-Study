package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "최태호";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번에 시험에 합격했을까? " + pass);

        double d = 3.14123456789;
        float f = 3.141234556789F;

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;

        System.out.println(l);
    }
}
// int(21억), long, float(소수점7개), double, char, String, boolean
