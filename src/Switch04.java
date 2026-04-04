public class Switch04 {
    public static void main(String[] args) {
        String medal = "은메달";

//         switch는 medal에 담긴 값을 기준으로 일치하는 case를 찾음
        switch (medal) {
//             금메달이 medal 안에 담긴 것이냐 물어봄
            case "금메달":
//               case "금메달"이 medal에 담긴 것이 맞다면 1등 출력
                System.out.println("1등");
                break;

//                medal 안에 "은메달"과 일치 -> 2등 출력
            case "은메달":
                System.out.println("2등");
//                break : 실행 후 종료하고 switch 종료
//                여기서 중단, break가 없다면 아래 case까지 전부 출력(fall-through)
                break;

//                break로 인해 아래 case는 실행되지 않음
            case "동메달":
                System.out.println("3등");
                break;

//                어떤 case와도 일치하지 않을 경우 실행
            default:
                System.out.println("참가상");
        }

    }
}
