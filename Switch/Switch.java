package ForWhileSwitch;

import java.util.Scanner;

//스위치 문의 조건식 결과는 정수 또는 문자열이여야만한다.
//case 문의 값은 정수 상수 문자열만 가능하다 변수x 중복또한 허용되지 않는다

public class Switch {
    public static void main(String[] agrs) {
        System.out.println("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); //입력받은 숫자를 변수  month 에 저장

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break; //345월일때 봄을 출력하고 다음 케이스 문으로 넘어가지 않기 위해 브레이크
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("현재의 계절은 겨울입니다.");
               //default 는 나머지 12 1 2 월이 입력됏을때의 출력값이고 스위치문의 마지막이므로 브레이크 필요없음
        }
    }
}
