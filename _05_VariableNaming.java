package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 민줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 민줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가(public, static, void, int double, float ....)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "태호"; // 이름
        String lastName ="최태호"; // 성명
        String dateOfBirth = "1993-10-29"; // 생년월일
        String residentalAddress = "OO 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국묵적
        String flightNo = "KE644"; // 항공편명
        String _flightNo = "KE645"; // 항공편명
        String flight_no_2 = "KE888"; // 항공편명
//        String -flightNo = "KE665";

        int accompany = 2;// 동반 가족수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "노트북";
//        Sting 3item = "술";

        // 프로로그램의 흐름을 위해 사용되는 경우 등 (크게 중요하지 않을때)
        int i = 0;
        String s = "";
        String str ="";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
// 1:33:17까지
