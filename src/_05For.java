public class _05For {
    public static void main(String[] args) {
        int sum =  0;
/**       for문 for(초기값; 조건식; 증감연산자) { 반복할 내용 }
 *        1. 시작 숫자 정하기 i = 1; 2. 언제까지 할지 정하기 i <= 9; 3. 하나씩 키우기 또는 줄이기 i++, i--
 */

//        구구단 2단 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(" 2 * " + i + " = " + (2 * i));
        }
//        1부터 10까지 더하기
        for (int j =  1; j <= 10; j++) {
            sum += j;
//            반복마다 현재까지 합계 출력
            System.out.println("현재 합계: " + sum);
        }
//        최종 결과 한 번만 출력 for문 바깥
        System.out.println("1부터 10까지 전부 더하면: " + sum);
    }
}
