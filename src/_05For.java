public class _05For {
    public static void main(String[] args) {
        int sum =  0;

//        구구단 2단 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
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
