package Study;

public class composite1 {
    public static void main(String[] args){

        class Point{ //클래스 Point 생성
            int x;
            int y;
        }
        class Circle {
            Point c = new Point();//이렇게 위에 있는 Point 클래스에 있는 멤버를 참조변수로 선언하는것이 포함관계이다
            int r;
        }
    }
}
