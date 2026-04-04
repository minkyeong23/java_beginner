public class IfElse03 {
    public static void main(String[] args) {

        int age = 20;
/**      [다중 조건문 :if - else if - else]
 *         위에서 부터 순차적으로 조건을 검사하며,
 *         하나라도 참(true)이 나오면 해당 블록을 실행하고 조건문 종료 */

        if (age >= 80) {
            // 80세 이상일 때 실행
            System.out.println("노년");
        } else if (age >= 60) {
            // 80세 미만이면서 60세 이상일 떄
            System.out.println("중년");
        } else if (age >= 19) {
            // 60세 미만이면서 19세 이상일 때 (현재 age = 20 이므로 실행)
            System.out.println("청년(성인)");
        }
        else {
            // 위의 모든 조건이 거짓일 때 실행 (나머지 케이스)
            System.out.println("미성년자");
        }
    }
}
