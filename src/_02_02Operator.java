public class _02_02Operator {
    public static void main(String[] args) {

//        삼항 연산자 : 조건식의 결과가 true면 앞의 값, false면 뒤의 값 선택
//        (조건식) ? 참일 때 값 : 거짓일 때 값;
        int num1 = 1;
        int num2 = 2;
        int age = 26;

//        나이 판별: age가 20 이상이면 "성인", 아니면 "미성년자"를 변수에 저장
        String resultStr = (age >= 20) ? "성인" : "미성년자";

//       숫자 비교: num1이 num2보다 크면 num1, 아니면 num2를 선택
        int result = (num1 > num2) ? num1 : num2;

        System.out.println(result); // 2
        System.out.println(resultStr); // 성인

        System.out.println((15 >= 20) ? "성인" : "미성년자"); // 직접 값을 넣어 거짓 케이스 확인
    }
}
