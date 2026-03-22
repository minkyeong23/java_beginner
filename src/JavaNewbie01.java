public class JavaNewbie01 {

//    main 넣기
    public static void main(String[] args) {
//       변수 : 값을 저장하는 이름 (age, name)
//       자료형: int (숫자,정수), String (문자열)
        int age = 77;
        String name = "자바 처음";

//      double : 소숫점 있는 숫자 (실수) 저장
        double money = 10.2385;

        System.out.println("hello java");

//       + : 값(문자열, 숫자 등)을 이어줌
        System.out.println(30 + 20);
        System.out.println("30" + 20);
        System.out.println(age + "살이고 " + name + "입니다");

//       %d가 (정수) , %s (문자열) 그 뒤 변수(age, name)와 순서 맞춰 넣기 / println과 달리 (,) 로 연결
        System.out.printf("%d살이고 %s입니다\n", age, name);

//        %f :실수 출력 / %.2f 소숫점 둘째 자리까지 출력 (반올림)
        System.out.printf("%.2f원", money);


    }

}