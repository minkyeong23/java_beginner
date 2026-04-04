public class _02_01Operator {

    public static void main(String[] args) {
        int num = 10;

//        복합 대입 연산자
        num += 5; // 기존의 10에 5 더해져 15가 저장 됨
        System.out.println( "현재 num에 저장 된 값 : " + num);

        num -= 5; // 위의 코드에서 num 에 저장 된 15가 - 5 돼서 10 이 저장 됨
        System.out.println("현재 num에 저장 된 값 : " + num);

        num *= 2; // 위에서 num에 저장 된 10이 * 2 = 20 저장
        System.out.println("현재 num에 저장 된 값 : " + num);

        num /= 4; // 윗 줄에서 저장 된 20이 나누기(/) 4 해서 5가 됨
        System.out.println("현재 num에 저장 된 값 : " + num);

        num %= 5; // 저장 된 5의 나누기 5 의 나머지 값 0이 저장 됨
        System.out.println("현재 num에 저장 된 값 : " + num);

//        증감 연산자
        System.out.println(num++); // [후위] 현재 값 출력 후 1 증가 및 저장(현재 : 0)
        System.out.println(num); // 증가 된 값 1 출력 및 저장

        System.out.println(num--); // [후위] 윗 코드에서 저장 된 1 출력 후 다음부터 -1 감소 및 저장 (현재 : 1)
        System.out.println(num); // 0 출력 및 저장

        System.out.println(++num); // [전위] num++ 과 달리 현재 숫자 0에서 바로 +1 해서 출력 및 저장 ( 결과 : 1 )
        System.out.println(--num); // [전위] 위에서 저장 된 1에 이 줄에서 바로 -1  ( 결과 : 0 )
    }
}
