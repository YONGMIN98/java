package Study;

abstract class Player { //추상 클래스
    abstract void play(int pos); //추상 메서드(추상 메서드를 사용하려면 클래스도 반드시 추상
    abstract void stop(); // 추상 메서드(선언부만 있고 구현부{}가 없는 메서드
}
    //추상 클래스는 상속을 통해 완성해야 객체 생성 가능

class AudioPlayer extends Player {
    void play(int pos){System.out.println(pos+"위치부터 play합니다");}
    void stop(){System.out.println("재생이 멈춥니다");}
}
public class PlayerTest {
    public static void main(String[] args){
        //Player p = new Player(); 이렇게 사용하는 것은 위에 말했듯 상속을 받지 않았기에 객체생성 오류남
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}
